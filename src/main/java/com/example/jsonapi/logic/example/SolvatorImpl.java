package com.example.jsonapi.logic.example;

//import com.example.jsonapi.service.example.ClassMessages;

//public class SolvatorImpl implements ISolvator{
//    @Override
//    public ClassMessages.OutputMessage solve(ClassMessages.InputMessage input) {
//        double a = input.a;
//        double b = input.b;
//        double c = input.c;
//
//        // если коэффициент a == 0, то нельзя решать -> return null
//        if (a == 0) {
//            return null;
//        }
//
//        double d = b * b - 4 * a * c;   // считаем дискриминант
//        if (d < 0) {
//            return new ClassMessages.OutputMessage(0, 0, 0);
//        } else if (d == 0) {
//            double x = - b / (2 * a);
//            return new ClassMessages.OutputMessage(1, x, x);
//        } else {
//            double x1 = (-b - Math.sqrt(d)) / (2 * a);
//            double x2 = (-b + Math.sqrt(d)) / (2 * a);
//            return new ClassMessages.OutputMessage(2, x1, x2);
//        }
//    }
//}
