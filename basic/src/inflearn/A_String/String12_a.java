package inflearn.A_String;

import java.util.Scanner;

public class String12_a {
    public static String solution(int n, String str){
        String answer = "";
        for(int i=0; i<n; i++){
            String tmp = str.substring(0,7).replace('#','1').replace('*','0');
            int num = Integer.parseInt(tmp, 2);
            answer += (char)num;
            str = str.substring(7); // index 7부터 시작하는 단어로 끊어주고 또 반복
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        System.out.println(solution(n, str));
    }
}
