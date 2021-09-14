package SWITCH;

import java.util.Scanner;

public class Task1Swith {
    public static void main(String[] args) {
        /* solve the question by using swith
        Ask user to provide a number between 1 to 7
        print the matching name of the day for that number
        whe use enter 1= sout print "Its Monday"*/
        int number;
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter a number between 1-7");
        number = myScanner.nextInt();
        switch (number){
            case 1:
                System.out.println("It is Monday");
                break;
            case 2:
                System.out.println("It is Tuesday");
                break;
            case 3:
                System.out.println("It is Wednesday");
                break;
            case 4:
                System.out.println("It is Thursday");
                break;
            case 5:
                System.out.println("It is Friday");
                break;
            case 6:
                System.out.println("It is Saturday");
                break;
            case 7:
                System.out.println("It is Sunday");
                break;
            default:
                System.out.println("It is default");
                break;

        }
    }
}