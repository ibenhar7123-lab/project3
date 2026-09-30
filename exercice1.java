package project3;

import java.util.Scanner;

public class exercice1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez n : ");
        int n = sc.nextInt();

        double somme = 0;

        for (int i = 1; i <= n; i++) {
            somme = somme + 1.0 / i;
        }

        System.out.println("La somme = " + somme);

        sc.close();
    }
}
