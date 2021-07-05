package com.taskone.firstservice.service;

import com.taskone.firstservice.dto.UserInput;
import java.util.Collections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ThirdServiceImpl implements ThirdService {

  @Autowired private RestTemplate restTemplate;

  @Value("${third.service.url}")
  private String thirdService;

  @Override
  public String postMessage(UserInput userInput) {
    HttpHeaders headers = new HttpHeaders();
    headers.setContentType(MediaType.APPLICATION_JSON);
    HttpEntity<UserInput> requestEntity = new HttpEntity<>(userInput, headers);
    return restTemplate
        .exchange(
            thirdService + "/thirdservice/message",
            HttpMethod.POST,
            requestEntity,
            String.class,
            Collections.emptyMap())
        .getBody();
  }
}
