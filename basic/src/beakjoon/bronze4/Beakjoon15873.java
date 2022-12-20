package beakjoon.bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beakjoon15873 {
    // 백준 15873. 공백 없는 A+B
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        // 두 수가 다 10이면 20 출력
        if(input.contains("1010")){
            System.out.println(20);
        }
        // 하나의 수만 10이면 10 + 나머지 수
        else if(input.contains("10")){
            input=input.replaceAll("10","");
            System.out.println(Integer.parseInt(input) + 10);
        }
        //두 수가 모두 10이 아니면
        else {
            System.out.println(Integer.parseInt(input)/10 +
                    Integer.parseInt(input)%10);
        }



//        if (input.length()==3) {
//            String s = String.valueOf(input.charAt(0) - '0') +
//                    (input.charAt(1) - '0');
//            System.out.println(Integer.parseInt(s) + (input.charAt(2) - '0'));
//        } else if (input.length()==4) {
//            String s1 = String.valueOf(input.charAt(0) - '0') +
//                    (input.charAt(1) - '0');
//            String s2 = String.valueOf(input.charAt(2) - '0') +
//                    (input.charAt(3) - '0');
//            System.out.println(Integer.parseInt(s1)+ Integer.parseInt(s2));
//        } else {
//            System.out.println((input.charAt(0) - '0') + (input.charAt(1) - '0'));
//        }
}
}

/**
 * 참고
 *  char형 문자들은 각각 대응되는 코드값이 있으며 이 관계는
 *  아스키코드와 유니코드로 정리되어 있습니다.
 *  때문에, char형 문자들을 int형 변수에 대입하면 문자값에 해당하는
 *  10진수 코드번호가 저장되는 것입니다.
 */