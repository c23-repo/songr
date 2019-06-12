package com.crepo.code401.wk3.songr;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String getHelloWorld(){
        return "Hello, world!";
    }

    @GetMapping("/capitalize/{name}")
    public String capitalizeWord(@PathVariable String name){
        return  name.toUpperCase();
    }

    @GetMapping("/reverse")
    public String reverseSentence(@RequestParam String words){
        String[] sentence = words.split(" ");
        String outputString = "";

        for (int i = sentence.length - 1; i >= 0; i--){
            outputString = outputString + sentence[i] + " ";
        }

        return outputString;
    }
}
