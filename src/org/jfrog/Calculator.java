package org.jfrog;
public class Calculator {
    public double calculate(double i, char c, double i1) {
        double z;
        switch (c) {
            case '+': {z = (i + i1);
                String s = String.format("%.6f", z);
                double val = Double.parseDouble(s);
                return val;}
            case '-': {z = (i - i1);
                String s = String.format("%.6f", z);
                double val = Double.parseDouble(s);
                return val;}
            case '*': case 'x': {z = (i * i1);
                String s = String.format("%.6f", z);
                double val = Double.parseDouble(s);
                return val;}
            case '÷': case '/': {if (i1 == 0) {throw new RuntimeException();}
            else {z = (i / i1);
                String s = String.format("%.6f", z);
                double val = Double.parseDouble(s);
                return val;}}
        }
        return 0;
    }
    // overload method in case numerical values passed to calculate method are strings rather than doubles
    public double calculate(String i, char c, String i1) {
        double d = Double.parseDouble(i);
        double d1 = Double.parseDouble(i1);
        return calculate(d, c, d1);
    }
    public int fibonacci(int i) {
        if(i == 0) return 0;
        else if(i == 1) return 1;
        else return fibonacci(i - 1) + fibonacci(i - 2);}
}
