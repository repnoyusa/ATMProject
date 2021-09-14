package LOOPS;

public class NestedPractice {
    public static void main(String[] args) {


        /*
     Print the month for every year for the years from 2020 to 2023
         */
        for(int year =2020; year<=2023; year++){

            System.out.println(year);{

            for (int months= 1; months<= 12; months++)

                System.out.print(months+" ");{

            System.out.println(" ");

            for( int week= 1; week<=4; week++)

                    System.out.println(week+" week");
    }}}
}}
