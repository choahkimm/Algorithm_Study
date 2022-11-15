package beakjoon.bronze5;

import java.util.Scanner;

public class Beakjoob25304 {
    // 백준 25304. 영수증
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        int totalCnt = sc.nextInt();

        int price, cnt, box=0;
        for(int i=0; i<totalCnt; i++){
            price=sc.nextInt();
            cnt=sc.nextInt();
            box += price*cnt;
        }
        System.out.println((box==sum)? "Yes" : "No");
    }
}
