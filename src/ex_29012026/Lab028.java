package ex_29012026;

public class Lab028 {
    public static void main(String[] args) {
        String s1 = new String("Swathi Kanchan");//heap area
        String s2 = new String("Swathi Kanchan");//heap area

        String s3 = new String("Swathi Kanchan");//heap area
        System.out.println(s1 == s2);
        System.out.println(s2 == s3);
        System.out.println(s2.equals(s3));


    }
}
