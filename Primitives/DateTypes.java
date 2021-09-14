package Primitives;

public class DateTypes {
    public static void main (String[] args) {

    /*
    there are 8 different primitive data types

            byte , short, int, long, float, double---> for numbers
    char---> for single character

            boolean --> for true/false
    */

    byte number = 6;
//    byte number1 = 127;
    //byte number2 = 129; for byte the rangde is -128 to 127 why its not compile
    short number3 = 100;
    short number4 = 31789;

    int number1;
    int num$=9;
    //int 5num=12 ===> this is NOT OK

    //system.out.println =sout;

    int number5=32_000;// you can use underscore (__) in beetween digits

    int number6= 1_000_000;// you can use (_) in beetwen numbers they are not effecting screen show

    System.out.println(number6);

    long number7=34345;
    long number8=74_813_492_034_854L;// you should use L at the end of the long values ....

        System.out.println(number8);

        float number9 = 2.3f; // you should use f/F at the end of float values
        float number10=56.0f;
        System.out.println("Value of number10--->" +number10);


        double number12=2.1;

        double number13=89;// 89--->89.0 double data type can store int values

        System.out.println();

        //MOST COMMON primitive data toe USAGES ARE int, double, long, boolean




}
}