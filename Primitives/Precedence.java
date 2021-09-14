package Primitives;

public class Precedence {


    public static void main(String[] args) {


        int count=10+15; //25

        int count1=count +3*5;// 25+15

        System.out.println(count);//25

        System.out.println(count1);//40


        int count2=count-count1/2*3;
        System.out.println(count2);//-35

        int count3=6/3*5%3;//1
        System.out.println("count 3 = "+ count3);//1

        int count4=6-4-count+count3;
        System.out.println(count4);//-22


        System.out.println("total of count 3 and count4-->"+ (count3+count4));


        //50 food , 250 for electronics, 80 for shoes
        // tax for food 10%, electronics 20%, shoes 15%

        //50*0.10   250*0.20  80*0.15

        int food=50;
        int elec=250;
        int shoes=80;
        double foodTax=food*0.10;
        double elecTax= elec*0.20;
        double shoesTax=shoes*0.15;
        int totalTax=67;

        System.out.println(foodTax+elecTax+shoesTax );

        System.out.println(totalTax+50+250+80);//447$

        double number=(20* (.1+500)*2+30)*0.07;
        System.out.println(number);







    }
}
