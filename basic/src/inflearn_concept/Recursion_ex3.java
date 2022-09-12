package inflearn_concept;

public class Recursion_ex3 {
    // 순환 알고리즘의 설계

    // - 적어도 base case, 즉 순환되지 않고 종료되는 case가 있어야 함
    // - 모든 case는 결국 base case로 수렴해야 함

    // 암시적(implicit) 매개변수를 명시적(explicit) 매개변수로 바꿔라
    // ex1) 순차 탐색

    int search(int [] data, int n, int target){
        for(int i=0; i<n; i++){
            if(data[i]==target)
                return i;
        }
        return -1;
    }
    // 이 함수의 미션은 data[0]에서 data[n-1] 사이에서 target을 검색하는 것이다.
    // 하지만 검색 구간의 시작 인덱스 0은 보통 생략한다. 즉 암시적 매개변수이다.
}
