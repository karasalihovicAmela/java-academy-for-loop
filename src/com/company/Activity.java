package com.company;

import java.util.Scanner;

public class Activity {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Traziti broj do 10");
        System.out.println("Broj1 je");
        int broj1 = scan.nextInt(); // 5

        System.out.println("Trayiti double vrijednosti");

        double zbir = 0.0d;
        for (int i = 0; i < broj1; i++) { // izvršiti će se 5 puta
            System.out.println((i + 1) + " vrijednsot je");
            double broj2 = scan.nextDouble(); //1.2, 2.3, 4.5
            zbir += broj2;
        }
        System.out.println("Suma je:" + zbir);

        System.out.print("\nKoliko ljudi je prisusvovalo predavanju: ");
        int brojLjudi = scan.nextInt();
        String[] imena = new String[brojLjudi];
        scan.nextLine();
        int viseOdpet = 0;
        for (int i = 0; i < imena.length; i++) {
            System.out.print("Unesite ime: ");
            imena[i] = scan.nextLine();
            if (imena[i].length() > 5) {
                viseOdpet += 1;
            }
        }

        System.out.println("\nOsobe koje su prisustvoval predavanju su:");
        for (int i = 0; i < imena.length; i++) {
            System.out.println((i + 1) + "." + imena[i]);
        }
        System.out.println(viseOdpet + " brojeva je duze od 5.");
    }
}
