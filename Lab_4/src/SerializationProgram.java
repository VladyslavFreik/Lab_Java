import java.io.*;
public class SerializationProgram {

	public static void main(String[] args) throws IOException {
		Student student1 = new Student();
		student1.setName("Dimas");
		System.out.println(student1.getName());
		student1.setAge(18);
		System.out.println(student1.getAge());
		try {
			FileOutputStream fileOutput = new FileOutputStream("file.txt");
			ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput);
			objectOutput.writeObject(student1);
			objectOutput.close();
			FileInputStream fileInput= new FileInputStream("file.txt");
			ObjectInputStream objectInput = new ObjectInputStream(fileInput);
			Student student2 = (Student) objectInput.readObject();
			System.out.println(student2.getName());
			System.out.println(student2.getAge());
			objectInput.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
