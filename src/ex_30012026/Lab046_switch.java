package ex_30012026;

public class Lab046_switch {
    public static void main(String[] args) {
        //JDK>17 then we cannot write break all the time if we use "->" like this
        int itemcode = 007;

        switch (itemcode){
            case 001,002,003 -> System.out.println("it is electronics gadget");

            case 004,005,006-> System.out.println("it is mechanical gadget");

            default -> System.out.println("Hello");

        }
    }
}
