package com.whatsapp_platform.whatsapp.webhook;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/webhook")
public class WebhookController {

    @PostMapping
    public ResponseEntity<String> receiveWebhook(@RequestBody Map<String, Object> payload,
                                                 @RequestHeader("X-Hub-Signature-256") String signature) {
        // TODO: validate signature & save message
        return ResponseEntity.ok("Webhook received");
    }

    @GetMapping
    public ResponseEntity<String> verify(@RequestParam("hub.challenge") String challenge) {
        return ResponseEntity.ok(challenge);
    }
}
