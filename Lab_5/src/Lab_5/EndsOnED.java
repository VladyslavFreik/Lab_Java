package Lab_5;

import java.io.File;
import java.util.Scanner;

public class EndsOnED {

    public static void main(String[] args) throws Exception {
        File file = new File("E:\\Навчання\\Java\\Lab_Java\\Lab_5\\note.txt");
        Scanner sc = new Scanner(file);
        String str;
        boolean isEndId;
        while (sc.hasNextLine()) {
             str = sc.nextLine();
            System.out.println(str);
            if (str.endsWith("ed")) isEndId = true;
            else isEndId = false;
            System.out.println(isEndId);
        }
    }
}

