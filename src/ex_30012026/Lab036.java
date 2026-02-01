package ex_30012026;

import java.util.Scanner;

public class Lab036 {
    public static void main(String[] args) {
        //Take user input and check if number is odd or even
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        int user_input = sc.nextInt();
        System.out.println(user_input);

        if (user_input%2 == 0){
            System.out.println("even");
        }else {
            System.out.println("odd");
        }
    }
}
