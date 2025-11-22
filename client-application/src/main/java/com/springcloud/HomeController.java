package com.springcloud;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class HomeController {

    private final ConfigConsumer configConsumer;

    @GetMapping("/config")
    public String getConfig() {
        return String.format("Role: %s, Message: %s", configConsumer.getUserRole(), configConsumer.getWelcomeMessage());
    }
}
