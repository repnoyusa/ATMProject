package Primitives;

import javax.sound.midi.Soundbank;

public class LogicalOperator {

    public static void main(String[] args) {
        int myAge=15;

        boolean myDress=true;

        int ageReq=21;
        boolean dressCode=true;

       //boolean Can_I_Attend= myAge>=ageReq && myDress==dressCode;
      //  System.out.println(Can_I_Attend);
        ///======================================

        int myNewAge=28;

        boolean myMoney=false;

        int ageReq1=18;

        boolean moneyReq=true;

        boolean CanIGo=myAge>=ageReq1 || myMoney==moneyReq;
        System.out.println(CanIGo);

        //there is event for the kids they must be 5 or older, 12or younger

        // the other req is they need to be height 46"or more
        // to be able to attend

       int kidAge=2;
       int kidHeight=36;
       int minAge=5;
       int maxAge=12;
       int reqHeight=46;

     boolean ok= (kidAge>=minAge && kidAge<=maxAge) && kidHeight>=reqHeight;
        System.out.println(ok);


    }
}
