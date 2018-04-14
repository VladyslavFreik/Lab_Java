package ua.edu.kep.ua.edu.kep.lr_3;
import ua.edu.kep.Human;

public class Student extends Human {
    private int course;
    private String groupName;


    public int getCourse() {
        return course;
    }

    public String getGroupName() {
        return groupName;
    }


    public void setCourse(int course) {
        this.course = course;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void print() {
        super.print();

        System.out.println("Courese is " + course);
        System.out.println("GroupName is " + groupName);

    }

    public Student (){
        System.out.println("Hello world");
    }

    public Student(String name, int age, String groupName, int course) {
        setName(name);
        setAge(age);
        this.groupName = groupName;
        this.course = course;
    }

    public void infoCourse() {
        System.out.println("Course = " + (8 - Integer.parseInt(String.valueOf(groupName.charAt(4)))));
    }


}
