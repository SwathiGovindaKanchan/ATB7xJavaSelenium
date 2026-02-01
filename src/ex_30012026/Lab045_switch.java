package ex_30012026;

import java.util.Scanner;

public class Lab045_switch {
    public static void main(String[] args) {
        //JDK>13 then it will support below code
        int itemcode = 006;

        switch (itemcode){
            case 001,002,003:
                System.out.println("it is electronics gadget");
                break;
            case 004,005,006:
                System.out.println("it is mechanical gadget");
                break;
            default:
                System.out.println("None");

        }
    }
}
