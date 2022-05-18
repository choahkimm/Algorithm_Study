package practice;

public class Assignment2 {
    public static void main(String[] args) {
        char ch = 'A';
        int x = ch;
        int y = x + ch -8;
        char ch2 = (char) x;

        System.out.println(ch); // A
        System.out.println(x); // 아스키 코드
        System.out.println(y); // 아스키 코드
        System.out.println(ch2); // 아스키 코드를 char로 변환
        System.out.println((char) y); // y를 char로 변환하여 ??
    }
}
