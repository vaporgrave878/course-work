package com.java.vntu;

public class NonlinearEquationsMethods {


    private double f(double x){
        return Math.pow(x, 5) + 10 * x - 12;
    }

    public void ChordMethod(double xPrev, double xCurr, double e){
        double xNext = 0;
        double temp;
        int iter = 0;
        while (Math.abs(xNext - xCurr) > e){
            temp = xNext;
            xNext = xCurr - f(xCurr) * ((xPrev - xCurr) / (f(xPrev) - f(xCurr)));
            xPrev = xCurr;
            xCurr = temp;
            iter++;
        }
        System.out.println("Radical: " + xNext);
        System.out.println("Iterations: " + iter);
    }
}
