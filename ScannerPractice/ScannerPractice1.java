package ScannerPractice;

import java.util.Scanner;

public class ScannerPractice1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String firstName = "Fluffy";
        String lastname = "Brown";

        System.out.println(lastname);
        String random = input.nextLine();
        System.out.println(random);

        String middleName;
        middleName= input.nextLine();
        System.out.println(firstName + middleName + lastname);







    }




}
