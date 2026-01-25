package ex_25012026;

public class Lab021 {
    public static void main(String[] args) {
        int a=10;
        System.out.println(++a + a++ + a++);
        System.out.println(a);
        //A=++a , exp=11, a=11;
        // +
        // B=a++ -> exp=11, a=12
        //+
        //C=a++ -> exp=12, a=13
        //A+B+C=36, a=13
    }
}
