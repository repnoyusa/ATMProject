package IFSTATEMENT;

import java.util.Scanner;

public class daysOFweek2 {
    public static void main(String[] args) {
        /* ask user to enter first letter of the day print
        M--> its Monday
        T--> its Tuesday or Thursday
        w-- its wendesday
        f--friday
        s-- its saturday or sunday*/


        Scanner scanner = new Scanner(System.in);



        System.out.println("Please enter first letter of The day");

        String Letter = scanner.nextLine();
        if (Letter.equalsIgnoreCase("M")){
            System.out.println("Its is Mobday");
        }
        if (Letter.equalsIgnoreCase("t"));{
            System.out.println("it is Tuesday or Thursday");
        }

        if (Letter.equalsIgnoreCase("W")){

        System.out.println("its is Wendesday");}


        else {
            System.out.println("Your entry is not valid ");
        }



    }
}
