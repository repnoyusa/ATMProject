package LOOPS;

public class DigitalClock {
    public static void main(String[] args) {
        //Print 11:59

        for(int hours =0; hours<=12; hours++){

            if(hours >4 && hours <8) {
                continue;
            }
            for (int minutes= 0; minutes< 60; minutes++) {

                System.out.println(hours + ":" + minutes + " am");
                System.out.println(hours+":"+minutes+"pm");


                    }}}}

