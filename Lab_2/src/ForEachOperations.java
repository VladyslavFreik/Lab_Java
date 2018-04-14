public class ForEachOperations {
    public static void main(String[] args) {
        String[] strings = {"College", "of", "Electronic", "Equipments", "Computer", "Science"};

        for (String each : strings) {
            System.out.println(each);
        }
        int[] numbers = {23, 45, 12, 2, 1, 2, 45, 2, 3, 6, 34, 7};
        for (int each : numbers) {
            if (each == 3) break;
            if (each >= 10) continue;
            System.out.println(each);
        }


    }







}
