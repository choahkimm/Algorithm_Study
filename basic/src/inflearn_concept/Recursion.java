package inflearn_concept;

public class Recursion {
    public static void main(String[] args) {
        //func();

        int n = 4;
        func2(n);
    }

    public static void func(){
        System.out.println("hello");
        func(); // 항상 자기 자신을 호출 --> 무한 루프
    }

    // 무한 루프에 빠지지 않고 recursion을 사용하는 법

    public static void func2(int n){
        if(n<=0)
            return;
        else {
            System.out.println("Hi");
            func2(n-1);
        }
    }
}
