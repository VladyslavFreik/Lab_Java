public class Avg5x5 {
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

    static void count() {
        int count = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 2 && array[i][j] > 10) count++;
            }
        }
        System.out.println();
        System.out.println("Кількість елементів більше 10 в 3 стовпчику = "+ count);
        System.out.println();
    }

    static void amo() {
        System.out.println();
        System.out.println("Над головною");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i < j){

                    System.out.print(array[i][j]);
                }
                System.out.print("\t");
            }
            System.out.println();
        }
    }

    static void um() {
        System.out.println();
        System.out.println("Під головною");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i > j) {
                    System.out.print(array[i][j] + "  ");
                }
            }
            System.out.println();
            }

    }

    static void avg() {
        int avgg;
        int sum = 0;
        int count = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                sum += array[i][j];
                count++;
            }
        }
        avgg = sum / count;
        System.out.println("");
        System.out.println("Середннє арифметичне масиву = " + avgg);
    }
    public static void main(String []args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                array[i][j] = (26 * i + 1 * j)/2;
            }
        }
        print_v();
        count();
        amo();
        um();
        avg();
    }
}


