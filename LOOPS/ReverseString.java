package LOOPS;

public class ReverseString {
    public static void main(String[] args) {
        //Selenium ; reverse it and print it is a new string as reversed version
        //muineleS

        // c word ===> EFE, EYE, ANNA
// check if the given name string is palindrome or not


        String string1= "Selenium";
        String newStr ="";

        for(int index = string1.length()-1;index>=0;index--){
            newStr+= newStr+string1.charAt(index);
        }
        System.out.println("Final version" +newStr);
        if(string1.equalsIgnoreCase((newStr))) {
            System.out.println("The world is palindrome" + string1);
        }else{
            System.out.println("the word is NOT palindrome "+string1);
        }
    }
}



