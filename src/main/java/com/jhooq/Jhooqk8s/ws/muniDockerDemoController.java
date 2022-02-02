package com.muni.munik8s.ws;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class muniDockerDemoController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello - muni-k8s i Have updated the message";
    }
}
