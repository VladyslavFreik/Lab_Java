import java.io.*;

public class SerializationProgram {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student student1 = new Student();
        student1.setName("Vlad");
        student1.setAge(17);

        try {
            FileOutputStream fileOutput = new FileOutputStream("file.txt");
            ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput);
            objectOutput.writeObject(student1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        FileInputStream fileInput= new FileInputStream("file.txt");
        ObjectInputStream objectOutput = new ObjectInputStream(fileInput);
        Student student2 = (Student) objectOutput.readObject();
        System.out.println(student2.getName());
        System.out.println(student2.getAge());





    }
}
