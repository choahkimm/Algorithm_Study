package beakjoon.bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Beakjoon16199 {
    // 백준 16199. 나이 계산하기
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //만 나이, 세는 나이, 연 나이
        ArrayList arr = new ArrayList();
        for(int i=0; i<2; i++){
            StringTokenizer st =new StringTokenizer(br.readLine());
            arr.add(Integer.parseInt(st.nextToken()));
            arr.add(Integer.parseInt(st.nextToken()));
            arr.add(Integer.parseInt(st.nextToken()));
        }
        int by = (int) arr.get(0), y = (int) arr.get(3);
        int bm = (int) arr.get(1), m = (int) arr.get(4);
        int bd = (int) arr.get(2), d = (int) arr.get(5);

        if ((bm == m && d >= bd) || (m > bm)) { // 생일이 지났으면
            System.out.println(y - by); // 만 나이
            System.out.println(y - by + 1); // 세는 나이
            System.out.println(y - by); // 연 나이
        }else {
            System.out.println(y-by-1); // 만 나이
            System.out.println(y-by + 1); // 세는 나이
            System.out.println(y-by); // 연 나이
        }
    }
}
