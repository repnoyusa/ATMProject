package ScannerPractice;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class ScannerTaskPractice {
    public static void main(String[] args) {
        /*
        by using scanner
        ask user to provide their height and weight and calculate BMI index
        Formula ---> BMI= weight/ (height *height)

         */


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your weight in kilos");
        double weight = input.nextDouble();
        System.out.println("Please enter your height in metres");
        double height = input.nextDouble();
        double BMI = weight/(height*height);

        System.out.println("Your BMI is "+ BMI);



         {

        }






    }
}
