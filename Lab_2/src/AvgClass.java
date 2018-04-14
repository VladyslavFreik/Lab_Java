public class AvgClass {
    static int array[] = new int[28];
    static void print_v() {
        System.out.println("Масив \n");
        for (int i = 0; i < 28; i++) {
            System.out.println("array[" + i + "] = " + array[i]);
        }
    }
    static void avg() {
        int avgg;
        int sum = 0;
        int count = 0;

        for (int i = 0; i < 28; i++)
        {
            sum += array[i];
            count ++;
        }
            avgg = sum/count;
        System.out.println("");
        System.out.println("Середннє арифметичне основи крос-платформенного програмування» за минулий семестр = " + avgg);
    }
    public static void main(String args[]) {
        for (int i = 0; i < 28; i++)
            array[i] = (int) (Math.random()* 8 + 4);
        print_v();
        avg();
    }
}
