package com.example.microservice_a.controller;

import com.example.microservice_a.model.Info;
import com.example.microservice_a.model.Msg;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@AllArgsConstructor
public class HelloController {

    @GetMapping("/hello")
    public Mono<ResponseEntity<Info>> getHello() {
        return Mono.just(ResponseEntity.ok(new Info("Hello, Reactive World!")));
    }

    @PostMapping("/msg")
    public Mono<ResponseEntity<Msg>> getMsg(@RequestBody Msg msg) {
        return Mono.just(ResponseEntity.ok(new Msg("MICROSERVICE-A", "'Hi " + msg.me())));
    }

}

