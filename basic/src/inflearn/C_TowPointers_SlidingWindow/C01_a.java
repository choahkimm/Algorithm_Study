package inflearn.C_TowPointers_SlidingWindow;

import java.util.ArrayList;
import java.util.Scanner;

public class C01_a {
    //1. 두 배열 합치기

    // 투 포인터 알고리즘 (슬라이딩 윈도우)
    // 완전 탐색 알고리즘으로 하면 시간초과가 나는 경우가 있다. 투포인터는 그 대안.

    // 리스트에 순차적으로 접근해야할 때 두 개의 점의 위치를 기록하면서 처리하는 알고리즘
    // 참고) 비슷한 것 같지만, 슬라이딩 윈도우는 어느 순간에도 구간의 넓이가 동일하다는 것이 차이점!
        public static ArrayList<Integer> solution(int n, int m, int[] a, int[] b){
            ArrayList<Integer> answer = new ArrayList<>();
            int p1=0, p2=0;
            while(p1<n && p2<m){
                if(a[p1]<b[p2]) answer.add(a[p1++]);
                else answer.add(b[p2++]);
            }
            while(p1<n) answer.add(a[p1++]);
            while(p2<m) answer.add(b[p2++]);
            return answer;
        }

        public static void main(String[] args){
            Scanner kb = new Scanner(System.in);
            int n=kb.nextInt();
            int[] a=new int[n];
            for(int i=0; i<n; i++){
                a[i]=kb.nextInt();
            }
            int m=kb.nextInt();
            int[] b=new int[m];
            for(int i=0; i<m; i++){
                b[i]=kb.nextInt();
            }
            for(int x : solution(n, m, a, b)) System.out.print(x+" ");
        }
}
