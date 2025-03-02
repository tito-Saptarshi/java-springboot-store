package com.saptarshi.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// web controller for resaving web traffic
@Controller
public class HomeController {

    @Value("${spring.application.name}")
    private String appName;

    @RequestMapping("/")  // if any req goes to this page, the below function gets called / getting traffic to the provided url
    public String index() {
        System.out.println("appNamme : " + appName);
        return "index.html";
    }
}
