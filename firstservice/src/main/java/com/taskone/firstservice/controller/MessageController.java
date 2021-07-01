package com.taskone.firstservice.controller;

import com.taskone.firstservice.dto.UserInput;
import com.taskone.firstservice.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class MessageController {

    @Autowired
    private MessageService messageService;

    @GetMapping
    public ResponseEntity<String> getMessage() {
        return ResponseEntity.ok("Up");
    }

    @PostMapping
    public ResponseEntity<String> postMessage(@RequestBody UserInput input) {
        return ResponseEntity.ok(messageService.postMessage(input));
    }
}
