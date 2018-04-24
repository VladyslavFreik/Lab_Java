package Lab_5;

public class IndexOf {
    public static void main(String[] args) {
        String string = "Hello World";
        String substring1 = "Hello";
        String substring2 = "Test";

        System.out.println(string.indexOf(substring1)); // виводить 0
        System.out.println(string.indexOf(substring2)); // виводить -1.


        String sstring = "http://google.com";
        System.out.println("Починається з http:// " + sstring.startsWith("http://"));
        System.out.println("Починається з ftp:// " + sstring.startsWith("ftp://"));
        System.out.println("Закінчується з .com " + sstring.endsWith(".com"));
        System.out.println("Закінчується з .com.ua " + sstring.endsWith(".com.ua"));

        String s = "Hello World";
        System.out.println(s.substring(3));
        System.out.println(s.substring(1, 5));

        String ss = "Це демонстрація getChars методу";
        int start = 16;
        int end = 25;
        char buf[] = new char[end - start];
        ss.getChars(start, end, buf, 0);
        System.out.println();




    }
}
