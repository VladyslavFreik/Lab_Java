package ua.edu.kep.LR_6;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;


public class ProgramListString {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<String>();
        List<String> strings2 = new ArrayList<String>();

        strings.add("Hello");
        strings.add("world");
        strings.add("!");
        strings2.add("Hello");

        System.out.println(strings);
        System.out.println(strings.size());
        System.out.println(strings.get(0));
        System.out.println();

        compareStrings(strings, strings2);

        System.out.println(strings.get(1));
        System.out.println();
        System.out.println("normal - " + strings);

        Collections.reverse(strings);

        System.out.println("reverse - " + strings);

        strings.indexOf("world");
        containsString(strings,"world=");

//        strings.clear();
//        strings2.clear();
    }

    public static void compareStrings(List<String> str1, List<String> str2) {

        if (str1.size() == str2.size()) {
            if (str1.equals(str2)) {
                System.out.println("true");
            }
        } else System.out.println("false");
    }

    public static boolean containsString(List<String> strings, String string) {
        for (String each : strings) {
            if (each.equals(string)) {
                return true;
            }
        }
        return false;
    }


}