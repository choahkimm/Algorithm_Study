package doitjava.basic;

public class test {
}


/*
    # 연습 순서

    1단계 - 문제 분석
    2단계 - 손으로 풀기
    3단계 - 슈도코드
    4단계 - 코드 구현


    # 합 배열
    S[i] = S[i-1] + A[i]

`   # 구간 합 구하는 공식 (=i에서 j까지 구간합)
    S[i] - S[j-1]

    # D[i][j]
    D[i][j] = D[i][j-1] + D[i-1][j] - D[i-1][j-1] + A[i][j]




 */