package IFSTATEMENT;

public class Practice2 {
    public static void main(String[] args) {


        int age = 12;

        double money = 200;

        if (age >= 18) {
            System.out.println("you can go to picnic");
        }
        if (money >= 100) {
            System.out.println("You can go to picnic this ammount;" + money);
        }
        //combine these two conditions to create an IF statement wich will accept
        //ether of condition of age or money
        //print "You are ok with one of the requirement "

        if (age>=18 || money>=100){

        System.out.println("You are ok with one of the requirement ");

     }


    }}


