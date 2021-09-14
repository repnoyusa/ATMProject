package ScannerPractice;

public class Method1 {
    public static void main(String[] args) {
        String city = "Chicago";

        city.concat("is very beautiful");
        System.out.println(city);//Chicago
/*String is immutable which is mean original value will not change unless you reassign it or
 create a new String variable*/
        String newCity = city.concat("is very beautiful");
        System.out.println(city);//Chicago
        System.out.println(newCity);

        System.out.println(newCity.length());
        int letterCount = newCity.length();


        city.charAt(0);//c
        city.charAt(3);// chicago-->>c
        System.out.println(city.charAt(3));
        city.charAt(9);//
        System.out.println("it is almost time to go home");





    }
}
