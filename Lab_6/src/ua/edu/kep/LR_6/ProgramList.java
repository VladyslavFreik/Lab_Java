package ua.edu.kep.LR_6;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Collections;

public class ProgramList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(4);
        list.add(5);
        list.add(2);
        list.add(1);

        List<Integer> list2 = new ArrayList<Integer>();
        list2.add(12);
        list2.add(14);
        list2.add(15);
        list2.add(21);
        list2.add(11);

        List<Integer> list3 = new ArrayList<Integer>();
        Random r = new Random();
        for (int i = 0; i < 12; i++) {
            list3.add(r.nextInt(100));
        }

        list3.addAll(list);
        list.addAll(list2);

        for (Integer each : list) {
            System.out.println(each);
        }

        System.out.println();
        Collections.sort(list3);
        System.out.println(list3);


    }
}
