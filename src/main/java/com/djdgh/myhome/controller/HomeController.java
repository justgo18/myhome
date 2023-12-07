package com.djdgh.myhome.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping()
    public String index() {
        return "index"; // templates의 리턴 경로 지정
    }
}
