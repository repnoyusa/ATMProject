package ScannerPractice;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class ScannerPractice2 {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);//input can be any name//this is creation of scanner object
        System.out.println("Please enter your name");
        String name = input.nextLine();//input.next(); //
        System.out.println("Your name is: "+name);

        System.out.println("Please enter your Last Name");

        String lastName=input.nextLine();

        System.out.println("Your full name is : "+name+""+lastName);

        System.out.println("Please enter your age");
        int age=input.nextInt();
        System.out.println("Your age will be " +(age+10)+" in 10 Years");

        int ageIn5Years=age+5;
        System.out.println("your age will be "+ageIn5Years+"in the next 5 years");

        System.out.println("please enter your city name");
        name+=input.nextLine();
        System.out.println(name);



       // String number ="1";
       // number +="2";// number=number +"2"; 12
        //number +=2;// number =number+2;122
        //System.out.println(number);//







    }
}
