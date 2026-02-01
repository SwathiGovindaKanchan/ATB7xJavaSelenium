package JavaPrograms_2026;

import java.util.Scanner;

public class Vowels_switch2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a char");
        char user_input = sc.next().charAt(0);
        System.out.println(user_input);
        switch (user_input){
            case 'a','e','i','o','u':
                System.out.println("vowels");
                break;

            default:
                System.out.println("Not a vowel, its consonant");
        }

    }
}
