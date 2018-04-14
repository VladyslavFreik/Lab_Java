import java.io.File;
import java.io.IOException;


public class FileProgram {
    public static void main(String[] args) throws IOException {
        File file = new File("file.txt");
        file.createNewFile();

        System.out.println("Існує: " + file.exists());
        System.out.println("Повний шлях: " + file.getAbsolutePath());

        File directory=new File("c:/students/");

        System.out.println("Каталог: " + directory.isDirectory());

        System.out.println(directory.getName());
//        String[] files = directory.list();
//        for (String each : files) {
//            System.out.println(" " + each);
//        }



    }


}
