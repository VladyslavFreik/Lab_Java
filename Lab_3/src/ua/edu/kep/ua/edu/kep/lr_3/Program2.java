package ua.edu.kep.ua.edu.kep.lr_3;

import ua.edu.kep.Human;

public class Program2 {
    public static void main (String[] args){

        Student s = new Student();
        s.print();

        s.backslash();

        Student s1 = new Student("Вася Пупкін", 18, "ПІ-13-01", 3);
        s1.print();
        System.out.println();
        s1.infoCourse();



    }


}
