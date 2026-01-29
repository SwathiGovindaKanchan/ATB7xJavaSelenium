package ex_29012026;

public class Lab027 {
    public static void main(String[] args) {
        String name = "Swathi Kanchan";//SCP
        String name1 = "Swathi Kanchan";//SCP

        String name2 = new String("Swathi Kanchan");//heap area


      //  System.out.println(name == name1);//check for the reference
       // System.out.println(name.equals(name1));// check for the content

        System.out.println(name1 == name2); // now it is false bcz the memory location is different
        System.out.println(name1.equals(name2));//check for the content


    }
}
