package STRING;

import java.util.Locale;

public class Method4 {
    public static void main(String[] args) {


        String a = "John";

        boolean bl1 = a.equals("b");// true
        System.out.println(bl1);

        a.equals ("John");//---> true

        String c = "JOHN";

        //=================================
        boolean bl25 = a.equalsIgnoreCase(c);//true
        System.out.println(bl25);//true

        System.out.println("Java is ".equalsIgnoreCase("JAVA is"));//true

        //=============

        String str1 = "Java is cool";
        System.out.println(str1.contains("COOL"));
        // replace
        str1= str1.replace('o', '$');
        System.out.println(str1);

        String text1="Tava";
        str1  = str1.replace("java", text1);

        String star = "Star of the day is *";
        System.out.println(star.replace("*", "$$$"));
        // TRIM////// removing spaces

        String text2 = "    It is Saturday  ";
        text2=text2.trim();
        System.out.println(text2);

        //"Do whatever it takes"
        //concat with "to learn java"
        //make everything to UpperCase
        //and replace "java" with "JOB"
        // check if the text containes "Chicago"


        String string ="What ever it takes";

        string = string.concat(("to Learn Java"));

        string = string.toUpperCase();
        string  = string.replace("Java", "JOB");
        System.out.println();
















    }
}
