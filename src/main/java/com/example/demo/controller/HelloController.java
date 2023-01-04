package com.example.demo.controller;


import com.example.demo.configuration.Receiver;
import com.example.demo.configuration.WordPressProperties;
import com.example.demo.entity.MenuEntity;
import com.example.demo.model.Menu;
import com.example.demo.service.HelloService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@AllArgsConstructor
public class HelloController {

    private WordPressProperties wordPressProperties;
    private HelloService helloService;

    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!"+wordPressProperties.getMenus().get(0);
    }

    @PostMapping("/menu")
    public void createMenu(@RequestBody Menu menu) throws Exception{

        log.debug(menu.toString());
        helloService.publishMenu(menu);
    }
    @RequestMapping(value = "/products")
    public String getProductName() {
        return "Honey";
    }

}