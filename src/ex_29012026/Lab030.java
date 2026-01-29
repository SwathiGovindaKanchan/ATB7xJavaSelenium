package ex_29012026;

import java.util.Locale;

public class Lab030 {
    public static void main(String[] args) {
        String password = "Password@123";
        String pass_u = password.toLowerCase();
        System.out.println(pass_u);

        //pass_u == password;
        System.out.println(pass_u == password);
        System.out.println(pass_u.equals(password));
        System.out.println(pass_u.equalsIgnoreCase(password));
        //Password@123 == password@123 ==PASSword@123 it will consider everything if we chose ignorecase
        System.out.println(password.substring(0,3));
        System.out.println(password.indexOf('d'));
        System.out.println(password.length());
    }
}
