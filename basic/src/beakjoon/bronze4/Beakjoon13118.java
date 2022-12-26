package beakjoon.bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Beakjoon13118 {
    // 백준 13118. 뉴턴의 사과
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 사람들의 위치 p1,p2,p3,p4 - x 축
        Integer [] arr = new Integer[4];

        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        st= new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        st.nextToken();
        st.nextToken();

        // 배열에 특정 숫자가 포함됐는지 알기 위해
        // List 변환 후 contains 메서드 사용
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));

        // 사과의 정보 x,y,r
        for(int j=0; j<arr.length; j++){
            if(arr[j] == x ) {
                System.out.println(j+1);
            }
        }

        if(!list.contains(x)) System.out.println(0);
    }
}
