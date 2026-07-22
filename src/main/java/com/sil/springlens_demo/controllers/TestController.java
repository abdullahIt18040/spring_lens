package com.sil.springlens_demo.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class TestController {


    @GetMapping("/hello")
    public String hello(){

        return "Spring Lens Running";

    }

}