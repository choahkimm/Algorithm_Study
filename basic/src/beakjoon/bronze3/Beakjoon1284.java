package beakjoon.bronze3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon1284 {
    // 백준 1284. 집 주소
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            int cnt = 0;
            String n = br.readLine();
            if(n.equals("0")){
                break;
            }

            String[] strArray = n.split("");
            for(String s : strArray) {
                if(s.equals("1")) cnt +=2;
                else if(s.equals("0")) cnt +=4;
                else cnt+=3;
            }
            cnt+= strArray.length-1;
            System.out.println(cnt+2);
        }


        // 또 다른 방법 :
        /*

        			for(int i = 0; i < N.length(); i++) {
				if(N.charAt(i) == '1') {
					length += 3;
				}else if(N.charAt(i) == '0') {
					length += 5;
				}else {
					length += 4;
				}

         */
    }
}
