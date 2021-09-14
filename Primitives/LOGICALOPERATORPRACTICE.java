package Primitives;

public class LOGICALOPERATORPRACTICE {
    public static void main(String[] args) {
        /* you need to pass a course
        -if you attend 95% of the classes or
        -you get 70 as passing score out of 100*/
       //  */

        int AttendReq=95;

         int scoreReq=70;

         int MyAttend=99;
         int myScore=80;

         boolean pass=myScore>=scoreReq||myScore>=scoreReq;
        System.out.println(pass);


    }
}
