public class SearchArray {
    static int array[][] = new int[5][5];

    static void print_v() {
        System.out.println("Масив \n");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {

                if (array[i][j] >= 100)
                    System.out.print(array[i][j] + " ");
                else System.out.print(array[i][j] + " \t");
            }
            System.out.println();
        }
    }



    static void serachElements() {
        System.out.println();
        int i = 0,j = 0;
        int min = array[i][j] ;
    int row = i;
    int column = j;
        for ( i = 0; i < 5; i++) {
            for (j = 0; j < 5; j++)
            {
                if (array[i][j] < min) {
                    min = array[i][j];
                    row = i;
                    column = j;
                }
            }

        }
        System.out.println("Рядок - "+ row);
        System.out.println("Стовпчик - "+ column);
        System.out.println("Мінімальне - "+ min);
    }


    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                array[i][j] = (int) (Math.random() * 50);
            }
        }
        print_v();
        serachElements();
    }

}
