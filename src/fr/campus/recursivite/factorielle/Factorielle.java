package fr.campus.recursivite.factorielle;

public class Factorielle {

    public Factorielle() {

    }

    public int facto(int n) {
        if (n == 0) {
            return 1;
        } else {
            return (facto(n-1) * n);
        }
    }

}
