import java.io.*;
public class Zavdanja4_1 {
    public static void main(String[] args) throws IOException {
        char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введіть символ, 'q' для завершення роботи...");
        do {
            c = (char) br.read();
            System.out.println(c);
        } while (c != 'q');
    }
}
