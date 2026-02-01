package ex_30012026;

import java.util.Scanner;

public class Lab044_switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the browser name");
        String browsername = sc.next();
        browsername = browsername.toLowerCase();

        switch (browsername){
            case "chrome":
                System.out.println("starting the browser chrome");
                break;
            case "firefox":
                System.out.println("starting the browser FF");
                break;
            case "edge":
                System.out.println("starting the browser edge");
                break;


            default:
                System.out.println("No idea, what browser is this");
                break;
        }
    }
}
