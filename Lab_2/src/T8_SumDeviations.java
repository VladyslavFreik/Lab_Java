public class T8_SumDeviations {
    static int array[][] = new int [5][5];
    static int max[] = new int [5];
    static int dev[] = new int [5];

    static void deviation() {
        for (int i = 0; i < max.length; i++) {
            max[i] = array[i][0];
        }

        int z = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < 5; j++) {
                if (array[i][j] > max[z]) {
                    max[z] = array[i][j];
                }
            }
            z++;
        }
        for (int i = 0; i < max.length; i++) {
            System.out.println("max[" + i + "] = " + max[i]);
        }

        for (int i = 0; i < dev.length; i++) {
            dev[i] = max[i];
        }

        z = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < 5; j++) {
                if (max[z] - array[i][j] < dev[z] && max[z] - array[i][j] != 0) {
                    dev[z] = max[z] - array[i][j];
                }
            }
            z++;
        }

        System.out.println();

        for (int i = 0; i < dev.length; i++) {
            System.out.println("Відхилення в " + (i + 1) + " - му рядку = " + dev[i]);
        }

        int sum = 0;

        for (int i = 0; i < dev.length; i++) {
            sum += dev[i];
        }

        System.out.println();
        System.out.println("Сумарне відхилення = " + sum);
    }

    public static void  main(String[] args)
    {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                array[i][j] = (int) (Math.random() * 50);
                System.out.print(array[i][j] + " \t");
            }
            System.out.println();
        }
        deviation();
    }
}