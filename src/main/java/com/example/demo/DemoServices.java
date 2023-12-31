package com.example.demo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoServices implements DemoIService{
    
    @Autowired
    private VinculoIdRepository dataid;

    @Override
    public List<Vinculo> listar() {
        return (List<Vinculo>)dataid.findAll();
    }
}
