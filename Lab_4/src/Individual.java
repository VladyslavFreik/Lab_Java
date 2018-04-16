import java.io.File;
import java.util.Random;

public class Individual {
	public static double func1(double m, double c, double x)
	{
		return ((Math.sin(x)))/(Math.sqrt(1+Math.pow(m,2)*Math.pow(Math.sin(x),2)));
	}
	public static double func3(double xp, double xk, double dx)
	{
		double rezult = 0, x, y;
		int countMinus = 0;
		for(x=xp; x<xk; x+=dx) {
			y=5*Math.pow(Math.sin(3*x), 2) + 4*Math.pow(Math.cos(2*x), 3) - 2*Math.exp(Math.tan(2*x));
			if(y<0) { rezult+=y; countMinus++;}
		}
		return rezult/countMinus;
	}
	public static void func5(double xp, double xk, double dx)
	{
		double sum = 0, x, y;
		int count = 0;
		for(x=xp; x<xk; x+=dx) {
			y=Math.exp(Math.cos(2*x)) - Math.log1p(Math.abs(Math.cos(2*x))) + 4*Math.pow(Math.sin(3*x*x), 2);
			if(y>-2 && y<2) { sum+=y; count++;}
		}
		System.out.println("Suma: " + sum + "\nKilkist: " + count);
	}
	public static void func7(double a, double b)
	{
		a=Math.abs(a); b=Math.abs(b);
		double c = Math.sqrt(a*a + b*b);
		double p = a+b+c;
		double s = 0.5 * a * b;
		System.out.println("Сторони трикутника прямокутного: " + a+ " " + b + " "+ c);
		System.out.println("Периметр: " + p + "\nПлоща: " + s);
	}
	public static int func8(int n)
	{
		int count=0;
		do {
			n=n/10; count++;
		} while(n!=0);
		return count;
	}
	public static int func9(int a, int b)
	{
		Random x = new Random();
		return x.nextInt((b-a)+1)+a;
	}
	public static void findByNameInDirectory(String dir, String file1)
	{
		int k=0;
		File directory = new File(dir);
		System.out.print("Введений каталог ");
		if(directory.isDirectory())
			{
			System.out.println("існує.");
			System.out.println(directory.getName());
			String[] files = directory.list();
			for (int i = 0; i < files.length; i++) {
			File f = new File(dir + "/" + files[i]);
			if ((f.getName()).equals(file1)) {
				System.out.println("Виявлено збіг: " + dir + files[i]);
				k++;
				} 
			}
		if(k==0) System.out.println("Збігів не виявлено");
		if(k>=0) System.out.println("Загалом виявлено " + k + zbig(k));
			}
		else System.out.println("НЕ існує! Спробуйте ще раз!");
	}
	public static String zbig(int col) {
		String zb = " збіг(и).";
		if(col%10 == 1) zb = " збіг.";
		if(col%10 <= 2 && col%10 >= 4) zb = " збіги.";
		if((col%10 <=5 && col%10 >=9) || col%10 == 0) zb = " збігів.";
		return zb; 
	}
	public static void main(String[] args) {
		/*double rezult;
		rezult = func1(0.7, 2.1, 1.7);
		System.out.println(rezult);
		rezult = func3(10, 30, 2.5);
		System.out.println(rezult);
		func5(2, 40, 4);
		func7(5, 7);
		rezult = func9(-3, 3);
		System.out.println(rezult);
		rezult = func8(45783);
		System.out.println(rezult);*/
		findByNameInDirectory("C:/Users/DELL/eclipse-workspace/LR_4/src/", "FileProgram.java");
	}

}
