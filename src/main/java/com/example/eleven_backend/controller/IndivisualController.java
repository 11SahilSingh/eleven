package com.example.eleven_backend.controller;

import com.example.eleven_backend.entity.User;
import com.example.eleven_backend.service.IndivisualService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/indivisualController")
public class IndivisualController {

    private final IndivisualService indivisualService;

    IndivisualController(IndivisualService indivisualService){
        this.indivisualService=indivisualService;
    }


    @PostMapping("/postUser")
    public User postUser(@RequestBody User user){
        return indivisualService.postUser(user);
    }

    @GetMapping("/getUser")
    public User getUser(@RequestParam Integer userPkId){
        return indivisualService.getUser(userPkId);
    }

    @DeleteMapping("/deleteUser")
    public User deleteUser(@RequestParam Integer userPkId){
        return indivisualService.deleteUser(userPkId);
    }

    @PutMapping("/updateUserData")
    public User updateUserData(@RequestBody User user){
        return indivisualService.updateUserData(user);
    }






}
