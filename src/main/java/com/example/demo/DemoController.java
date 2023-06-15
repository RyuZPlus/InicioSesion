package com.example.demo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class DemoController {
    @Autowired
    private DemoServices service;

    @RequestMapping("/index")
    public String Login(){
        return "index";
    }

    @RequestMapping("/vinculo")
    public String Listar(Model model){
        List<Vinculo>menu=service.listar();
        model.addAttribute("menu", menu);
        return "vinculo";
    }
    
}
