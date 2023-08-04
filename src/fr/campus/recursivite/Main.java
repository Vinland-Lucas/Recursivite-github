package fr.campus.recursivite;

import fr.campus.recursivite.factorielle.Factorielle;
import fr.campus.recursivite.fibonacci.Fibonacci;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Ecrire un nombre svp : ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Le nombre saisi est : " + n);

        // FACTORIELLE
        Factorielle factorielle = new Factorielle();
        System.out.println("La factorielle est de " + factorielle.facto(n));

        // FIBONACCI
        Fibonacci fibonacci = new Fibonacci();
        System.out.println("Fibonacci : "+ fibonacci.fibo(n));
    }
}