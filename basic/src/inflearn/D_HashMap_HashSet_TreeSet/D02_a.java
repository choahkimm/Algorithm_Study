package inflearn.D_HashMap_HashSet_TreeSet;

import java.util.HashMap;
import java.util.Scanner;

public class D02_a {
    public static String solution(String s1, String s2){
        String answer = "YES";
        HashMap<Character, Integer> map = new HashMap<>();
        for(char x : s1.toCharArray()){
            map.put(x, map.getOrDefault(x, 0)+1);
        }
        // map에 첫번째 String이 들어갔다 : {a=2, b=1, C=2}
        // 여기서 key에 따른 value를 카운트다운 시켜서 같으면 아나그램!

        for(char x : s2.toCharArray()){
            if(!map.containsKey(x) || map.get(x)==0) return "NO";
            map.put(x, map.get(x)-1);
            // 이미 위에서 key를 셋팅해놨기 때문에, getOrDefault를 쓸 필요 없음
        }
        return answer;
        // 내가 풀었던 방법은 map을 두 번 만들기 때문에 이 방법이 더 효율적일 것.
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        System.out.println(solution(a,b));
    }
}
