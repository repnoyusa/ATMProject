package Primitives;

public class NumericPromotion {
    public static void main(String[] args) {


        byte b1=112;

        short sh1=3;

        //byte sum1=b1+sh1; it's not compile because of the NumericPromotion

        int sum1=b1+sh1;//java promotes smaller data types (byte ,short) to INT data type

        float fl1=2.3f;

        double db1=3.4;

        //float sum2 = fl1+db1; // compile time error

        double sum2 = fl1+db1;

        System.out.println(sum2);

      // int  product= sum1*sum2; // result in decimal number that's why i can't store it in aINT data type
        double product1=-sum1*sum2;

       //double db2= i1;


        //int i2=db2;.//not compile

        //long l1=db2;//not compile















    }
}
