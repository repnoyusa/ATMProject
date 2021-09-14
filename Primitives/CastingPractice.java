package Primitives;

public class CastingPractice {
    public static void main(String[] args) {

        long l1=120;
        //int i1=l1; // larger data type can not be stored in smaller
        int i2=(int)l1;// explicit casting (Auto Narrowing)

        double db1=l1; //implicit casting (auto widening)

        short apple=126;
        short samsung=2;
        short total= (short)(apple+samsung);
        System.out.println(total);


        byte total1 =(byte) (apple+samsung);
        System.out.println(total1);


        double d1=2.3;

        int i=12;

        i+=d1;// i=i+d1 12+2.3=14.3//when you do compound assignments , you dont need to do explicit casting //

        System.out.println("i-->"+i);//14





    }
}
