import java.io.*;
import java.sql.SQLOutput;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.FileInputStream;

/**
     * TestDate
     */
    public class Individual extends Student {

    public static void main(String[] args) {
        System.out.println("1-output info or 2-input info ");
        int i;
        i = sc.nextInt();
        switch (i){
            case 1: inputInFile();
            break;
            case 2 : outputFile();
            break;
            default:
                System.out.println("error");
        }


    }
    public static Student std = new Student() {};
    public static Scanner sc = new Scanner(System.in);

    public static String dateformat(){
        System.out.println("chose your dateformat: ");
        System.out.println("1 - yyyy-mm-dd");
        System.out.println("2 - yyyy:mm:dd");
        System.out.println("3 - yyyy.mm.dd");
        System.out.println("4 - yyyy/mm/dd");

        Scanner sc = new Scanner(System.in);
        int inputcase = sc.nextInt();
        String inputdate = "";

        switch (inputcase){
            case 1 :
                System.out.println("you chose is dd-mm-yyyy");
                return inputdate = "dd-mm-yyyy";
            case 2 :
                System.out.println("you chose is dd:mm:yyyy");
                return inputdate = "dd:mm:yy";
            case 3 :
                System.out.println("you chose is dd.mm.yyyy");
                return inputdate = "dd.mm.yyyy";
            case 4 :
                System.out.println("you chose is dd/mm/yyyy");
                return inputdate = "dd/mm/yyyy";
            default:
                System.out.println("error");
        }
        return inputdate;
    }

    public static void inputepib(){
        String surname;
        String name;
        String pattern = "^[a-zA-Z][a-zA-Z-_\\.]{1,20}$";

        surname = sc.next();
        name = sc.next();

        Pattern r = Pattern.compile(pattern);
        Matcher s = r.matcher(surname);
        Matcher m = r.matcher(name);

        if (s.find() && m.find()) {
          std.setSurname(surname);
          std.setName(name);
      }else System.out.println("error");
    }


    private static  DateFormat DATE_FORMAT = new SimpleDateFormat(dateformat());
        static {
            DATE_FORMAT.setLenient(true);
        }




        public static void outputFile(){
        File myFile = new File ("file.txt");
        int b = 1;
        while(b != 0) {
            System.out.println("Input surname and name ");
            inputepib();
            System.out.print("Input date ");
            String date = sc.next();
            System.out.println("date - " + isValid(date));
            if (isValid(date)) {
                std.setDate(date);
            }
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter(myFile,true));
                writer.write("\n" + std.getSurname()+ " ");
                writer.write(std.getName() + " ");
                writer.write(std.getDate() + " ");
                writer.flush();
                writer.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            System.out.println("continue?(yes 1/no 0)");
            b = sc.nextInt();
        }
    }


    public static void inputInFile() {
        try {
            FileInputStream input =new FileInputStream("file.txt");
            byte[] buffer = new byte[100];
            int length = input.read(buffer);
            while (length != -1) {
                System.out.println(new String(buffer, 0, length));
                length = input.read(buffer);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }


        private static boolean isValid(String date){
            try {
                return DATE_FORMAT.format(DATE_FORMAT.parse(date)).equals(date);
            }catch (ParseException ex){
                return false;
            }
        }
    }
