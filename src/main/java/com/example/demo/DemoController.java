package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class DemoController {
    @Autowired
    private DemoServices service;

    @Autowired
    private UserRepository userRepo;     

    @RequestMapping("/")
    public String Login(Model model){
        UserEntity user = new UserEntity();
        model.addAttribute("user",user);
        return "index";
    }

    @PostMapping("/vinculo")
    public String Listar(Model model,@ModelAttribute("user") UserEntity user){
        List<Vinculo>menu=service.listar();
        model.addAttribute("menu", menu);
        String useremail=user.getEmail();
        Optional<UserEntity> userdata = userRepo.findById(useremail);
        if(user.getContrasena().equals(userdata.get().getContrasena())){
            return "vinculo";
        }
        else{
            return "error";
        }
    }
    
}
