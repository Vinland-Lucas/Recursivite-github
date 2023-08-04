package fr.campus.recursivite.PGCD;

public class PGCD {
    public PGCD() {

    }

    public int PGCD_recursive(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return PGCD_recursive(b, a % b); // cf.énoncé ici "PGCD_recursive" = pgcd(a,b) et "(b, a % b)" = pgcd(b, r) --> BIEN RETENIR CA C'EST IMPORTANT POUR REUSSIR LES EXOS
        }
    }
}
