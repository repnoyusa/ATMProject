package STRING;

public class SUBSTRINGS {
    public static void main(String[] args) {

        String str = "Techtorial";
     //               0 1 2 3 4 5 6 7 8 9

        str.substring(2);
        String part1 = str.substring(2);//when you pass single index number into the substring method
        //it will take partial text starting from the index and
        //it will include that index char
        System.out.println(part1);

        String part2 = str.substring(2,4);//when you pass beginning and ending index numbers
        //it will start from beginning index which  is included
        //and stop at ending index which in not included

        System.out.println(str.substring(0));
        //print last three chars from string "I will do it SOON"

        String string = "I will do it SOON";
        string.substring(string.length()-3);
        System.out.println(string.substring(string.length()-3));//WHEN YOUR STRING VALUE DOES NOT
        // HAVE ENOUGH VALUE TO TAKE SUBSTRING IT WILL THROW AN EXCEPTION(StringOfBound).

        String string1  = "ON";
        System.out.println(string.substring(string.length()-3));














    }


}
