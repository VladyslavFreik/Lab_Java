package ua.edu.kep;

import java.sql.SQLOutput;

public class Human {



    private String name;
    private int age;
    private String address;
    private String city;
    private String country;
    private String phone;
    private int height;
    private int weight;


    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getPhone() {
        return phone;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public int getAge()
    {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setAge(int value)
    {
        this.age = value;


    }

    public void setName(String value){
        this.name = value;
    }

    public void print() {
        System.out.println("Name is " + name);
        System.out.println("Age is " + age);
        System.out.println("Address is " + address);
        System.out.println("City is " + city);
        System.out.println("Country is " + country);
    }


    public void backslash(){
        System.out.println();
    }

    public void printAgeInfo(){
        if (age < 12 )
            System.out.println("дитина");
        else if (age < 18 )
            System.out.println("підліток");
        else if (age < 22 )
            System.out.println("студент");
        else if (age > 75 )
            System.out.println("старечий вік");
        else if (age < 60 )
            System.out.println("похилий вік");
        else if (age > 22 )
            System.out.println("середній вік");
    }

    public void addressaPhone(){
        System.out.println("Адреса - "+address);
        System.out.println("Телефон - "+phone);
    }

    public int avgWeight() {
        return height/weight;
    }


    public Human() {
        System.out.println("Ініціалізація об’єкта типу Human");
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }


}
