package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Calculator {
    // 정산 시스템
    // n명 여행, m명만 결제
    // 누가 누구에게 얼만큼 보내야 하는가?
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer,Integer> expenditure = new HashMap<>();
        int n = Integer.parseInt(br.readLine()); // 총 인원 수
        for(int i=1; i<=n; i++){ // 각자 쓴 돈 입력
            expenditure.put(i,Integer.parseInt(br.readLine()));
        }
        //todo: java8부터 루프 없이 stream 사용해 합계 연산 가능
        int sum = expenditure.values().stream().mapToInt(Integer::intValue).sum();
        int Nsum = sum/n;
        System.out.println("*총액 : " + sum);
        System.out.println("*인당 내야할 돈 : " + Nsum);


        Integer maxVal = Collections.max(expenditure.values());

        Set<String> foundKeys = new HashSet<>();
        for (Map.Entry<Integer, Integer> entry : expenditure.entrySet()) {
            if (Objects.equals(entry.getValue(), maxVal)) {
                Integer key = entry.getKey();
                foundKeys.add(String.valueOf(key));
            }
        }
        System.out.println("*총무 : " + foundKeys);
        for (int i=1; i<=n; i++){
            if((expenditure.get(i) - Nsum) > 0 ) // 낸 돈이 더 많다면
                System.out.println((foundKeys.equals(i))? i+"이(가) 받아야 할 돈 : " + (expenditure.get(i) - Nsum ) :
                        i+"이(가) 받아야 할 돈 : " + foundKeys+ "-> [" + i+"] "+ (expenditure.get(i) - Nsum ));
            else System.out.println(i+"이(가) 내야 할 돈 : " + foundKeys+ "에게 "+ -1*(expenditure.get(i) - Nsum ));
        }






//        System.out.println(expenditure);
    }
}
