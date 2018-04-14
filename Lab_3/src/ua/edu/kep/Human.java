package ua.edu.kep;


/*
    	Адреса проживання (address) – рядковий тип.
    	Місто проживання (city) – рядковий тип.
    	Країна проживання (country) – рядковий тип.
    	Номер телефону (phone) – рядковий тип.
    	Ріст людини (height) – ціле число.
    	Вага людини (weight) – ціле число.
*/
public class Human {
    private String name;
    private int age;
    private String address;
    private String city;
    private String country;
    private String phone;
    private int height;
    private int weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() != 0) {
            this.name = name.trim();
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 0 && age < 100) {
            this.age = age;
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void print() {
        System.out.println("Name is " + name);
        System.out.println("Age is " + age);
        System.out.println("Address = " + address);
        System.out.println("City = " + city);
        System.out.println("Country = " + country);
        System.out.println("Phone = " + phone);
        System.out.println("Height = " + height);
        System.out.println("Weight = " + weight);
    }

    public void printAgeInfo() {
        if(age < 12) {
            System.out.println("Age is " + age + " дитина");
        }
        else if(age < 18) {
            System.out.println("Age is " + age + " підліток");
        }
        else if(age < 22) {
            System.out.println("Age is " + age + " студент");
        }
        else if(age > 75) {
            System.out.println("Age is " + age + " старечий вік");
        }
        else if(age > 60) {
            System.out.println("Age is " + age + " похилий вік");
        }
        else if(age > 22) {
            System.out.println("Age is " + age + " середній вік");
        }
    }

    public void backslash(){
        System.out.println();
    }

    public void printContactInfo() {
        System.out.println("Address = " + address);
        System.out.println("Pnone = " + phone);
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
