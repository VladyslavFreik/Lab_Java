public class ForOperations {

    public static void main(String[] args)
    {
        int[] x = {1, 2, 3, 5, 7, 9, 12, 34, 56, 65, 153};
        for (int i = 0; i < x.length; i++) {
            System.out.println("x[" + i + "]=" + x[i]);
        }

        System.out.println();
        System.out.println("Кожний 2 елемент");
        System.out.println();

        for (int i = 0; i < x.length; i += 2) {
            System.out.println("x[" + i + "]=" + x[i]);
        }

        System.out.println();
        System.out.println("Парні елементи");
        System.out.println();

        for (int i = 0; i < x.length; i++)
        {
            if(x[i]%2 == 0) {
                System.out.println("x[" + i + "]=" + x[i]);
            }
        }

        String abc = "12";
        int cba =  Integer.parseInt(abc);
        int count = 0;

        System.out.println();
        System.out.println("Введене число - "+ cba);

        System.out.println();
        System.out.println("Рівні");
        System.out.println();

        for (int i = 0; i < x.length; i++)
        {
            if(x[i] == cba) {
                count++;
                System.out.println("x[" + i + "]=" + x[i]);
            }
        }
        System.out.println("Кількість = "+ count);

        System.out.println();
        System.out.println("Менші");
        System.out.println();

        for (int i = 0; i < x.length; i++)
        {
            if(x[i] < cba) {
                count++;
                System.out.println("x[" + i + "]=" + x[i]);
            }

        }
        System.out.println("Кількість = "+ count);

        System.out.println();
        System.out.println("Більші");
        System.out.println();

        for (int i = 0; i < x.length; i++)
        {
            if(x[i] > cba) {
                count++;
                System.out.println("x[" + i + "]=" + x[i]);
            }

        }
        System.out.println("Кількість = "+ count);

    }

}
