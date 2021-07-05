package com.taskone.thirdservice.controller;

import com.taskone.thirdservice.dto.UserInput;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class ThirdController {

  @PostMapping
  @ApiOperation(value = "Add message")
  public ResponseEntity<String> postMessage(@RequestBody UserInput input) {
    if (input == null || input.getName() == null || input.getSurname() == null) {
      return new ResponseEntity("Invalid Input", HttpStatus.BAD_REQUEST);
    }
    return new ResponseEntity(input.getName() + " " + input.getSurname(), HttpStatus.CREATED);
  }
}
