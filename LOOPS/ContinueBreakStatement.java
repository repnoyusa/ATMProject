package LOOPS;

public class ContinueBreakStatement {

    public static void main(String[] args) {

        OUTER:
        for (int number = 0;number<15; number++ ){

           // if(number == 4){
             //   break;
           // }

            for(char ch = 'A' ; ch<'H'; ch++) {
                if(number==10) {
                    break OUTER;// Word OUTER is only for labeling purpose
                    // break statement will stop the execution for curtain condition
                }
                if(ch == 'C' || ch=='D'){
                    continue ;
                }
                System.out.println(number);
                System.out.println(ch);
                System.out.println();
            }}}}
