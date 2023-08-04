package fr.campus.recursivite;

import fr.campus.recursivite.PGCD.PGCD;
import fr.campus.recursivite.factorielle.Factorielle;
import fr.campus.recursivite.fibonacci.Fibonacci;
import fr.campus.recursivite.syracuse.Syracuse;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ecrire un nombre svp : ");
        int n = scanner.nextInt();
        System.out.println("Le nombre saisi est : " + n);

        // FACTORIELLE
        Factorielle factorielle = new Factorielle();
        System.out.println("La factorielle est de " + factorielle.facto(n));

        // FIBONACCI
        Fibonacci fibonacci = new Fibonacci();
        System.out.println("Fibonacci : "+ fibonacci.fibo(n));

        // SYRACUSE
        System.out.println("\nEcrire un nombre svp : ");
        int N = scanner.nextInt();
        System.out.println("Le nombre saisi est : " + N);

        System.out.println("Ecrire un nombre svp : ");
        int i = scanner.nextInt();
        System.out.println("Le nombre saisi est : " + i);

        Syracuse syracuse = new Syracuse();
        System.out.println("Syracuse : " + syracuse.syrac(N, i));

        // PGCD
        PGCD pgcd = new PGCD();
        System.out.println("PGCD : " + pgcd.PGCD_recursive(N, i));
    }
}