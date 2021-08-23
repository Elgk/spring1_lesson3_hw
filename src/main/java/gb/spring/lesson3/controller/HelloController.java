package gb.spring.lesson3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class HelloController {

    @GetMapping
    public String hello(Model model){
        return "hello";
    }
}
