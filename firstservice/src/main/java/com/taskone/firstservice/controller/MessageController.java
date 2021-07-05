package com.taskone.firstservice.controller;

import com.taskone.firstservice.dto.UserInput;
import com.taskone.firstservice.service.MessageService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class MessageController {

  @Autowired private MessageService messageService;

  @GetMapping
  @ApiOperation(value = "Get Service message")
  public ResponseEntity<String> getMessage() {
    return ResponseEntity.ok("Up");
  }

  @PostMapping(consumes = "application/json")
  @ApiOperation(value = "Add message")
  public ResponseEntity<String> postMessage(@RequestBody UserInput input) {
    if (input == null || input.getName() == null || input.getSurname() == null) {
      return new ResponseEntity("Invalid Input", HttpStatus.BAD_REQUEST);
    }
    return new ResponseEntity(messageService.postMessage(input), HttpStatus.CREATED);
  }
}
