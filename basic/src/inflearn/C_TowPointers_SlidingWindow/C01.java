package inflearn.C_TowPointers_SlidingWindow;

import java.util.*;

public class C01 {
    //1. 두 배열 합치기
    // >>> 이 문젠 단순히 배열에 넣어서 sorting 하는 게 아니었다!!
    // 투포인터 알고리즘(Two Pointers Algorithm) 또는 슬라이딩 윈도우(Sliding Window) 이라는 개념.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        ArrayList list = new ArrayList();
        for(int i=0; i<first; i++){
            list.add(sc.nextInt());
        }
        int second = sc.nextInt();
        for(int i=0; i<second; i++){
            list.add(sc.nextInt());
        }

        //Collections.sort(list);
        list.sort(Comparator.naturalOrder());

        System.out.println(list);

    }
}


/*
1. 두 배열 합치기
설명

오름차순으로 정렬이 된 두 배열이 주어지면 두 배열을 오름차순으로 합쳐 출력하는 프로그램을 작성하세요.


입력
첫 번째 줄에 첫 번째 배열의 크기 N(1<=N<=100)이 주어집니다.

두 번째 줄에 N개의 배열 원소가 오름차순으로 주어집니다.

세 번째 줄에 두 번째 배열의 크기 M(1<=M<=100)이 주어집니다.

네 번째 줄에 M개의 배열 원소가 오름차순으로 주어집니다.

각 리스트의 원소는 int형 변수의 크기를 넘지 않습니다.


출력
오름차순으로 정렬된 배열을 출력합니다.


예시 입력 1

3
1 3 5
5
2 3 6 7 9
예시 출력 1

1 2 3 3 5 6 7 9
 */