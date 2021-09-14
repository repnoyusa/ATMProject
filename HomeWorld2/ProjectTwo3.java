package HomeWorld2;

public class ProjectTwo3 {
    public static void main(String[] args) {

        double myBalance=2.36;
        double quarter=25;
        double dime=10;
        double nickel=5;
        double penny=1;
        // get rid of all decimal numbers

        double balance = myBalance*100;
        int countOfQuarter = (int) (balance/quarter);
        balance = balance%quarter;
        int countOfDime= (int) (balance/dime);
        balance=balance%dime;
        int countOfNickels= (int) (balance/nickel);
        int countOfPennies= (int) (balance/penny);

        System.out.println(countOfQuarter);//9
        System.out.println(countOfDime);//1
        System.out.println(countOfNickels);//0
        System.out.println(countOfPennies);//1



//        double totalQuater=myBalance/quater;
//        System.out.println(totalQuater);
//        int remainder= (int)totalQuater;
//        totalQuater=totalQuater-remainder;
//        System.out.printf("%.2f",totalQuater);
//




        }




    }




