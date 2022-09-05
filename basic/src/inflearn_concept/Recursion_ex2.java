package inflearn_concept;

public class Recursion_ex2 {
    // Factorial : n!

    // 0! = 1
    // n! = n*(n-1) n>0

    public static void main(String[] args) {
        factorial(4);
    }

    public static int factorial(int n){
        if(n==0)
            return 1;
        else
            return n*factorial(n-1);
    }

    // 피보나치 수열, 최대 공약수 ...
}
