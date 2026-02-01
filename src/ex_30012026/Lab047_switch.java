package ex_30012026;

import java.util.Scanner;

public class Lab047_switch {
    public static void main(String[] args) {
       //WAP name,age, salary
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.next();
        System.out.println("enter your age");
        int age = sc.nextInt();
        System.out.println("enter your salary");
        double salary = sc.nextDouble();
        System.out.println("your details are " +name);
        System.out.println("your age is " +age);
        System.out.println("your salary is " +salary);
        sc.close();
    }
}
