public class For_Then {
    public static void main (String [] args){
        int a[]= {0,1,2,3,4,5};
        moveLeft(a,2);
        for (int i = 0;i <  a.length; i++)
        System.out.println("a = "+ a[i]);
        System.out.println();

        moveRight(a,5);
        for (int i = 0;i <  a.length; i++)
            System.out.println("a = "+ a[i]);

    }

    public static void moveRight(int[] array, int positions) {
        int size = array.length;
        for (int i = 0; i < positions; i++) {
            int temp = array[size - 1];
            for (int j = size - 1; j > 0; j--) {
                array[j] = array[j-1];
            }
            array[0] = temp;
        }
    }
    public static void moveLeft(int[] array, int positions) {
        int size = array.length;
        for (int i = size; i > positions; i--) {
            int temp = array[size-1];
            for (int j = size-1; j > 0; j--) {
                array[j] = array[j-1];
            }
            array[0] = temp;
        }
    }
}
