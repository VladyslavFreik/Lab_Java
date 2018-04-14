public class NumberOperations {
    public static void main(String[] args) {
        int a = 12;
        int b = 43;

        System.out.println("Тип даних int");
        System.out.println();

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));

        float c = (float) 10.3;
        float d = (float) 43.2;

        System.out.println();
        System.out.println("Тип даних float");
        System.out.println();

        System.out.println("c + d = " + (c + d));
        System.out.println("c - d = " + (c - d));
        System.out.println("c * d = " + (c * d));
        System.out.println("c / d = " + (c / d));

        System.out.println();
        System.out.println("Тип даних boolean");
        System.out.println();
        boolean e = true;
        boolean f = false;

        System.out.println("e ^ f = " + (e ^ f));
        System.out.println("e | f = " + (e | f));
        System.out.println("e & f = " + (e & f));
        System.out.println("!e = " + (!e));
        System.out.println("!f = " + (!f));

    }

}
