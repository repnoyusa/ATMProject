package STRING;

import java.util.Locale;
import java.util.SortedMap;

public class STRINGBASICS {
    public static void main(String[] args) {

        String text ="School";
        System.out.println(text);
        String name = new String("David");
        System.out.println(name);

        text = text+ " is Techtorial";
        System.out.println(text);

        text+= " Academy";
        System.out.println(text);

        //text -= "Academy"; YOU CANT NOT USE -,*, / OR % WITH STRING!!!!!!
        //Placing one String  before the other String
        //and combining them together is called String concatenation

        String word = name + text;
        System.out.println(word);
        System.out.println(word+"5");

        name = name + text;
        name+=text;
        System.out.println(name);

        String str = "Java";
        String str1 = "Selenium";
        String result = str + " "+str1;
        System.out.println(result);
        System.out.println(str1+" Is next");
        System.out.println(str+" is first");
        System.out.println(result+str+str1);//---> Java SeleniumJavaSelenium

        str= str +5+6;
        System.out.println(str);

        str1 = str1 +"5"+"6";
        System.out.println(str1);

        result = 5+6+result;
        System.out.println(result);

        str = str +5*6;
        System.out.println(str);

        str = "java";
        int a = 12;
        str.concat("is cool");
        System.out.println(str);

        str = str.concat(" is very easy");
        System.out.println(str);
        str= str.toUpperCase();
        System.out.println(str);





    }

}
