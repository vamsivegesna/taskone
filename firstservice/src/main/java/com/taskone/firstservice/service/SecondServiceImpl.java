package com.taskone.firstservice.service;

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
public class SecondServiceImpl implements SecondService {

  @Autowired private RestTemplate restTemplate;

  @Value("${second.service.url}")
  private String secondService;

  @Override
  public String getMessage() {
    HttpHeaders headers = new HttpHeaders();
    headers.setContentType(MediaType.APPLICATION_JSON);
    HttpEntity<Void> requestEntity = new HttpEntity<>(null, headers);
    return restTemplate
        .exchange(
            secondService + "/secondservice/message",
            HttpMethod.GET,
            requestEntity,
            String.class,
            Collections.emptyMap())
        .getBody();
  }
}
