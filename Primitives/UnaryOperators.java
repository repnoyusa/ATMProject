package Primitives;

public class UnaryOperators {
    public static void main(String[] args) {

        int studentNumber = 25;
        studentNumber=studentNumber+1;

        studentNumber+=1;

        studentNumber++;
        System.out.println(studentNumber);
        ++studentNumber;
        System.out.println(studentNumber);

        studentNumber--;
        System.out.println(studentNumber);
        --studentNumber;
        System.out.println(studentNumber);//27

        studentNumber--;studentNumber--;studentNumber--;
        System.out.println(studentNumber);//24

       // ====================================
        studentNumber++;
        studentNumber--;
        System.out.println(studentNumber++);// 25--> it shows 24, but increases afterwords, studentNumber is now 25
        System.out.println(studentNumber);//shows 25
        System.out.println(++studentNumber);//it shows 26, increase first and then prints out

        System.out.println(studentNumber--);//-->show 26, decrease by 1, 25
        studentNumber--;//24
        --studentNumber;//23
        System.out.println(--studentNumber);//decrease first 22..show 22
        System.out.println(studentNumber);//22

        int a = studentNumber++ +studentNumber++ +5+100;
        a--;
        a=studentNumber;
        System.out.println(a--);//shows 24, a=23
        System.out.println(a--);//shows 23, a 22
        System.out.println(a);//show 22








    }
}
