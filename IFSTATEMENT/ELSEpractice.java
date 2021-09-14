package IFSTATEMENT;

import java.util.Scanner;

public class ELSEpractice {
    public static void main(String[] args) {
        /*ask user to enter on integer value
        check and print;
         if the number is EVEN
         otherwise print "odd number"
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer number");
        int a= input.nextInt();
        if(a % 2==0){
            System.out.println("Your number is EVEN "+a);
        }
    else{
            System.out.println("Your number is odd  "+a);
        }

    }





}
