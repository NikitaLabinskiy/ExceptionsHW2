package org.example;

public class Example2 {
    public static void main(String[] args) {
        try {
            int d = 0;
            int[] array = {1,2,3,5,6,7,8,9,9,9,9,10};
            double catchedRes1 = array[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }

    }
}
