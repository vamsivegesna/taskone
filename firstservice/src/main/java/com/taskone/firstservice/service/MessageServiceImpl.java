package com.taskone.firstservice.service;

import com.taskone.firstservice.dto.UserInput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageServiceImpl implements MessageService {

    @Autowired
    private SecondService secondService;

    @Autowired
    private ThirdService thirdService;

    @Override
    public String postMessage(UserInput userInput) {
        String secondServiceMessage = secondService.getMessage();
        String thirdServiceMessage = thirdService.postMessage(userInput);
        return secondServiceMessage + " " + thirdServiceMessage;
    }
}
