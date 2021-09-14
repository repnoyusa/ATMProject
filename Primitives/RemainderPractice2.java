package Primitives;

public class RemainderPractice2 {
    public static void main(String[] args) {

        //find the product of digits from a given number 2222 product means * umnojit
       // print the result as following ;
        //"the product is ...."
        int number=2223;

        int firstDigit=number%10;
        number=number/10;
        System.out.println(firstDigit);

        int secondDigit=number%10;
        number=number/10;
        System.out.println(secondDigit);

        int thirdDigit=number%10;
        number=number/10;
        System.out.println(thirdDigit);

        int forthDigit=number%10;
        number=number/10;

        System.out.println("The product is="+(firstDigit*secondDigit*thirdDigit*forthDigit));

    }
}
