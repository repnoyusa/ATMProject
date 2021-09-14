package IFSTATEMENT;

import java.util.Scanner;

class PRACTICE3 {
    public static void main(String[] args) {
        /*ASK USER TO PROVIDE # BETWEEN 1-7
        - IF USER ENTERS
        1--MONDAY
        2-TUESDAY
        7 ----SUNDAY
     */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the # between 1.....7");

        int number = scanner.nextInt();

        if (number==1){
            System.out.println("Its Monday");
        }

        if (number==2){
            System.out.println("It si Tuesday");
        }

        if (number==3){
            System.out.println("It is Wednesday");

        }

        if(number==4){
            System.out.println("It is Thursday");}


        if (number==5){
            System.out.println("It is Friday");
        }

        if (number==6){
            System.out.println("This is Saturday");
        }
        if(number==7){
            System.out.println("This is sunday");
        }


}










}