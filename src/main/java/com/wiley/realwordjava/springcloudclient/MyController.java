package com.wiley.realwordjava.springcloudclient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class MyController {

    @Value("${config-client.message}")
    private String message;

    @GetMapping("/message")
    public String getMessage() {
        return message;
    }
}
