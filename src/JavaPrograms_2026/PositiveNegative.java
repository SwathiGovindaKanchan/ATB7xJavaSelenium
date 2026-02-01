package JavaPrograms_2026;

import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number!!");
        int num = sc.nextInt();
        if (num > 0) {
            System.out.println("Positive number");

        } else if (num<0) {
            System.out.println("Negative number");
        } else {
            System.out.println("zero");
        }
    }
}
