package com.whatsapp_platform.whatsapp.controller;


import com.whatsapp_platform.whatsapp.dto.MessageRequest;
import com.whatsapp_platform.whatsapp.service.MessageServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/messages")
public class MessageController {

    @Autowired
    private MessageServiceImpl messageServiceImpl;

    @PostMapping
    public ResponseEntity<?> send(@RequestBody MessageRequest request){
        return messageServiceImpl.sendMessage(request);
    }
}
