import java.io.*;
import java.util.Scanner;
public class Zavdannja4_2 {
	public static void main(String[] args) {
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ���� �����:");
		if (sc.hasNextInt()) { // ������� ������ ���� � ������ �������� �����
			// ������� ���� �����
			i = sc.nextInt(); // ����� ���� ����� � ������ �������� �
			// �������� � �����
			System.out.println(i + "  � ������� ������ "
					+ Integer.toBinaryString(i));
			System.out.println(i + "  � ������� ������ "
					+ Integer.toOctalString(i));
			System.out.println(i + "  � �������������� ������ "
					+ Integer.toHexString(i));
			} else {
				System.out.println("�� ����� �� ���� �����");
			}
	}
}
