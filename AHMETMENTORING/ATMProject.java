package AHMETMENTORING;

import java.util.Scanner;

public class ATMProject {
    public static void main(String[] args) {

        {


            //Create card number and password

            String savedcardNumber = "4455";
            String savedpassword = "0000";
            Scanner scan = new Scanner(System.in);
            int chances = 3;
            int choice;
            double balance = 100;
            int[] options = new int[] {5,10,20,50,100};


            do{

                System.out.println("please enter your card number");
                String cardNuber= scan.next();
                System.out.println("please enter your paswword");
                String pasword = scan.next();



                if (cardNuber.equals(savedcardNumber) && pasword.equals(savedpassword)) {

                    System.out.println("Welcome to Bank ATM");

                    do{

                        System.out.println("What would you like to do today");
                        System.out.println("1 - Withdraw \n2 - Deposit\n3 - Balance\n4 - Payment\n5- Change the password\n6 - Exit");
                        choice = scan.nextInt();
                        switch (choice) {
                            case 1 :
                                for (int i = 0; i<options.length;i++){
                                    System.out.print(options[i]+"$    ");
                                }
                                System.out.println("Withdrawal amount?");
                                int money = scan.nextInt();
                                if (balance>money) {

                                    balance-=money;
                                    System.out.println("you succsecfully withdrew the money!!\n Your new balance is"+balance+"$");
                                    break;
                                }else {
                                    System.out.println("You dont have enough money");
                                    break;
                                }
                            case 2 :

                                for (int i = 0; i<options.length;i++){
                                    System.out.print(options[i]+"$    ");
                                }
                                System.out.println("Deposit amount?");
                                money = scan.nextInt();
                                balance+= money;
                                System.out.println("You got this much money"+balance);



                            case 3 :
                                System.out.println("Your balance is "+balance+" $");
                            case 4 :
                            case 5 :
                            case 6 :
                                break;


                        }
                    } while (true);




                }else {
                    chances --;
                    System.out.println("wrong info try again"+ "you have " + chances + "chances");

                    if (chances ==0) {
                        System.out.println("You card is hold by ATM");
                        break;
                    }
                }

            }while (true);

        }}}











