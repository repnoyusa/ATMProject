package IFSTATEMENT;

public class Discounttask {

    public static void main(String[] args) {
        /*

         */

        double payment= 200;
        if(payment>=100){
            payment-= payment*0.2;
            System.out.println("Your payment after 20% discount is; "+payment);
        }
        else {
            payment-=payment*0.5;
            System.out.println("YOUR payment after 5% is "+payment);

        }








    }
}
