package com.example.jsonapi.logic.example.lesson;
// имплементация
public class PifagorSolver implements IPifagorSolver{
    @Override
    public double getHypotenuse(double cathetusA, double cathetB) {
        return Math.sqrt(cathetusA * cathetusA + cathetB * cathetB);
    }

    @Override
    public double getCathet(double cathet, double hypotenuse) {
        return Math.sqrt(hypotenuse * hypotenuse - cathet * cathet);
    }
}
