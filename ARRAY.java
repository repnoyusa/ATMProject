import java.util.Arrays;

public class ARRAY {
    public static void main(String[] args) {

        int [] numbers = new int [10];
        System.out.println(numbers);

        numbers [0]=11;
        System.out.println(numbers);

        System.out.println(numbers[0]);//11
        System.out.println(numbers[1]);//0
        numbers[1]=22;
        numbers[4]=44;
        System.out.println(numbers[4]);

        System.out.println(Arrays.toString(numbers));





    }
        }
