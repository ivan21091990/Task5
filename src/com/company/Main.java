package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число и нажмите Enter:");
        int x = scanner.nextInt();
        System.out.println("Таблица умножения для числа " + x + ":" );
        System.out.println("1 " +  "* " + x + " = " + 1*x );
        System.out.println("2 " +  "* " + x + " = " + 2*x );
        System.out.println("3 " +  "* " + x + " = " + 3*x );
        System.out.println("4 " +  "* " + x + " = " + 4*x );
        System.out.println("5 " +  "* " + x + " = " + 5*x );
        System.out.println("6 " +  "* " + x + " = " + 6*x );
        System.out.println("7 " +  "* " + x + " = " + 7*x );
        System.out.println("8 " +  "* " + x + " = " + 8*x );
        System.out.println("9 " +  "* " + x + " = " + 9*x );
        System.out.println("10 " +  "* " + x + " = " + 10*x );
    }
}
