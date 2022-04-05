package inflearn.D_HashMap_HashSet_TreeSet;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class D04 {
    //4. 모든 아나그램 찾기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();

        // String으로 문자열 받아서 하나하나 char로 만들어 배열 생성
        s = String.valueOf(s);
        char[] array = s.toCharArray(); // toCharArray() 메소드는 문자열을 char형 배열로 바꿔준다.
//        for(int i=0; i<s.length(); i++){
//            System.out.println(array[i]);
//        }

        int answer=0;
        HashMap<Character, Integer> hashmap = new HashMap<>();
        // sliding window
        for(int i=0; i<t.length(); i++){
            hashmap.put(t.charAt(i), hashmap.getOrDefault(t.charAt(i),0)+1);
            hashmap.put(array[i], hashmap.getOrDefault(array[i],0)-1);
            if(hashmap.containsKey(t.charAt(i)) && hashmap.get(t.charAt(i))==0) answer++;
        }
        System.out.println(hashmap);
        System.out.println(answer);
        for(int rt=0; rt<s.length(); rt++){

        }



        System.out.println(Arrays.toString(array));
    }
}

/*
4. 모든 아나그램 찾기
설명

S문자열에서 T문자열과 아나그램이 되는 S의 부분문자열의 개수를 구하는 프로그램을 작성하세요.

아나그램 판별시 대소문자가 구분됩니다. 부분문자열은 연속된 문자열이어야 합니다.


입력
첫 줄에 첫 번째 S문자열이 입력되고, 두 번째 줄에 T문자열이 입력됩니다.

S문자열의 길이는 10,000을 넘지 않으며, T문자열은 S문자열보다 길이가 작거나 같습니다.


출력
S단어에 T문자열과 아나그램이 되는 부분문자열의 개수를 출력합니다.


예시 입력 1

bacaAacba
abc
예시 출력 1

3
힌트


 */