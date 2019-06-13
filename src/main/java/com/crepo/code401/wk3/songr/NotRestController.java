package com.crepo.code401.wk3.songr;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NotRestController {

    @GetMapping("/notresthello")
    public String getNotRestHello() {
        String[] allTheNames = new String[];
        return "hello";
    }
}
