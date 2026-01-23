package ex_23012026;

public class Lab013 {
    public static void main(String[] args) {
        //widening
        byte b=10;
        int a=b; //valid implicit casting
        //int a= (int) b; // valid explicit casting
        System.out.println(a);

        //narrowing
        int val=300;
        //byte b1=val; //invalid implicit casting
        byte b1=(byte)val; // valid explicit casting --loss of data;
        System.out.println(b1);

    }
}
