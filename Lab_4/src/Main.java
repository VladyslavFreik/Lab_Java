import java.util.Scanner; // Імпортуємо клас

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Створюємо об'єкт класу Scanner
		int i = 2;
		System.out.print("Введіть ціле число: ");
		if (sc.hasNextInt()) { // повертає істину якщо з потоку введення можна
								// зчитати ціле число
			i = sc.nextInt(); // Зчитує ціле число з потоку введення і
								// зберігаємо в змінну
			System.out.println(i * 2);
		} else {
			System.out.println("Ви ввели не ціле число");
		}
		sc.close();
	}
}
