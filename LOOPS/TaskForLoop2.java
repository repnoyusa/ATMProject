package LOOPS;

import java.util.Scanner;

class TaskForLoop2 {
    public static void main(String[] args) {

        /*Get a positive integer from user which less than 10
        print out the numbers starting from the given number to 10 is included
        */

        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a positive number less then 10");
        int number = scanner.nextInt();
        for (;  number<=10;  ){
            System.out.println("user number"+number);
            number++;
        }

    }
}