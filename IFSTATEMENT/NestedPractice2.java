package IFSTATEMENT;

import java.util.Scanner;

public class NestedPractice2 {
    public static void main(String[] args) {
        /*
        Ask your candidate if he knows Java
        yes if -selenium
        yes --ask if it knows API testing
        yes ask if it knows SQL
        if all yes "YOU ARE HIRED"

        if Java is not
        print "Please learn Java and come back
        if Selenium is not print WE need someone who has Selenium knowledge
        if API testing no---print we need who know Api testing
        if Sql is no--print we need someone who knows SQL
        */

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome, Do you know Java yes/no");
        String java= input.next();

        if(java.equalsIgnoreCase("Yes")){

            System.out.println("Do you know Selenium?");
            String selenium = input.next();
            if(selenium.equalsIgnoreCase("yes")){
                System.out.println("Do you know API trusting");
                String api = input.next();
                if(api.equalsIgnoreCase("yes")){
                    System.out.println("Do you know SQL");
                    String sql = input.next();
                    if(sql.equalsIgnoreCase("yes")){
                        System.out.println("Congrants ");
                    }else{
                        System.out.println("We need someone who knows SQL");
                    }

                }
            }
        }else{




        }



    }
}
