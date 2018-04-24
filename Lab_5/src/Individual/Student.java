package Individual;

public class Student {
    private String surname;
    private String name;
    private String date;


    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




    Student() {
    }

    Student(String surname, String name, String date) {
        this.surname = surname;
        this.name = name;
        this.date = date;
    }


}
