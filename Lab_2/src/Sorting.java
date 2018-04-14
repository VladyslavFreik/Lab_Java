public class Sorting {
    static int mas[] = new int[10];


    static void print_v() {
        System.out.println("Масив \n");
        for (int i = 0; i < 10; i++) {
            System.out.println("mas[" + i + "] = " + mas[i]);
        }
    }



    static void sortingOnGrowth() {
        System.out.println();
        System.out.println("Сортування за спаданням");
        int n = 10;
        int tmp;
        int test = 1;
        while(test > 0) {
            test = 0;
            for (int i = 0; i < n - 1; i++) {
                if (mas[i] < mas[i + 1]) {
                    tmp = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = tmp;
                    test++;
                }

            }

        }
        for(int i = 0; i < n; i++)
            System.out.println("mas[" + i + "] = " + mas[i]);
        System.out.println();
    }


    static void sortingByRecurrance_() {
        System.out.println();
        System.out.println("Сортування за зростанням");
        int n = 10;
        int tmp;
        int test = 1;
        while(test > 0) {
            test = 0;
            for (int i = 0; i < n - 1; i++) {
                if (mas[i] > mas[i + 1]) {
                    tmp = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = tmp;
                    test++;
                }

            }

        }
        for(int i = 0; i < n; i++)
            System.out.println("mas[" + i + "] = " + mas[i]);
        }



    public static void main(String[]args)
    {

        for (int i = 0; i < 10; i++)
            mas[i] = (int) (Math.random() * 100);
        print_v();
        sortingByRecurrance_();
        sortingOnGrowth();


    }

}
