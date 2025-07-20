package com.whatsapp_platform.whatsapp.service;

import com.whatsapp_platform.whatsapp.dto.MessageRequest;
import org.springframework.http.ResponseEntity;

public interface MessageService {
    ResponseEntity<String> sendMessage(MessageRequest request);
}
