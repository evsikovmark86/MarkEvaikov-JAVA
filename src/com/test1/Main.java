package com.itproger;

import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {
//        Задание №1
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число a: ");
        int a = scan.nextInt();
        System.out.println("Введите число b: ");
        int b = scan.nextInt();
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a == b");
        }
        int res4 = a + b;
        int res5 = a - b;
        int res6 = a * b;
        int res7 = a / b;
        System.out.println(res4 + "\n" + res5 + "\n" + res6 + "\n" + res7);
    }
    public class Two {
        public static void greeting() {
            System.out.println("Java for Brave");
        }
    }
}
