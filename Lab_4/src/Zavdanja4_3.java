import java.io.*;
public class Zavdanja4_3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		int i;
		int suma = 0;
		System.out.println("������ ������ ����� �� 0 �� quit...");
		do {
			str = br.readLine();
			try {
				i = Integer.parseInt(str);
			} catch (NumberFormatException e) {
				System.out.println("������� ������");
				i = 0;
			}
			suma += i;
			System.out.println("������� ���� ����: " + suma);
		} while (i != 0);
	}

}
