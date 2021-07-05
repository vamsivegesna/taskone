package com.taskone.firstservice.service;

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
public class SecondServiceImpl implements SecondService {

  @Autowired private RestTemplate restTemplate;

  @Override
  public String getMessage() {
    ResponseEntity<String> response = null;
    try {
      HttpHeaders headers = new HttpHeaders();
      headers.setContentType(MediaType.APPLICATION_JSON);
      HttpEntity<Void> requestEntity = new HttpEntity<>(null, headers);
      response =
          restTemplate.exchange(
              "http://localhost:8082/secondservice/message",
              HttpMethod.GET,
              requestEntity,
              String.class,
              Collections.emptyMap());
    } catch (Exception e) {

    }
    return response.getBody();
  }
}
