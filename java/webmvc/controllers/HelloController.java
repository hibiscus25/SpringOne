package webmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/first")
public class HelloController {

    @GetMapping("/hello-world")
    public String sayHello(){
        return "hello_world";
    }
}
