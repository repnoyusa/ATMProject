package IFSTATEMENT;

public class CurlyBracketPractice {
    public static void main(String[] args) {


        int appleNumber= 40;
        int orangeNumber = 30;

        if(appleNumber>orangeNumber){
            appleNumber++;
            System.out.println("there are more apples in the store then oranges "+appleNumber);
        }
        if(orangeNumber>appleNumber)
            System.out.println("There more oranges in the store then apples "+orangeNumber);
            orangeNumber++;
            ++orangeNumber;

    }
}
