package com.java.vntu;

public class Main {
    public static void main(String[] args) {
        NonlinearEquationsMethods nem = new  NonlinearEquationsMethods();
        nem.ChordMethod(-10,5, 0.001);
        nem.NewtonMethod(-10, 0.001);
    }
}
