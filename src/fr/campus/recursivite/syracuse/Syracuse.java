package fr.campus.recursivite.syracuse;

public class Syracuse {
    public Syracuse() {

    }

    public int syrac(int N, int i) {

        if (i == 0) {
            return N;
        } else {
            int r = syrac(N, i-1); // on appel la fonction "syrac" et on stock le résultat dans une variable "r" pour éviter d'appeler plusieurs fois la fonction "syrac" afin d'améliorer la performance du code
            if (r % 2 == 0) { // on appel la variable "r" pour utiliser le résultat de la fonction déjà stocké dans cette dernière afin d'éviter d'appeler plusieurs fois la fonction "syrac"
                return r / 2;
            } else {
                return r * 3 + 1;
            }
        }
    }
}
