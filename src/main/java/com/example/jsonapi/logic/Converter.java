package com.example.jsonapi.logic;

import com.example.jsonapi.exception.NotEqualsChoice;
import com.example.jsonapi.service.JSONMessage;
import com.example.jsonapi.service.entity.BinaryDecimal;
import com.example.jsonapi.service.entity.BinaryHex;

public class Converter implements IConverter{
    @Override
    public JSONMessage.OutputMessage conv(JSONMessage.InputMessage input) {
        String choice = input.choice;
        Integer toDecimal = input.toDecimal;
        String  inquiry = input.inquiry;

        if(choice.equals("2k10")){
            return new JSONMessage.OutputMessage(BinaryDecimal.toDecimal(inquiry));
        }else if(choice.equals("2k16")){
            return new JSONMessage.OutputMessage(choice ,BinaryHex.toHex(inquiry));
        }else if(choice.equals("10k2")){
            return new JSONMessage.OutputMessage(choice ,BinaryDecimal.toBinary(toDecimal));
        }else if(choice.equals("16k2")){
            return new JSONMessage.OutputMessage(choice ,BinaryHex.toBinary(inquiry));
        }else{
            throw new NotEqualsChoice("Not the right choice! Correct 2k10, 2k16, 10k2, 16k2. " +
                    "Choose one and try again");
        }
    }
}
