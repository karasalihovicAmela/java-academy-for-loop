package com.company;

import java.util.Scanner;

public class Example2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesite broj:");
        int number = scanner.nextInt();

        System.out.println("Brojanje do " + number + ":");
        for (int i = 1; i <= number; i++) {
            System.out.println(i);
        }
    }
}
