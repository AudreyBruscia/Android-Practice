package com.example.user.mathapp;

/**
 * Created by User on 11/8/2015.
 */
import java.util.Scanner;

public class MyMath {


    public static double add(double x, double y) {
        return x + y;
    }

    public static double sub(double x, double y) {
        return x - y;
    }

    public static double mul(double x, double y) {
        return x * y;
    }

    public static double div(double x, double y) {
        if (y == 0) {
            System.out.println("Illegal Divide by 0");
            return 0;
        }

        return x / y;
    }

    public static double ex(int x, int y) {
        int value = x;

        if (y == 0) {
            return 1;
        }
        else if (y < 0) {
            y *= -1;
            for (int i = 0; i < y - 1; i++) {
                value *= x;
            }

            return (double) 1 / value;
        }
        else {
            for (int i = 0; i < y - 1; i++) {
                value *= x;
            }

            return value;
        }
    }

    public static int min(int[] ints) {
        int min = ints[0];

        for (int i = 0; i < ints.length; i++) {
            if (ints[i] < min) {
                min = ints[i];
            }
        }

        return min;
    }

    public static int max(int[] ints) {
        int max = ints[0];

        for (int i = 0; i < ints.length; i++) {
            if (ints[i] > max) {
                max = ints[i];
            }
        }

        return max;
    }

}

