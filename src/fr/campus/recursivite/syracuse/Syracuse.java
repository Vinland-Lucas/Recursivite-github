package fr.campus.recursivite.syracuse;

public class Syracuse {
    public Syracuse() {

    }

    public int syrac(int N, int i) {

        if (i == 0) {
            return N;
        } else {
            if (syrac(N, i-1) % 2 == 0) {
                return syrac(N, i-1) / 2;
            } else {
                return syrac(N, i-1) * 3 + 1;
            }
        }
    }
}
