package IFSTATEMENT;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class elseIFpractice {
    public static void main(String[] args) {

        /*
        user will enter a number
        if its number fall in to range of0 to 5 "Your number is between 0---5"
        if its number fall in to range of 6 to 10 "Your number is between 6---10"
        if its number fall in to range of 11 to 16 "Your number is between 11---16"
        if its number fall in to range of 16 to 20"Your number is between 16---20" */

        Scanner input = new Scanner(System.in);
        System.out.println("PLEASE PICK THE NUMBER O TO 20 ");
        int number = input.nextInt();

        if (number >= 0 && number <= 5) {
            System.out.println("Your number is between 0-5");
        } else if (number >= 6 && number <= 10) {
            System.out.println("Your number is between 6-10");
        } else {
            System.out.println("Your number is wrong");



            Scanner scanner = new Scanner(System.in);
            System.out.println(" Please provide first test score between 0 to 100");
            int firstScore = scanner.nextInt();
            System.out.println(" Please provide second test score between 0 to 100");
            int secondScore = scanner.nextInt();
            System.out.println(" Please provide third test score between 0 to 100");
            int thirdScore = scanner.nextInt();

            int average =(firstScore+secondScore+thirdScore)/3;


            if (average>=90 && average<=100){
                System.out.println("Your average score is +"+average + "and letter grade is A");
            }else if (average>=80 && average<90){
                System.out.println("Your average score is +"+average + "and letter grade is B");
            }else if (average>=80 && average<90) {
                System.out.println("Your average score is +" + average + "and letter grade is C");
            }else if (average>= 60 && average<70) {
                System.out.println("Your average score is +" + average + "and letter grade is D");
            }else{
                System.out.println("You need to take this course again!!");



            }





        }
    }
    /*
There is a course that user need to pass
User got three test scores for this course
To be able to print/show users Letter grade
-Ask User to provide those three test scores as integer 2 between 0 and 100
-find the average of the provided test scores
-Based on the average score
- if the average is 90 to 100 --> print 'Your average test score is <average> and letter grade is A'
- if the average is 80 to 89 --> print 'Your average test score is <average> and letter grade is B'
- if the average is 70 to 79 --> print 'Your average test score is <average> and letter grade is C'
- if the average is 60 to 69 --> print 'Your average test score is <average> and letter grade is D'
- if the average is less than 60 --> 'You need to take this course again!!'
*/





        }





