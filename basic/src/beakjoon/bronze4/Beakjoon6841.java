package beakjoon.bronze4;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Beakjoon6841 {
    // 백준 6841. I Speak TXTMSG
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String,String> map = new HashMap<>();
        map.put("CU","see you");
        map.put(":-)","I'm happy");
        map.put(":-(","I'm unhappy");
        map.put(";-)","wink");
        map.put(":-P","stick out my tongue");
        map.put("(~.~)","sleepy");
        map.put("TA","totally awesome");
        map.put("CCC","Canadian Computing Competition");
        map.put("CUZ","because");
        map.put("TY","thank-you");
        map.put("YW","you're welcome");
        map.put("TTYL","talk to you later");

        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
                String input = sc.nextLine();
                String answer = map.get(input);
                System.out.println(answer!=null? answer: input );
            }
        sc.close();
        }
}
