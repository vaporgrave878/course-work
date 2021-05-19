package com.java.vntu;

public class Main {
    public static void main(String[] args) {
        NonlinearEquationsMethods nem = new  NonlinearEquationsMethods();
        nem.ChordMethod(0,2, 0.01);
        nem.NewtonMethod(0, 0.01);
        nem.IterationMethod(0, 0.06,  0.01);
    }
}
