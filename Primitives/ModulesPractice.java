package Primitives;

public class ModulesPractice {

    public static void main(String[] args) {

        // arithmetic operators are +,-,*,/,% (modulus)
        // % modulus will give the remainder of division

        int studentCount = 9;
        int divisor = 2;
        int resaultOFDivision;
        int reminder = studentCount % divisor;

        resaultOFDivision = studentCount / divisor;
        System.out.println(resaultOFDivision);

        System.out.println("The result is -->" + resaultOFDivision);
        System.out.println("The reminder is-->" + reminder);

        double remainder1 = studentCount % divisor;
        System.out.println(remainder1);


        //% modulus--->finds remainder

        int x = 15; //i want to devide 15 by 6 and find the reminder 3

        int result=x % 6; //15/6=2 R--->3
        System.out.println(result);






    }

}
