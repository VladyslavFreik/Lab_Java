public class IfElsea {
    public static void main(String[]args)
    {
        a();
        b();
        c();
    }
    public static int sum (int a, int b, int c){
        return a+b+c;
    }

    static void a()
    {
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("метод a");
        int a = 10;
        int b = 12;
        int c = 34;
        int sum = sum(a, b, c);
        System.out.println("найбільше число - " +(((a > b))&&(a > c) ? a : (b > a)&& (b > c)? b : c ));
        System.out.println("найменше число - " +(((a < b))&&(a < c) ? a : (b < a)&& (b < c)? b : c ));
        System.out.println("сума - " + sum);

    }

    static void b()
    {
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("метод b");
        System.out.println("метод b");
        int a =12;
        int b =42;
        int c = 29;
        int ab  = a + b;
        int ac = a + c;
        int bc = b + c;

        int max = (((ab > ac))&&(ab > bc) ? ab : (ac > ab)&& (ac > bc)? ac : bc );
        int min = (((ab < ac))&&(ab < bc) ? ab : (ac < ab)&& (ac < bc)? ac : bc );

        System.out.println("сума a + b = " + ab);
        System.out.println("сума a + c = " + ac);
        System.out.println("сума b + c = " + bc);
        System.out.println("найбільша сума = " +max);
        System.out.println("найменша сума = " +min);
        System.out.println("середнє арифметичне найбільшої і найменшої суми = " +(max + min)/2 );

    }

    static void c()
    {
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("метод c");
        String argument1 = "Я довго думав над цим";
        String argument2 = "Я довго думав над цим";//і через 20 хв до мене дойшло
        int arg1 = argument1.length();
        int arg2 = argument2.length();
        String ar1 = "Аргумент 1";
        String ar2 = "Аргумент 2";



        System.out.println("аргумент з більшою довжиною - " + ((arg1 > arg2) ?  ar1 : (arg1 < arg2) ? ar2 : "такого немає вони рівні"));

    }



}
