public class Factorial {

        public static void main(String[]args)
        {
            for_();
            do_while();
            while_();
        }
        public static int sum (int a, int b, int c){
            return a+b+c;
        }

        static void while_()
        {
            System.out.println("------------------------------------------------------------------------------");
            System.out.println("метод while");
            int i = 1, fact = 1;
            int number= 10;
          while( i <= number)
            {
                fact = fact * i;
                i++;
            }
            System.out.println("Factorial of "+number+" is: "+fact);
        }

        static void for_()
        {
            System.out.println("------------------------------------------------------------------------------");
            System.out.println("метод for");
            int i, fact = 1;
            int number= 10;
            for(i = 1; i <= number; i++)
            {
                fact = fact * i;
            }
            System.out.println("Factorial of "+number+" is: "+fact);
        }



        static void do_while()
        {
            System.out.println("------------------------------------------------------------------------------");
            System.out.println("метод do_while");
            int i = 1, fact = 1;
            int number= 10;
           do
            {
                fact = fact * i;
                i++;
            } while( i <= number);
            System.out.println("Factorial of "+number+" is: "+fact);

        }



    }


