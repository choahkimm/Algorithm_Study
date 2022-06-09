package practice;

public class Assignment3 {
    public static void main(String[] args) {
        // 별 찍기
//        for(int i=0; i<6; i++){
//            for(int j=0; j<i; j++){
//             System.out.print("*");
//            }
//            System.out.println();
//        }

        // 역 별 찍기
        for(int i=0; i<6; i++){
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            for(int k=5; k>i; k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
