package ua.edu.kep.ua.edu.kep.lr_3;

import ua.edu.kep.Human;

public class Program {
    public static void main(String[]args) {

        Human h = new Human();
        h.backslash();
        Human h2 = new Human("Іван Мазепа", 32);
        h2.print();


        h.setName("Богдан Хмельницький");
        h.setAge(0);
        h.setAddress("Шевченка");
        h.setCity("Івано-Франківськ");
        h.setCountry("Україна");
        h.setPhone("0981232584");
        h.setWeight(57);
        h.setHeight(160);
        h.backslash();

        h.print();
        h.backslash();

        h.setAge(11);
        h.printAgeInfo();
        h.backslash();

        h.setAge(15);
        h.printAgeInfo();
        h.backslash();

        h.setAge(19);
        h.printAgeInfo();
        h.backslash();

        h.setAge(23);
        h.printAgeInfo();
        h.backslash();

        h.setAge(76);
        h.printAgeInfo();
        h.backslash();

        h.setAge(62);
        h.printAgeInfo();
        h.backslash();

        h.printContactInfo();
        System.out.println("AvgWeight is " + h.avgWeight());




    }





}
