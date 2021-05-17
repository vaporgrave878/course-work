package com.java.vntu;

public class NonlinearEquationsMethods {


    private double f(double x){
        return Math.pow(x, 5) + 10 * x - 12;
    }
    private double f1(double x){ return 5 * Math.pow(x, 4) + 10; }
    private double fi(double x, double y){ return x - y * f(x); }


    public void ChordMethod(double xPrev, double xCurr, double e){
        double xNext = 0;
        double temp;
        int iter = 0;
        while (Math.abs(f(xCurr)) > e){
            temp = xNext;
            xNext = xCurr - f(xCurr) * ((xPrev - xCurr) / (f(xPrev) - f(xCurr)));
            xPrev = xCurr;
            xCurr = temp;
            iter++;
        }
        System.out.println("Метод січних");
        System.out.println("Корінь: " + xNext);
        System.out.println("Ітерацій: " + iter);
    }

    public void NewtonMethod(double xCurr, double e){
        double xNext = 0;
        double temp;
        int iter = 0;
        while (Math.abs(f(xNext)) > e){
            temp = xNext;
            xNext = xCurr - f(xCurr) / f1(xCurr);
            xCurr = temp;
            iter ++;
        }
        System.out.println("Метод Ньютона");
        System.out.println("Корінь: " + xNext);
        System.out.println("Ітерацій: " + iter);
    }

    public void IterationMethod(double x, double y, double e){
        int iter = 0;
        double xlast;
        do{
            xlast = x;
            x = fi(xlast, y);
            iter ++;
        }while (Math.abs(xlast - x) >= e);
        System.out.println("Метод Ітерацій");
        System.out.println("Корінь: " + x);
        System.out.println("Ітерацій: " + iter);
    }
}
