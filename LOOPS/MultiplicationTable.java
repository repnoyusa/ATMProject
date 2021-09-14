package LOOPS;

public class MultiplicationTable {
    public static void main(String[] args) {
        //CREATE MULTIPLICATION TABLE FOR NUMBER 6
        //FROM 1-10
        //6*1=6
        //6*2=12
        //6*10=60
        int number = 6;
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + "*" + i + " =" + number * i);
            //use FOR LOOP to create a multiplication table for 1 to 10
            // from 1to 10
            // 6*1=6   7*1=7
            //6*2=12 7*2=14
            //...
            //6*10=60    7*10=70


            for (int num1 = 1; num1 <= 10; num1++) {

                for (int num2 = 1; num2 <= 10; num2++) {
                    System.out.println((num1 + "*" + num2 + "=" + num1 * num2));
                }

            }
        }
    }}