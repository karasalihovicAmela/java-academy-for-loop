package com.company;

public class Switch {

    public static void main(String[] args) {

        String option = "1";

        switch (option) {
            case "1":
                System.out.println("1");
                break;
            case "2":
                System.out.println("2");
                break;
            case "3":
                System.out.println("3");
                break;
            default:
                System.out.println("Sve ostalo");
                break;
        }

        System.out.println("Nastavak...");

    }

}
