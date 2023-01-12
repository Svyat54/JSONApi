package com.example.jsonapi.controller;

import com.example.jsonapi.logic.IConverter;
import com.example.jsonapi.service.JSONMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/converter")
public class ConverterController {
    @Autowired
    private IConverter converter;
    // 1. ping
    @GetMapping("/ping")
    public JSONMessage.Message ping(){
        return new JSONMessage.Message("PONG");
    }
    // 2. статус сервера
    @GetMapping("/status")
    public JSONMessage.Message status(){
        return new JSONMessage.Message("Server status OK at port 8080");
    }
    // 3. решение
    @PostMapping("/result")
    public JSONMessage.IMessage conv(@RequestBody JSONMessage.InputMessage inputMessage){
        JSONMessage.OutputMessage out = converter.conv(inputMessage);
        if(out == null){
            return new JSONMessage.ErrorMessage("Not the right choice! Correct 2k10, 2k16, 10k2, 16k2. " +
                    "Choose one and try again");
        }
        return out;
    }
}
