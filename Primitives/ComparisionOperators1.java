package Primitives;

public class ComparisionOperators1 {

    public static void main(String[] args) {

        //==,!=, >,<, >=, <=---any comparison operator will return /gives true or false(boolean)

        int x=10;
        int y=10;
        int z=65;


        boolean result1= x==y;//true boolean
        System.out.println(result1);//true

        char ch1='A';
        char ch2=65;
        char ch3=66;

        boolean result2=ch1==ch2;
        System.out.println(result2);//true :'A'=65 in ascii table

        boolean result3=z==ch2;
        System.out.println(result3);

        boolean result4=z==ch3;
        System.out.println(result4);///false

        boolean result5=x>y;
        System.out.println(result5);//false

        boolean r6=x<=y;
        System.out.println(r6);//true

        boolean r7=result1==result2;
        System.out.println(r7);//true

        boolean r8=result1 != result2;
        System.out.println(r8);



    }
}
