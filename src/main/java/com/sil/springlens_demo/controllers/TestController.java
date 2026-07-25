package com.sil.springlens_demo.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class TestController {

    @GetMapping("/hello")
    public String hello(){
        return "Spring Lens Running";

    }


    @GetMapping("/info")
    public String info(){

        return "info ............";
    }

    @GetMapping("/info2")
    public String info2(){

        return "info 222222222222............";
    }

    @GetMapping("/info3")
    public String info3(){

        return "info 3333333333333333............";
    }
    @GetMapping("/info4")
    public String info34(){

        return "info 3333333333333333444444656666666............";
    }
    @GetMapping("/info4")
    public String info4(){

        return "info 3333333333333333............w444444444444444444";
    }


}