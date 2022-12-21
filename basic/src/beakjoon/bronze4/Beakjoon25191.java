package beakjoon.bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon25191 {
    // 백준 25191. 치킨댄스를 추는 곰곰이를 본 임스
    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int chicken = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int coke = Integer.parseInt(st.nextToken());
        int beer = Integer.parseInt(st.nextToken());

        int eat = coke/2 + beer;
        if(eat>chicken){
            System.out.println(chicken);
        }else System.out.println(eat);
    }
}
