package Individual;

import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.FileInputStream;

/**
 * TestDate
 */
public class Indv1  {
    public static Student student = new Student();
    public static DateValidator validator = new DateValidator();
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("1-output/2-input");
        int x = sc.nextInt();

        switch (x) {
            case 1:
                inputInFile();
                break;
            case 2:
                outputFile();
                break;
            default:
                System.out.println("error 1 or 2");
        }
    }

    public static void outputFile(){
        File myFile = new File ("file.txt");
        int b = 1;
        while(b != 0) {
            System.out.println("Input surname and name ");
            inputepib();
            System.out.print("Input date ");
            String date = sc.next();
            System.out.println("date - " + validator.validate(date));
            if (validator.validate(date)) {
                student.setDate(date);
            }
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter(myFile,true));
                writer.write("\n" + student.getSurname()+ " ");
                writer.write(student.getName() + " ");
                writer.write(student.getDate() + " ");
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

    public static void inputepib(){
        String surname;
        String name;
        String pattern = "^[A-Za-z][A-Za-z-_\\.]{1,20}$";

        surname = sc.next();
        name = sc.next();

        Pattern r = Pattern.compile(pattern);
        Matcher s = r.matcher(surname);
        Matcher m = r.matcher(name);

        if (s.find() && m.find()) {
            student.setSurname(surname);
            student.setName(name);
        }else System.out.println("error");
    }


}

