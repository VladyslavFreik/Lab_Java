import java.io.*;
public class Zavdannja4_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        int i;
        int suma = 0;
        System.out.println("Введіть довільні числа від 0 до quit...");
        do {
            str = br.readLine();
            try {
                i = Integer.parseInt(str);
            } catch (NumberFormatException e) {
                System.out.println("Невірний формат");
                i = 0;
            }
            suma += i;
            System.out.println("Поточна сума рівна: " + suma);
        } while (i != 0);
    }
}
