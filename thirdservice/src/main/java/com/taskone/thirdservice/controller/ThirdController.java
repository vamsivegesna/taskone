package com.taskone.thirdservice.controller;

import com.taskone.thirdservice.dto.UserInput;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class ThirdController {

    @PostMapping
    public String postMessage(@RequestBody UserInput input) {
        return input.getName() + " " + input.getSurname();
    }
}
