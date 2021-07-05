package com.taskone.thirdservice.controller;

import com.taskone.thirdservice.dto.UserInput;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class ThirdController {

  @PostMapping
  @ApiOperation(value = "Add message")
  public String postMessage(@RequestBody UserInput input) {
    return input.getName() + " " + input.getSurname();
  }
}
