package LOOPS;

import org.w3c.dom.ls.LSOutput;

public class PERFECTnumber {
    public static void main(String[] args) {

        //perfect number : A NUMBER is equals to its dividers (expect number itself) sum
        // 6>>1,2,3>>>1+2+3=6 6=6 is perfect number

        int perfectNum= 6;
        int sum = 0;

        for( int divisor =1 ; divisor<perfectNum; divisor++){
            if(perfectNum%divisor==0);{
                sum = sum+divisor;
            }}

        System.out.println("The sum is>>>>"+sum);
        if(perfectNum==sum) {

            System.out.println("the number " + perfectNum + "is a perfect number");
        }else{
            System.out.println("The number "+perfectNum+" is not a perfect number");
        }
        }}
