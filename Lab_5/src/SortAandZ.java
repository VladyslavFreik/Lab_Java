public class SortAandZ {
    static String Pi[] = {"Барабалюк","Кловак","Матвійчук","Собчишин","Ткачук","Фреїк"};

    public static void main(String[] args) {
        for (int j = 0; j < Pi.length; j++) {
            for (int i = j + 1; i < Pi.length; i++) {
                if (Pi[j].compareToIgnoreCase(Pi[i]) < 0) {
                    String new_arr = Pi[i];
                    Pi[i] = Pi[j];
                    Pi[j] = new_arr;
                }
            }
            System.out.println(Pi[j]);
        }
        System.out.println();
        toLower();
        toUpper();
        System.out.println();
        contains();

        System.out.println();

        String isbn = "978-3-16-148410-0";
        String[] isbnParts = isbn.split("-");

        System.out.println("префікс EAN.UCC: " + isbnParts[0]);
        System.out.println("номер регістраційної групи: " + isbnParts[1]);
        System.out.println("номер регістранту: " + isbnParts[2]);
        System.out.println("номер видання: " + isbnParts[3]);
        System.out.println("контрольна цифра: " + isbnParts[4]);

}
        public static void toLower(){
            String fr = "FREIK";
            System.out.println("FREIK in lower = " +fr.toLowerCase());
        }

        public static void toUpper(){
            String fr = "freik";
            System.out.println("freik in upper = " + fr.toUpperCase());
        }

        public static void contains(){
            String s = "www.mysite.com";
            boolean isContain1 = s.contains("mysite");
            System.out.println(isContain1);// знайдено - повертає true

            boolean isContain2 = s.contains("mysite.ua");
            System.out.println(isContain2);// не знайдено - повертає false

        }


}
