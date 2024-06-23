package com.test2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Задание №1
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число a: ");
        String a = scan.nextLine();
        System.out.println("Введите число b: ");
        String b = scan.nextLine();
        if (a.equals(b)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }
    }
}
