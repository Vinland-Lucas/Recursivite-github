package fr.campus.recursivite.PGCD;

public class PGCD {
    public PGCD() {

    }

    public int PGCD_recursive(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return PGCD_recursive(b, a % b);
        }
    }
}
