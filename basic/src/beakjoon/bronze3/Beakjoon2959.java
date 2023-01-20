package beakjoon.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Beakjoon2959 {
    // 백준 2959. 거북이
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int [] arr = new int[4];
        for(int i=0; i<4; i++){
            arr[i]= Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr); // 오름차순 정렬
        int min = arr[0]; // 제일 작은 수
        int max = arr[2]; // 두 번째로 큰 수
        System.out.println(min*max);
    }
}
