package com.taskone.firstservice.service;

import com.taskone.firstservice.dto.UserInput;
import java.util.Collections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ThirdServiceImpl implements ThirdService {

  @Autowired private RestTemplate restTemplate;

  @Override
  public String postMessage(UserInput userInput) {
    ResponseEntity<String> response = null;
    try {
      HttpHeaders headers = new HttpHeaders();
      headers.setContentType(MediaType.APPLICATION_JSON);
      HttpEntity<UserInput> requestEntity = new HttpEntity<>(userInput, headers);
      response =
          restTemplate.exchange(
              "http://localhost:8083/thirdservice/message",
              HttpMethod.POST,
              requestEntity,
              String.class,
              Collections.emptyMap());
    } catch (Exception e) {

    }
    return response.getBody();
  }
}
