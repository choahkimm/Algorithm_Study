package inflearn.A_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class String03{
    // 3. 문장 속 단어

    public static int solution(String str){
        int answer= 0;

        return answer;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

// 1. StringTokenizer 이용 : 결과값이 문자열 - ab cd
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);
        String[] strArr = new String[st.countTokens()];

        int i = 0;
        while (st.hasMoreTokens()){
            strArr[i++] = st.nextToken();  // 쪼갠 token을 배열에 담기
        }

        for(int j = 0; j< strArr.length; j++){
            //System.out.println(j + ": " + strArr[j]);
//            if(strArr[j].length() > strArr[j+1].length()){
//                System.out.println(strArr[j]);
//                if(strArr[j].length()==strArr[j+1].length()){
//                    break;
//                }
//            }
            System.out.println(strArr[j]);
        }


    }


// 2. split() 정규식 이용 : 결과값이 문자열 배열 - [ab, cd]
//        String[] strArr = br.readLine().split("\\s");
//        System.out.println(strArr);


    }


