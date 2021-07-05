package com.taskone.secondservice.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class MessageController {

  @GetMapping
  @ApiOperation(value = "Get Service message")
  public ResponseEntity<String> getMessage() {
    return ResponseEntity.ok("Hello");
  }
}
