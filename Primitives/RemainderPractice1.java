package Primitives;

public class RemainderPractice1 {

    public static void main(String[] args) {

        //123 find sum of digits from given number
        //1+2+3=6--> print ("The sum of digits = 12");
        int number =123;

        int firstDigit=number%10;//123/10-->12 Remainder is 1
        System.out.println("First digit or first remeinder:"+firstDigit);

        number=number/10;
        System.out.println(number);

      int secondDigit= number%10;// 12/10--->1 is 2
        number=number/10;

        int thirdDigit=number%10;
        System.out.println(thirdDigit);

        System.out.println("The sum of the digits is="+(firstDigit+secondDigit+thirdDigit));





    }
}
