import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
public class FileReaderPrezent {
	public static void main(String[] args) throws IOException {
		String dirname = "C:/Users/DELL/eclipse-workspace/LR_4/src/FileReaderPrezent.java";
		FileReader fr = new FileReader(dirname);
		BufferedReader br = new BufferedReader(fr);
		String s;
		while ((s = br.readLine()) != null) {
			System.out.println(s);
		}
		fr.close();
	}
}
