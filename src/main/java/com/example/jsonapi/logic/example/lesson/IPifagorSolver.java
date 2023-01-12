package com.example.jsonapi.logic.example.lesson;
// интерфейс логики решения теоримы Пифагора
public interface IPifagorSolver {
    double getHypotenuse(double cathetusA, double cathetB);
    double getCathet(double cathet, double hypotenuse);
}