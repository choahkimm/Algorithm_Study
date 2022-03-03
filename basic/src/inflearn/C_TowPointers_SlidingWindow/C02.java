package inflearn.C_TowPointers_SlidingWindow;

import java.util.ArrayList;
import java.util.Scanner;

public class C02 {
    // 2. 공통원소 구하기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // n 크기의 a 배열 만들기
        int n = sc.nextInt();
        int[] a=new int[n];
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }

        // m 크기의 b 배열 만들기
        int m = sc.nextInt();
        int[] b=new int[m];
        for(int i=0; i<m; i++){
            b[i]=sc.nextInt();
        }

        ArrayList<Integer> answer = new ArrayList<>();
        int p1=0,p2=0;
        while(p1<n && p2<m){
            if(a[p1] == b[p2]) answer.add(a[p1]);
        }

        for(int x : answer){
            System.out.print(x+" ");
        }

    }
}



/*
2. 공통원소 구하기
설명

A, B 두 개의 집합이 주어지면 두 집합의 공통 원소를 추출하여 오름차순으로 출력하는 프로그램을 작성하세요.


입력
첫 번째 줄에 집합 A의 크기 N(1<=N<=30,000)이 주어집니다.

두 번째 줄에 N개의 원소가 주어집니다. 원소가 중복되어 주어지지 않습니다.

세 번째 줄에 집합 B의 크기 M(1<=M<=30,000)이 주어집니다.

네 번째 줄에 M개의 원소가 주어집니다. 원소가 중복되어 주어지지 않습니다.

각 집합의 원소는 1,000,000,000이하의 자연수입니다.


출력
두 집합의 공통원소를 오름차순 정렬하여 출력합니다.


예시 입력 1

5
1 3 9 5 2
5
3 2 5 7 8
예시 출력 1

2 3 5
 */