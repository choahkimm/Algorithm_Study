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


    // ex2) 매개변수의 명시화 : 순차 탐색
    // 이 함수의 미션은 data[begin]에서 data[end] 사이에서 target을 검색한다.
    // 즉, 검색구간의 시작점을 명시적(explicit)으로 지정한다.
    int search2(int [] data, int begin, int end, int target){
        if(begin>end)
            return -1;
        else if(target==data[begin]) //end
            return begin;
//            return end;
        else
            return search2(data, begin+1, end, target);
//            return search2(data, begin, end-1, target);
        // recursion을 쓰려면,, 가능하면 명시적으로 매개변수를 지정해주는 것이 좋음
    }

    // ex3) 매개변수의 명시화 : 최대값 찾기
    int findMax(int [] data, int begin, int end){
        if(begin==end)
            return data[begin];
        else
            return Math.max(data[begin], findMax(data, begin+1, end));
    }

    // ex4) 최대값 찾기 다른 버전
    int findMax2(int [] data, int begin, int end){
        if(begin==end)
            return data[begin];
        else {
            int middle = (begin+end)/2;
            int max1 = findMax2(data, begin, middle);
            int max2 = findMax2(data, middle+1, end);
            return Math.max(max1, max2);
        }
    }

    // 이진검색 알고리즘 Binary Search
    public static int binarySearch(String[] items, String target, int begin, int end ){
        if(begin>end)
            return -1;
        else {
            int middle = (begin+end)/2;
            int compResult = target.compareTo(items[middle]);
            if(compResult == 0)
                return middle;
            else if(compResult<0)
                return binarySearch(items, target, begin, middle-1);
            else
                return binarySearch(items, target, middle+1, end);

        }
    }
}
