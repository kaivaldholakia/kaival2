package com.example.demo.spring_1.controller;

import com.example.demo.spring_1.model.mymodel;
import org.springframework.web.bind.annotation.*;

@RestController
public class Mycontroller {
@GetMapping(path="/lateral")

    public mymodel anon() {
        mymodel m = new mymodel("kkkkk",9);
        return  m;
    }

@PostMapping(path="/fat")

  public mymodel postTest(@RequestBody mymodel a){

    return a;
    }



}
