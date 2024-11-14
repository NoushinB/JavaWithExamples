package org.noushin.examples.methodOverloading;

public class MethodOverloading {
    int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two double values
    double add(double a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        MethodOverloading calc = new MethodOverloading();

        System.out.println("Adding two integers: " + calc.add(2, 3));              // Calls add(int, int)
        System.out.println("Adding three integers: " + calc.add(2, 3, 4));         // Calls add(int, int, int)
        System.out.println("Adding two doubles: " + calc.add(2.5, 3.5));           // Calls add(double, double)
    }
}
