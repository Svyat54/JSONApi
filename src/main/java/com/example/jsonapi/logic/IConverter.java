package com.example.jsonapi.logic;

import com.example.jsonapi.service.JSONMessage;
import org.springframework.stereotype.Component;

@Component
//Интерфейс решения онлайн калькулятор систем счисления (перевод из 2 в 10, из 2 в 16, наоборот)
public interface IConverter {
    JSONMessage.OutputMessage conv(JSONMessage.InputMessage input);
}
