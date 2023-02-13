package beakjoon.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Beakjoon2975 {
    // 백준 2975. Transactions
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        while (true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int startingBalance = Integer.parseInt(st.nextToken());
            String letter = st.nextToken();
            int money = Integer.parseInt(st.nextToken());
            if(startingBalance==0 && "W".equals(letter) && money==0) break;

            int result = 0;
            if("W".equals(letter)){
                result = startingBalance - money;
            } else if ("D".equals(letter)) {
                result = startingBalance + money;
            }
            System.out.println(result<-200? "Not allowed": result);
        }
    }
}
