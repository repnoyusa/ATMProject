package Primitives;

public class LogicalNegotian {
    public static void main(String[] args) {

       boolean haveMoney=false;
        System.out.println(haveMoney);//false
        //!haveMoney=true; compile time error

        System.out.println(!haveMoney);

        boolean isCarOn=true;
        isCarOn=false;//reassignment
        System.out.println(!isCarOn);//true




    }
}
