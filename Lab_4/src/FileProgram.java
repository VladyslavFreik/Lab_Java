import java.io.*;;
public class FileProgram {

	public static void main(String[] args) throws IOException {
	/*	File file=new File ("file.txt");
		file.createNewFile();
		System.out.println("����: " + file.exists());
		System.out.println("������ ����: " + file.getAbsolutePath());*/
		String dirname = "e:/education/������ ������������� ����� Java/";
		File directory=new File(dirname);
		System.out.println("�������: " + directory.isDirectory());
		System.out.println(directory.getName());
		String[] files = directory.list();
		for (int i = 0; i < files.length; i++) {
			File f = new File(dirname + "/" + files[i]);
			if (f.isDirectory()) {
				System.out.println(files[i] + " - �� �������");
			} else {
				System.out.println(files[i] + " - �� ����");
			}
		}
		}
	}

