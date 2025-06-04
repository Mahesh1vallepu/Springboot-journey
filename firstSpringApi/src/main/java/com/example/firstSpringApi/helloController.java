package com.example.firstSpringApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Api")
public class helloController {

    @Autowired
    private HelloResponse helloResponse;

    @GetMapping("/hello")
    public String sayHello(){
        return helloResponse.getMessage();
    }

    @PostMapping("/hello")
    public void helloPost(@RequestBody String name){
        helloResponse.setMessage("Hello, this my first JSON Response, " + name);
    }
}
