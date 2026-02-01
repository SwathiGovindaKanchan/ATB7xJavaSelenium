package ex_30012026;

import java.util.Scanner;

public class Lab043 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the day from 1 to 7, tell what day it is");
        int day = sc.nextInt();

        switch (day){
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tues");
                break;
            case 3:
                System.out.println("wed");
                break;
            case 4:
                System.out.println("thurs");
                break;
            case 5:
                System.out.println("fri");
                break;
            case 6:
                System.out.println("sat");
                break;
            case 7:
                System.out.println("sun");
                break;
            default:
                System.out.println("No idea, what day it is");
        }
        System.out.println("outiside of the switch loop");
    }
}
