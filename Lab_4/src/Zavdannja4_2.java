import java.io.*;
import java.util.Scanner;
public class Zavdannja4_2 {
	public static void main(String[] args) {
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("¬вед≥ть ц≥ле число:");
		if (sc.hasNextInt()) { // повертаЇ ≥стину €кщо з потоку введенн€ можна
			// зчитати ц≥ле число
			i = sc.nextInt(); // «читуЇ ц≥ле число з потоку введенн€ ≥
			// збер≥гаЇмо в зм≥нну
			System.out.println(i + "  у дв≥йков≥й систем≥ "
					+ Integer.toBinaryString(i));
			System.out.println(i + "  у в≥с≥мков≥й систем≥ "
					+ Integer.toOctalString(i));
			System.out.println(i + "  у ш≥стнадц€тков≥й систем≥ "
					+ Integer.toHexString(i));
			} else {
				System.out.println("¬и ввели не ц≥ле число");
			}
	}
}
