package com.example.microservice_b.client;

import com.example.microservice_b.model.Msg;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "microservice-a")
public interface ClientA {

    @PostMapping("/msg")
    public Msg getMsg(@RequestBody Msg msg);
}
