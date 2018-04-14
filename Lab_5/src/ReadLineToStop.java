import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadLineToStop {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("Введіть довільні рядки  до Stop...");
        do {
            str = br.readLine();
            System.out.println(str);

        } while (!str.equals("Stop"));
    }

}
