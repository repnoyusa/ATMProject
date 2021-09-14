package LOOPS;

public class ForLoop1 {
    public static void main(String[] args) {


        for (int number = 1; number <= 5; number++) {

            System.out.println("Its is for loop" + number);
        }
        int number = 1;
        for (; number <= 5; number++) {
            System.out.println("Its is for second loop" + number);

        }
        for (; number < 5; ) {
            number++;
            System.out.println("its THIRD for Loop" + number);
        }
    }
}