import java.io.*;
public class StreamProgram {

	public static void main(String[] args) throws IOException {
		File file=new File ("file.txt");
		file.createNewFile();
		System.out.println("ѕовний шл€х: " + file.getAbsolutePath());
		try {
			FileOutputStream output = new FileOutputStream("file.txt");
			output.write("яс≥нський".getBytes());
			output.close();
			FileInputStream input =new FileInputStream("file.txt");
			byte[] buffer = new byte[10];
			int length = input.read(buffer);
			while (length != -1) {
				System.out.println(new String(buffer, 0, length));
				length = input.read(buffer);
			}
			input.close();
		} catch (Exception e) {
			e.printStackTrace();
		}


}
}
