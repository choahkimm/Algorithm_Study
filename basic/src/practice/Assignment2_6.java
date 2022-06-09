package practice;

public class Assignment2_6 {

    // global variable :
    // It can be called and used anywhere.
    int global;

    public static void md(){
        int lovcal=0; // local variable
        // It is used only in this method
    }

    public static void main(String[] args) {
        String constantStr01 = "Hello";
        String constantStr02 = "Hello";

        System.out.println("constantStr01 주소값 : "+System.identityHashCode(constantStr01));
        System.out.println("constantStr02 주소값 : "+System.identityHashCode(constantStr02));

        String heapStr01 = new String("hello");
        String heapStr02 = new String("hello");

        System.out.println("heapStr01 주소값 : "+System.identityHashCode(heapStr01));
        System.out.println("heapStr02 주소값 : "+System.identityHashCode(heapStr02));
    }

}
