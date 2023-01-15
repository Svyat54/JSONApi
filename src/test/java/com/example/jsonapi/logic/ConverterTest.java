package com.example.jsonapi.logic;

import com.example.jsonapi.service.JSONMessage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConverterTest {

    @Test
    void conv() {
        Converter converter = new Converter();
        assertEquals(converter.conv(new JSONMessage.InputMessage("16k2", null, "10f")).toBinary, "000100001111");
        assertEquals(converter.conv(new JSONMessage.InputMessage("10k2", 168224, null)).toBinary, "101001000100100000");
        assertEquals(converter.conv(new JSONMessage.InputMessage("2k10", null, "1111111")).toDecimal, 127);
        assertEquals(converter.conv(new JSONMessage.InputMessage("2k16", null, "1111111")).hexNumber, "7f");

        assertNotEquals(converter.conv(new JSONMessage.InputMessage("2k16", null, "11111111")).hexNumber, "7f");



    }
}