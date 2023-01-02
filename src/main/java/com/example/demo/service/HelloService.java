package com.example.demo.service;

import com.example.demo.builder.MenuBuilder;
import com.example.demo.configuration.Receiver;
import com.example.demo.entity.MenuEntity;
import com.example.demo.exception.ProductNotfoundException;
import com.example.demo.model.Menu;
import com.example.demo.repository.MenuRepository;
import lombok.AllArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

import static com.example.demo.Constants.TOPIC_EXCHANGE_NAME;
@AllArgsConstructor
@Service
public class HelloService {
    private RabbitTemplate rabbitTemplate;
    private Receiver receiver;
    private MenuRepository menuRepository;
    private MenuBuilder menuBuilder;
    public void publishMenu(Menu menu) throws Exception {
        System.out.println("Sending message...");
        MenuEntity menuEntity = menuBuilder.convert(menu);
        menuRepository.save(menuEntity);
        rabbitTemplate.convertAndSend(TOPIC_EXCHANGE_NAME, "foo.bar.baz", menu.toString());
        receiver.getLatch().await(10000, TimeUnit.MILLISECONDS);
        throw new ProductNotfoundException();
    }
}
