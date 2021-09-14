package IFSTATEMENT;

import java.util.Scanner;

public class NastedPractice1 {
    public static void main(String[] args) {
        /*
        Ask user for his /her city name
        if the city name is Chicago
        Ask user what is the school mame
        if the school name is 'Techtorial'
        print -->you are lucky to be in the B10
        if school name is not 'Techtorial'
        print please come and visit us

        if the city name is not Chicago
        please--->come to cChicago

         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Whats is your city name");
        String cityName = scanner.nextLine();

        if( cityName.equalsIgnoreCase("Chicago")){
            System.out.println("What is your school name?");
            String schoolName = scanner.nextLine();

            if(schoolName.equalsIgnoreCase("Techtorial")){
                System.out.println("You are one of the Heroes");

            }else {
                System.out.println("Please visit Techtorial");
            }
            }else {
                System.out.println("Please come to Chicago");
            }

        }




    }
