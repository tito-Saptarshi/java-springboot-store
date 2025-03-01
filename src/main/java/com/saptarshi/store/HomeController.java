package com.saptarshi.store;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// web controller for resaving web traffic
@Controller
public class HomeController {
    @RequestMapping("/")  // if any req goes to this page, the below function gets called / getting traffic to the provided url
    public String index() {
        return "index.html";
    }
}
