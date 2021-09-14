package Primitives;

import java.sql.SQLOutput;

public class BOOLEANPractice {
    public static void main(String[] args) {

        // for boolean data type you can give value of true or false

        boolean isLightOn=true;

        boolean isBreakTime;
        isBreakTime=isLightOn;

        System.out.println(isLightOn);
        System.out.println(isBreakTime);

        int num=6;
        System.out.println(num);
        int num1=num;
        System.out.println(num1);

        boolean isClear=false;
        System.out.println(isClear);

        //System.out.println(isBreakTime+isClear);//it will not compile

        System.out.println("!!!!"+isBreakTime+isClear);


        double db=1234456;
        boolean bl=true; //WORK/YES/ON/OPEN
        boolean bl2=false;// NOT WORKING/ OFF/ CLOSED/ NO
        //boolean bl3= "yes"; NO POSSOBLE!

        int i1=5;
        int i2=5;
        int i3=10;

        // is i1 equals to i2?---->yes true  i1==12==true
        // is i1 equals to i3--->false  i1==i3-->false





    }
}
