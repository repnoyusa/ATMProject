package LOOPS;

public class CharPractice {
    public static void main(String[] args) {
        //print out alphabet in UPPER CASE letters
        // print out letters as one upper one lower

        for (char ch = 'A', ch1 = 'a'; ch <='Z'&& ch1 <= 'z'; ch++, ch1++) {
            System.out.print(ch + " * ");
            ch++; //skipping one letter

            System.out.println(ch1+ "-");

        }
    }
}
