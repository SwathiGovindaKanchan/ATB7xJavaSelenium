package JavaPrograms_2026;

import java.util.Scanner;

public class GradeCalculator_Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the student score!");
        int score = sc.nextInt();

        char grade = 'F';
        if (score>=90 && score<=100){
            grade = 'A';
        } else if (score>=80 && score<90) {
            grade = 'B';
        } else if (score>=70 && score<80) {
            grade = 'C';
        } else if (score>=60 && score<70) {
            grade = 'D';
        } else  {
            grade = 'F';
        }
        System.out.println("your grade is: "+grade);
    }
}
