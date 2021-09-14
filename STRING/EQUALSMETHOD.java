package STRING;

public class EQUALSMETHOD {
    public static void main(String[] args) {

        String a = "David";

        String b = "David";

        String c = new String("David");

        String d = new String("David");

        System.out.println(a==b);// same object//true
        System.out.println(a.equals(b));//true
        System.out.println(a==c);//false
        System.out.println(a.equals(c));//true

        System.out.println(c==d);//false reassign
        System.out.println(c.equals(d));//true

        System.out.println(a=="David");//true
        System.out.println(a == new String("David"));//false
        System.out.println(c == "David");//false

        String e = a;
        String f = c;
        System.out.println(e==b);//true
        System.out.println(f.equals(d));//true always true if object the same










    }
}
