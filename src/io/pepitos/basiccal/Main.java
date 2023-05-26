package io.pepitos.basiccal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez number 1");
        double n1 = scanner.nextDouble();
        System.out.println("Entrer number 2");
        double n2 = scanner.nextDouble();

        System.out.println("Quelles operations voulez vous faire ? ");
        String op = scanner.next();

        switch (op) {
            case "SOMME":
                System.out.println("la somme de " + n1 + " et " + n2 + " = " + (n1+n2) );
                break;
            case "SOUSTRACTION":
                System.out.println("la soustraction de " + n1 + " et " + n2 + " = " + (n1-n2) );
                break;
            case "PRODUIT":
                System.out.println("le produit de " + n1 + " et " + n2 + " = " + (n1*n2) );
                break;
            case "DIVISION":
                System.out.println("la somme de " + n1 + " et " + n2 + " = " + (n1/n2) );
                break;
            default:
                System.out.println("Veillez rensigner une operation valide");
                break;

        }

       // System.out.println("Hello world!");
    }
}