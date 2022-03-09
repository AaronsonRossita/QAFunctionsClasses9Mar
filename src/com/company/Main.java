package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//          index    0  1  2  3  4  5
        int[] arr = {10,20,30,40,50,60};

//        for (int number : arr) {
//            System.out.println(number);
//        }
//
//        System.out.print("{");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + ", ");
//        }
//        System.out.println("}");
//
//        System.out.print("{");
//        for (int i = 0; i < arr.length; i++) {
//            if (i == arr.length-1){
//                System.out.print(arr[i]);
//            }else{
//                System.out.print(arr[i] + ", ");
//            }
//        }
//        System.out.println("}");
//
//
//
//        int x = 5;
//        while (x < 10){
//            System.out.println(x);
//            x++;
//        }
//
//        System.out.println("i'm out");
//
////     Operators
//
//        int a = 5;
//        int b = 3;
        System.out.println("Pls write the first number");
        int first = scanner.nextInt();
        System.out.println("Pls write the second number");
        int second = scanner.nextInt();
//
//        int sum = a + b;
//        int sub = a - b;
//        int div = a / b;
//        int mult = a * b;
//        a++; // a = a + 1;
//        b--; // b = b - 1;
//
//        a = 7;
//        a += 4; // a = a + 4;
//        b += a; // b = b + a;
//        a -= 4; a /= 2; a *= 2;
//
//        if (a == 8){
//            System.out.println("a is eight");
//        }
//
//        if (a != b){
//            System.out.println("a is not equal to b");
//        }
//
//        if (a > b){
//            System.out.println("a is larger than b");
//        }
//
//        if (a >= b){
//            System.out.println("a is larger or equal to b");
//        }
//
//        if (a < b){
//            System.out.println("b is larger than a");
//        }
//
//        if (a <= b){
//            System.out.println("b is larger or equal to a");
//        }
//
//        a = 5;
//        b = 5;
//
////                 OR
//        if (a == 8 || a == 9){
//            System.out.println("first option");
//        }
//
////                AND
//        if (a == 8 && b == 8){
//            System.out.println("second option");
//        }

        if (first == second){
            System.out.println("numbers are equal");
        }else if (first > second){
            System.out.println("first number is larger");
        }else{
            System.out.println("second number is larger");
        }










    }

}


