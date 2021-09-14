package LOOPS;

public class forLoop2 {
    public static void main(String[] args) {
        //Print out the letters form a given String value
        //Chicago

        String text = "chicago";

        for (int i=0; i<text.length(); i++) {

            char letter = text.charAt(i);
            System.out.println(letter);
        }
            for (int index = text.length()-1; index>=0; index--) {
                System.out.println(text.charAt(index));
            }


        String string = "Today is the day practice for loop";

            for(int k = 0; k<=string.length(); ) {
                if (string.charAt(k) == 'o') {
                    System.out.println(string.charAt(k));
                }

                string.charAt(0);// T==o
                string.charAt(1);// o==o --> sout (string.chartAt(1)
                string.charAt(2);
    /*
       count the amount of the letter 'o'
     */





}}}
