package beakjoon.bronze5;

import java.util.Scanner;

public class Beakjoon9086 {
    // 백준 9086. 문자열
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCount = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<testCount; i++){
            String s = sc.next();
            sb.append(s.charAt(0));
            sb.append(s.charAt(s.length()-1)+"\n");
        }
        System.out.println(sb);
    }
}

