package inflearn.C_TowPointers_SlidingWindow;

import java.util.Scanner;

public class C05_math {
    //5. 연속된 자연수의 합 - 수학적 방식으로 풀기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int answer=0, cnt=1;
        n--;
        while(n>0){
            cnt++;
            n=n-cnt;
            if(n%cnt==0) answer++; // 연속된 자연수가 가능한 경우
        }
        System.out.println(answer);
    }

    /*
    n   cnt
    14  2
    12  3
    9

    그림 그려가며 하는게 더 편할듯..
     */
}
