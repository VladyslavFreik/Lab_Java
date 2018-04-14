public class DeviationArgs {

    static int array[][] = new int [5][5];

    static void deviation() {

        int max = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }

        int vid = max ;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (max - array[i][j] < vid && max - array[i][j] != 0)
                    vid = max - array[i][j];
            }
        }
        System.out.println();
        System.out.println("Максимальне - " + max);
        System.out.println("Відхилення - " + vid);
    }

        public static void  main(String[]args)
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
