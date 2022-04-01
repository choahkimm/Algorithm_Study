package inflearn.D_HashMap_HashSet_TreeSet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class D03_a {

    public static ArrayList<Integer> soulution(int n, int k, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> HM = new HashMap<>();

        // 먼저 index 0,1,2에 대한 window를 만듦
        for(int i=0; i<k-1; i++){
            HM.put(arr[i], HM.getOrDefault(arr[i], 0)+1);
        }
        // 포인터를 이용해 hashmap HM에 arr를 추가하고 빼기 (window 크기 4 유지)
        int lt=0;
        for(int rt=k-1; rt<n; rt++){
            HM.put(arr[rt], HM.getOrDefault(arr[rt],0)+1);
            // 4개 크기의 window가 만들어졌으니 key 개수(매출액의 종류)를 answer에 입력
            answer.add(HM.size());

            // lt 빼기
            HM.put(arr[lt], HM.get(arr[lt])-1); // 위에서 key를 정의했으니 get이면 충분
            // 주의 - value가 0이 됐을 때는 제거해줘야함
            if(HM.get(arr[lt])==0) HM.remove(arr[lt]);
            lt++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int x: soulution(n,k,arr)) System.out.print(x+ " ");
    }
}
