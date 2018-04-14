public class ArrayMonth {

        public static void main(String[] args) {
        int month_day[];
        month_day = new int[12];
        month_day[0] = 31;
        month_day[1] = 28;
        month_day[2] = 31;
        month_day[3] = 30;
        month_day[4] = 31;
        month_day[5] = 30;
        month_day[6] = 31;
        month_day[7] = 31;
        month_day[8] = 30;
        month_day[9] = 31;
        month_day[10] = 30;
        month_day[11] = 31;
        System.out.println("У місяці лютому " + month_day[1] + " днів");


        int month_day_copy[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.println("У місяці лютому " + month_day_copy[1] + " днів");
    }
}
