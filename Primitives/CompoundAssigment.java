package Primitives;

import java.net.Socket;
import java.sql.SQLOutput;

public class CompoundAssigment {
    public static void main(String[] args) {

        int carNumber = 7;

        carNumber = carNumber + 5;
        System.out.println(carNumber);//12 cars

        carNumber += 5;
        System.out.println(carNumber);//17 cars

        carNumber /= 2;//carNumber=carNumber/2;
        System.out.println(carNumber);//8

        int count;

        count = carNumber * 2;
        System.out.println(count);

        int count1;

        //count1+=10; its compile time error because count1 does not have value

        count -= carNumber;// count=count-carNumber;16-8=8
        System.out.println(count);


        int payment = 50;
        payment *= carNumber;//payment=payment*carNumber
        System.out.println(payment);

        int modulus = 1000;
        modulus %= payment;//first java divides 1000 by 400 and finds the reminder, and then it assigns the value for modulus variable

        System.out.println(modulus);
    }


    }


