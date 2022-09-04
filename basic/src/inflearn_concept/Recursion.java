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

    // 항상 recursion이 무한루프에 빠지는 것은 아니다.
    // 무한 루프에 빠지지 않고 recursion을 사용하는 법
    public static void func2(int n){
        // Base case : 적어도 하나의 recursion에 빠지지 않는 경우가 존재해야 한다.
        if(n<=0)
            return;
        else {
            System.out.println("Hi");
            // Recursive case : recursion을 반복하다보면 결국 base case로 수렴해야 한다.
            func2(n-1);
        }
    }
}
