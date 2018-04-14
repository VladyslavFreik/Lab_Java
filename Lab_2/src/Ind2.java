import java.util.Scanner;
public class Ind2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n, m;

        System.out.print("n = ");
        n =  in.nextInt();
        System.out.print("m = ");
        m =  in.nextInt();

            int b[][] = createArray(n, m);
          if (n == m) {
              System.out.println("Enter some number: ");
              System.out.println("1 - minor diagonal: ");
              System.out.println("2 - main diagonal: ");
              int switchcase = in.nextInt();

              switch (switchcase) {

                  case 1: {
                      System.out.println("\n\nArrray:\n");
                      print(b);
                      transform(b);
                      System.out.println("\n\nMinor:\n");
                      print(b);
                      break;
                  }
                  case 2: {
                      System.out.println("\n\nArrray:\n");
                      print(b);
                      transform2(b);
                      System.out.println("\n\nMain:\n");
                      print(b);
                      break;
                  }
                  default:
                      System.out.println("Дію не знайдено");
              }
          }
          else
              System.out.println("Матриця не квадратна");
}


    private static int[][] createArray(int sizei,int sizej) {
        int[][] arr = new int[sizei][sizej];
            for (int i = 0; i < sizei; i++) {
                for (int j = 0; j < sizej; j++) {
                    //arr[i][j] = (int) (Math.random() * 20);
                    arr[i][j] =  4 * i + j  ;
                }
            }

        return arr;
    }


    private static void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%5d", arr[i][j]);
            }
            System.out.println();
        }
    }


    private static void transform(int[][] arr) {
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size-i; j++) {
                int tmp = arr[i][j];
                arr[i][j] = arr[size-1-j][size-1-i];
                arr[size-1-j][size-1-i] = tmp;
            }
        }
    }


    private static void transform2(int[][] arr) {
        int size = arr.length;
        for (int i = 0; i < size - 1; ++i) {
            for (int j = i + 1; j < size; ++j) {

                   int tmp = arr[i][j];
                   arr[i][j] = arr[j][i];
                   arr[j][i] = tmp;

            }
        }
    }

}
