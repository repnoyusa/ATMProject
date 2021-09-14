package STRING;

import java.io.OutputStream;

public class MethodChaining {
    public static void main(String[] args) {

           /*

        - Replace all letter 'a's with single '*' and letter 'e's with double '**',
                - change all string value to UPPERCASE
                - Find index of First '*'
                - Multiply that value by 10 and
                - Print out the result
 */

        String text = "  just do it    ";
        int x= text.replace('a', '*').trim().replace("e", "**").toUpperCase().indexOf('*');//number
        System.out.println(x);

        char ch= text.replace('a', '*').trim().replace("e", "**").toUpperCase().charAt(0);//char
        System.out.println(ch);//char







    }
}
