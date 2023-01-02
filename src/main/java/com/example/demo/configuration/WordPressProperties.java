package com.example.demo.configuration;


import com.example.demo.model.Menu;
import com.example.demo.model.Server;
import com.example.demo.model.Theme;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;


import java.util.ArrayList;
import java.util.List;

@Data
@ConfigurationProperties("wordpress")
@Configuration
public class WordPressProperties {

    private List<Menu> menus = new ArrayList<>();
    private Theme themes;
    private List<Server> servers = new ArrayList<>();
}
