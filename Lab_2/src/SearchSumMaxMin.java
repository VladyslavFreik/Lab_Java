public class SearchSumMaxMin {


    static int array[][] = new int[5][5];

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                array[i][j] = (int) (Math.random() * 10 + 20);
                if (array[i][j] >= 100)
                    System.out.print(array[i][j] + " ");
                else System.out.print(array[i][j] + " \t");
            }
            System.out.println();
        }
        serachElements();
    }

    static void serachElements() {
        int Suma;
        int i = 0, j = 0;
        int max = array[i][j];
        int min = 10;

        for ( i = 0; i < 5; i++) {
            for (j = 0; j < 5; j++)
            {
                if (array[i][j] < min)
                    min = array[i][j];

                if (array[i][j] > max)
                    max = array[i][j];
            }
        }

        Suma = max + min;

        System.out.println("-------------------");
        System.out.println("Max = " + max);
        System.out.println("    Min = " + min);
        System.out.println("        Suma= " + Suma);
    }
}





























