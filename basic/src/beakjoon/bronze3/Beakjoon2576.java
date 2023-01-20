package beakjoon.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Beakjoon2576 {
    // 백준 2576. 홀수
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arr = new ArrayList();
        for(int i=0; i<7; i++){
            int n = Integer.parseInt(br.readLine());
            if(n%2!=0) arr.add(n);
        }

        if(arr.size() != 0 ){
            int sum=0;
            for(int a : arr){
                sum += a;
            }
            System.out.println(sum);
            Collections.sort(arr);
            System.out.println(arr.get(0));
        }else {
            System.out.println(-1);
        }

    }
}
