package beakjoon.bronze5;

import java.util.Scanner;

public class Beakjoon2744 {
    //백준 2744. 대소문자 바꾸기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String ans = "";
        for(char c : str.toCharArray()){
            if(Character.isLowerCase(c)){
                ans += Character.toUpperCase(c);
            }else {
                ans += Character.toLowerCase(c);
            }
        }
        System.out.println(ans);
    }
}
