package com.example.microservice_b.controller;

import com.example.microservice_b.client.ClientA;
import com.example.microservice_b.model.Msg;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class MsgController {

    private final ClientA clientA;

    @GetMapping("/msg")
    public ResponseEntity<Msg> getMsg() {
        return ResponseEntity.ok(clientA.getMsg(new Msg("MICROSERVICE-B", "HI")));
    }

}

