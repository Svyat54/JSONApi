package com.example.jsonapi.service;

import com.example.jsonapi.exception.NotEqualsChoice;

import java.time.LocalDate;

public class JSONMessage {
    public interface IMessage{}

    public static class Message implements IMessage{
        public String message;
        public LocalDate localDate;

        public Message(String message){
            this.message = message;
            this.localDate = LocalDate.now();
        }

        @Override
        public String toString(){
            return localDate + ": " + message;
        }
    }

    public static class InputMessage implements IMessage {
        public String choice;
        public Integer toDecimal;
        public String inquiry;

        public InputMessage(String choice, Integer toDecimal, String inquiry){
            this.choice = choice;
            this.toDecimal = toDecimal;
            this.inquiry = inquiry;
        }
    }

    public static class OutputMessage implements IMessage {
        public Integer toDecimal;
        public String toBinary;
        public String hexNumber;

        public OutputMessage(Integer toDecimal) {
            this.toDecimal = toDecimal; //2k10
        }
        public OutputMessage(String choice, String str) {
            if(choice.equals("2k16")) {
                this.hexNumber = str;
            }
            else {
                this.toBinary = str;
            }
        }
    }
    public static class ErrorMessage extends Message {
        public ErrorMessage(String error) {
            super(error);
        }
    }
}
