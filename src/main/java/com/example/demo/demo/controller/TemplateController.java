package com.example.demo.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Richel.yu
 * @Date: 2021/2/24 20:35
 */
@RestController
public class TemplateController {
    @GetMapping
    public String  index(){
       return "Hello";
    }
}
