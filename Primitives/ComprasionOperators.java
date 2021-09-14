package Primitives;

import java.security.spec.RSAOtherPrimeInfo;

public class ComprasionOperators {
    public static void main(String[] args) {

        int a =3;
        int b =4;
        int c=4;
        System.out.println(a==b);//false
        System.out.println(b==c);//true
        System.out.println(!(a==b));//true
        System.out.println(!(b==c));//false
        //=========================//

      //  int a =3;//
       // int b =4;//
        //int c=4;//

        System.out.println(a != b);//true

        System.out.println(!(b != c));


        System.out.println(a>b);//false
        System.out.println(b>c);//false

        System.out.println(b<c);//false
        System.out.println(b>c);//false

       // int a =3;
        //int b =4;
       // int c=4;

        System.out.println(a>=b);//false
        System.out.println(c>=b); //true
        //============//

        System.out.println(c<=b);        //true
        System.out.println(a<=c);         //true











    }
}
