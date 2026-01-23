package ex_23012026;

public class Lab014 {
    public static void main(String[] args) {

        //narrowing
        int course=300;
        float gst=18.45f; //invalid implicit casting
       // int total_price= course+gst; //implicit narrowing
        int total_price= course +(int)gst; // valid explicit casting --loss of data;
        System.out.println(total_price);

    }
}
