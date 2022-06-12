package practice;

public class Assignment3_2 {
    public static void main(String[] args) {
        String str = "My name is Choah Kim and I am a very kind girl";
        System.out.println(str.length()); // 46
        System.out.println(str.charAt(11)); // C
        System.out.println(str.charAt(45)); // l
        System.out.println(str.contains("ba")); // false
        System.out.println(str.indexOf("Choah")); // 11
        System.out.println(str.indexOf('a',38)); // -1
        for(String s : str.split(" ")){
            System.out.print(s + " "); //My name is Choah Kim and I am a very kind girl
        }
        System.out.println();
        for(String s : str.split(" ", 3)){
            System.out.println(s); // My name is Choah Kim and I am a very kind girl I am a very kind girl
        }
        System.out.println(str.substring(25)); // I am a very kind girl
        System.out.println(str.substring(11,23)); // Choah Kim an

    }
}
