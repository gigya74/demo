package com.example.demo.entity;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Menu")
public class MenuEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "name" ,nullable = false)
    private String name;
    @Column(name = "path")
    private String path;
    @Column(name = "title")
    private String title;


}
