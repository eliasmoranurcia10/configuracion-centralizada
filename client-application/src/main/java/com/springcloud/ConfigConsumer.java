package com.springcloud;

import com.fasterxml.jackson.annotation.JsonGetter;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Getter
public class ConfigConsumer {

    @Value("${user.role}")
    private String userRole;

    @Value("${welcome.message}")
    private String welcomeMessage;
}
