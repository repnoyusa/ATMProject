package LOOPS;

public class ForLoop4 {
    public static void main(String[] args) {

        //String str = "aBc123456&*!";
        // count and print how many letter are there in there string
        //count and print how many numbers are there in the string
        //count and print how many other chars are there in the string
        //"there are 3 letters in the string"
        //"There are 5 numbers in the strings"
        //"There are 4 other chars in the string"

        String str = "aBc123456&*!";

        str.toLowerCase();
        int letterCounter = 0;
        int numberCounter = 0;
        int charCounter = 0;

       for(int index = 0;  index<str.length() ; index++  ){

           if(str.charAt(index)>='a' && str.charAt(index)<= 'z') {

               letterCounter++;
           }else if(str.charAt(index)>='0' && str.charAt(index)<='9'){
                   numberCounter++;
               }else{
               charCounter++;
           }
       }
                   System.out.println("there are "+letterCounter+"Letters in the string");
                   System.out.println("there are "+numberCounter+ "numbers in the string");
                   System.out.println("there are "+charCounter+"other symbols in the string");
               }
           }



