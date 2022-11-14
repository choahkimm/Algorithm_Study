package beakjoon.bronze5;

import java.util.Scanner;

public class Beakjoon25372 {
    // 백준 25372. 성택이의 은밀한 비밀번호
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pwd ="";
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            pwd = sc.next();
            if(pwd.length()>=6 && pwd.length()<=9)
                System.out.println("yes");
            else System.out.println("no");
        }
    }
}
