public class SumaArray {

    static int array [] = new int [10];

    public static void main(String[]args)
    {
        int Suma = 0;
        for (int i = 0;i < 10;i++)
        {
            array[i] = (int) (Math.random()* 20);
            System.out.println("array["+ i +"] = "+array[i]);
        }

        for (int i = 0;i <  10;i++)
        {
            if (array[i]%2 != 0)
                Suma += array[i];
        }

        System.out.println();
        System.out.println("Suma = "+ Suma);
    }
}
