package com.example.demo.builder;

import com.example.demo.entity.MenuEntity;
import com.example.demo.model.Menu;
import org.springframework.stereotype.Component;

@Component
public class MenuBuilder {
    public MenuEntity convert(Menu menu){
        MenuEntity menuEntity = new MenuEntity();
        menuEntity.setPath(menu.getPath());
        menuEntity.setName(menu.getName());
        menuEntity.setTitle(menu.getTitle());
        return menuEntity;
    }
}
