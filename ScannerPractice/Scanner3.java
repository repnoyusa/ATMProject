package ScannerPractice;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Scanner3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your full name");
        String fullName = scanner.nextLine();
        System.out.println("your entered this value --->"+fullName);
        System.out.println("What is your state");

       char firstLetter =scanner.next().charAt(0);// indexing
        // illinois --> (8 LETTERS)     letter count is 8
        // 01234567--> index numbers (starts with 0)2

        System.out.println(firstLetter);






    }
}
