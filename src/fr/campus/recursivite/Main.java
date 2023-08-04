package fr.campus.recursivite;

import fr.campus.recursivite.factorielle.Factorielle;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Factorielle factorielle = new Factorielle();
        System.out.println(factorielle.facto(10));
    }
}