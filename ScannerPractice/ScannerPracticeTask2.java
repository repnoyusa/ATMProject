package ScannerPractice;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class ScannerPracticeTask2 {
    public static void main(String[] args) {
       /* David wants to deposit his money into his bank account
        -he already got $200 in his account
        -he got three different paychecks ($480, $600 and $350)
        -he can only deposit one paycheck at a time
        -after he got his money in the account
                - he bought a phone for $599 and headphone for $299
                - calculate his final money in his account
        open a new class under scanner package and name it as "MoneyTransaction"
                */
        Scanner money = new Scanner(System.in);

        double balance = 200;
        System.out.println("How much do you want to deposit?");
        double firstCheck = money.nextDouble();
        balance+=firstCheck;
        System.out.println("Your current balance is" + balance);

        System.out.println("How much do you want to deposit?");
        double secondCheck = money.nextDouble();
        balance+= secondCheck;
        System.out.println("you current balance " + balance);

        System.out.println("How much do you want to deposit?");
        double thirdCheck = money.nextDouble();
        balance+= thirdCheck;
        System.out.println("your current balance is " + balance);


        System.out.println("What is Your phone price?");
        double phonePrice = money.nextDouble();
        balance-= phonePrice;
        System.out.println("you current balance is; " + balance);

        System.out.println("What is you airpods price?");
        double airpods = money.nextDouble();
        balance-= airpods;
        System.out.println("your current balance is " + balance);

    }
        }

