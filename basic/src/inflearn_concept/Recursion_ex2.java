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

    // 재귀는 언제 사용할ㄲㅏ
    //1) 문제를 비슷한 구조의 더 작은 문제로 나눌 수 있는 경우
    //2) 반복문이 많이 중첩되거나 중첩 회수를 예측하기 어려운 경우
    //3) 변수 사용을 줄여 프로그램 오류 발생 가능성 제거
    // 재귀를 사용하면 반복문보다 코드가 간결하나 반ㄷ시 효율적이라 볼 수는 없다.
}
