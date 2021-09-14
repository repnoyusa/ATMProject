package STRING;

import java.util.Locale;

public class Method3 {
    public static void main(String[] args) {

        String string = "Selenium";
        // .toUppercase();//it will convert all string to upper case
        string = string.toUpperCase();
        System.out.println(string);


        // to.LowerCase();///it will bring all string to lower case
        string.toLowerCase();
        System.out.println(string.toLowerCase());

        System.out.println(string.toUpperCase());

        System.out.println(string);

        string = string.toLowerCase();

        String  a = "" +string.charAt(0);

        //string.charAt(0)
        a = a.toUpperCase();

        System.out.println(a);


        String word = "do whatever it takes";
        System.out.println(word.startsWith("do"));

        word.startsWith("do");

        word.startsWith("what");

        word.startsWith ("d");
        boolean resut1 =word.startsWith("d");
        System.out.println(resut1);

        boolean result2 = word.startsWith("do w");
        System.out.println(result2);

        word.startsWith("do w");

        word.startsWith("Do");

        word.endsWith("do");// false
        System.out.println("do whatever it takes");

        System.out.println(word.endsWith("it"));//false
        //////////////////////


        String text = "Techtorial";

        System.out.println(text.contains("t"));//true

        text = text +word;
        System.out.println(text.contains("do"));/// because word true

        System.out.println(text.contains("for")); //false

        System.out.println(text.contains("i"));//true

        System.out.println(result2);













    }
}
