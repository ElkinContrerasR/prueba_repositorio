package com.corhuila.easypark.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.corhuila.easypark.models.User;

@RestController
@RequestMapping("/api/easypark")
public class UserController {

    @GetMapping("/getAll")
    public List<User> getAll(){
        return null;
    }
}
