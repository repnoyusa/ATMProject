package ScannerPractice;

import javax.sound.midi.Soundbank;

public class Method2 {
    public static void main(String[] args) {

        String name = "Diana";

        //indexOf
        name.indexOf('D');
        System.out.println(name.indexOf('D'));// index number of 'D'--->000
        name.indexOf("D");
        System.out.println(name.indexOf("D"));//index number of "D"--->0
        name.indexOf("Di");
        System.out.println(name.indexOf("Di"));// // index number of ????
        System.out.println(name.indexOf("ana"));// 2 it looks for matching sequence of provided
        //chars and returns first matching char's index number
        System.out.println(name.indexOf("tina"));// -1 the is no matching char sequence
        System.out.println(name.indexOf("K"));//-1 because not char

        name.concat("Bejan");/////???????
        System.out.println(name.concat(" Bejan"));//
        name = name.concat("Bejan");
        System.out.println(name);// Diana Bejan
        name.indexOf("a", 2);//--->
        System.out.println( name.indexOf("a",3));//-->> it will start looking for tha char
        // starting from given index
        name.indexOf("B", name.indexOf(" "));
        System.out.println(name.indexOf("B", name.indexOf(" ")+2));

        name = "Arzu Beril Sen";
        System.out.println(name.indexOf("e", 7));
        System.out.println(name.indexOf("e", name.indexOf("")+3));

       /* name.indexOf();// values that you are giving inside the method parentheses are called parameters
        //some methods take no parameters, some take single parameter or Multiple parameters
        name.length();// no parameters
        name.charAt(3); //single parameter
        name.indexOf("e", 4);//you can pass ether one or two parameters by separating them with comma (,)
         */











    }


}
