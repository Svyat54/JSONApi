package com.example.jsonapi.logic.example.lesson;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.internal.matchers.Equality;

import static org.junit.jupiter.api.Assertions.*;

class PifagorSolverTest {
    //метод тестирования гипотенузы по катетам
    @Test
    void getHypotenuse() {
        PifagorSolver pifagorSolver = new PifagorSolver();
        double c1 = 3, c2 = 4;
        double h = pifagorSolver.getHypotenuse(c1, c2);
        assertEquals(h, 5, 0.00001);//сравниваем гипотенузу с ожидаемом значением

        c1 = 1;
        c2 = 2;
        h = pifagorSolver.getHypotenuse(c1, c2);
        assertNotEquals(h, 5, 0.00001);
    }
    //метод тестирования получения катета по катету и гипотенузе
    @Test
    void getCathet() {
        PifagorSolver pifagorSolver = new PifagorSolver();
        double h = 5, c1 = 4;
        double c2 = pifagorSolver.getCathet(c1, h);
        assertEquals(c2, 3);

        c1 = pifagorSolver.getCathet(c2, h);
        assertEquals(c1, 4);
    }
}