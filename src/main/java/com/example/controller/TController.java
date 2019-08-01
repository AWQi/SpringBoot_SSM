package com.example.controller;

import com.example.service.TService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TController {
    @Autowired
    private TService tService;

    @ResponseBody
    @RequestMapping("/test")
    public List t(){
        return tService.selectAll();
    }
    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}
