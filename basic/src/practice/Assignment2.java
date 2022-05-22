package practice;

public class Assignment2 {
    public static void main(String[] args) {
        char ch = 'A';
        int x = ch;
        int y = x + ch -8;
        char ch2 = (char) x;

        System.out.println(ch); // A
        System.out.println(x); // Converting characters to ASCII code values : 65
        System.out.println(y); // 65 + 65 - 8 = 122
        System.out.println(ch2); // Convert ASCII code to char : A
        System.out.println((char) y); // Convert 122 to char : z
    }
}
