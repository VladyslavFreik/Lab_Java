import java.io.File;
public class DirectoryPrezent {
    public static void main(String[] args) {
        String dirname = "  E:/Навчання/2 семестер/Java/Lab_4/";
        File f1 = new File(dirname);
        if (f1.isDirectory()) {
            System.out.println("Каталог " + dirname);
            String s[] = f1.list();
            for (int i = 0; i < s.length; i++) {
                File f = new File(dirname + "/" + s[i]);
                if (f.isDirectory()) {
                    System.out.println(s[i] + " - це каталог");
                } else {
                    System.out.println(s[i] + " - це файл");
                }
            }
        } else {
            System.out.println(dirname + " - це не каталог");
        }
    }
}
