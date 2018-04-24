package Lab_5;

import java.util.Scanner;

public class Surname {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = "12345";
        String b = "12345";

        String c ;
        String d ;

        System.out.println(a.equals(b));
        System.out.println(a.equalsIgnoreCase(b));

        c = sc.next();
        d = sc.next();

        System.out.println(c.equals(d));
        System.out.println(c.equalsIgnoreCase(d));


    }



}
