package com.example.study.controller;

import com.example.study.model.network.Header;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class GetController {
    @GetMapping("/header")
    public Header herHeader(){
        return Header.builder().resultCode("ok").description("ok").build();
    }
}
