package inflearn.A_String;

import java.util.*;

public class String01 {
    public static void main(String[] args){
        // 문자열을 입력받기 위해 Scanner util 사용
        Scanner scan = new Scanner(System.in);

        // 콘솔창에서 입력받은 '문자열'과 '문자'를 저장
        // 대소문자가 다르면 같은 문자로 인식을 못하니까 모두 대문자 형태로 변환
        String inputString = scan.nextLine().toUpperCase();
        char inputChar = scan.next().charAt(0); // char 형태이기 때문에 charAt()
        inputChar = Character.toUpperCase(inputChar);

        // 입력받은 문자열에 특정 문자(inputChar)가 몇 개 존재하는지 구하기
        // 문자열을 문자 단위로 쪼개서 배열을 만들어주는 toCharArray() 메소드 이용
        int answer=0;
        for(char c : inputString.toCharArray()){
            if(inputChar == c) {
                answer++;
            }
        }
        System.out.println(answer);
    }
}
