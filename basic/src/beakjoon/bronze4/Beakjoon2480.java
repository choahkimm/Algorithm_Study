package beakjoon.bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Beakjoon2480 {
    // 백준 2480. 주사위 세 개
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int [] arr = {a,b,c};
        Arrays.sort(arr);
        int cnt=0;
        int num=0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(i != j){ // 본인 값 비교 X
                    if(arr[i]==arr[j]){
                        cnt ++;
                        num=arr[i];
                    }
                }
            }
        }

        if(cnt==3) System.out.println(10000 + num*1000);
        else if(cnt==2) System.out.println(1000 + num*100);
        else System.out.println(arr[0]*100);
    }
}

//1차 실패 기록
