package beakjoon.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon10250 {
    // 백준 10250. ACM 호텔
    public static void main(String[] args) throws IOException {
        // 방 W , 층 H = H*W

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        for(int i=0; i<testCase; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int h = Integer.parseInt(st.nextToken()); // 층 6
            int w = Integer.parseInt(st.nextToken()); // 방 12
            int n = Integer.parseInt(st.nextToken()); // n번째 손님 10

//            int y = (n%h==0)? h: n%h;  //층
//            int x = (n%h==0)? n/h : (n/h)+1 ; // 거리

            int x,y =0;

            if(n%h==0){
                y = h;
                x = n/h;
            }else {
                y= n%h;
                x= (n/h)+1;
            }

            System.out.println(y*100 + x);

        }
    }
}
