package fr.campus.recursivite.fibonacci;

public class Fibonacci {

    public Fibonacci() {

    }

    public int fibo(int n) {
        if (n <= 1 ) {
            return n;
        } else {
            return fibo(n-1) + fibo(n-2);
        }
    }
}
