public class Arguments {
    public static void main(String[] args) {
        System.out.println("Задано " + args.length + " аргуметнів");
        // перший аргумент попадає в масив під індексом 0
        System.out.println("Значення 1го аргумента " + args[0]);

        System.out.println();
        System.out.print("Значення всіх аргументів - ");

        for(int i = 0; i < 4; i++)
            System.out.print(args[i] + ", ");

        System.out.println();
        System.out.println();
        System.out.println("Значення 1го аргумента і останнього аргумента " + args[0] + ", "  +  args[3]);

        System.out.println();
        System.out.print("Значення всіх аргументів крім 1 - ");

        for(int i = 1; i < 4; i++)
            System.out.print(args[i] + ", ");

        System.out.println();
        System.out.println();
    }


}
