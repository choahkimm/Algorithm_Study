package inflearn_concept;

public class Recursion_ex1 {
    // 1~N 까지의 합
    // recursion 으로

    public static void main(String [] args){
        int result = func(4);
    }

    public static int func(int n){
        if(n==0)
            return 0;
        else
            return n + func(n-1);
        // n이 0보다 크다면 0에서 n 까지의 합은 0에서 n-1까지의 합에 n을 더한 것.
    }
}
