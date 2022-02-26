package com.company;

public class Mistakes {

    public static void main(String[] args) {
/*
        // Indeks uvijek počinje od nule
        System.out.println("\n---- Indeks uvijek počinje od nule ----");
        for (int i = 1; i < 5; i++) {
            System.out.println(i);
        }
        System.out.println("Indeks 1 = Petlja se izvela 4 puta");
        System.out.println("--------------");
        for(int i = 0; i < 5; i++){
            System.out.println(i+1);
        }
        System.out.println("Indeks 0 = Petlja se izvela 5 puta");

        // Korišenje logičkih operatora u uslovu (>, <, <=, >=)
        System.out.println("\n---- Korišenje logičkih operatora u uslovu (>, <, <=, >=) ----");
        for(int i = 0; i < 5; i++){
            System.out.println(i+1);
        }
        System.out.println("i < 5 = Petlja se izvela 5 puta");
        System.out.println("--------------");
        for(int i = 0; i <= 5; i++){
            System.out.println(i+1);
        }
        System.out.println("i <= 5 = Petlja se izvela 6 puta");
*/
        // Prekoračenje opsega niza
        System.out.println("\n---- Prekoračenje opsega niza ----");
        String[] names = {"Haris", "Iman", "Faruk"};

        for (int i = 0; i < 5; i++) {
            System.out.println(names[i]);
        }
    }
}
