package com.example.microservice_a.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public Mono<ResponseEntity<Info>> hello() {
        return Mono.just(ResponseEntity.ok(new Info("Hello, Reactive World!")));
    }

}

record Info(String msg){}

