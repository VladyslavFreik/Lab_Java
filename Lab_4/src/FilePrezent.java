import java.io.File;
public class FilePrezent {
	static void p(String s) {
		System.out.println(s);
	}
	public static void main(String[] args) {
		File f1 = new File(
				"C:/Users/DELL/eclipse-workspace/LR_4/src/FilePrezent.java");
		p("��� �����: " + f1.getName());
		p("����: " + f1.getPath());
		p("������ ����: " + f1.getAbsolutePath());
		p("����������: " + f1.getParent());
		p(f1.exists() ? " ����" : " �� ����");
		p(f1.canWrite() ? " ��� ������" : " �� ��� ������");
		p(f1.canRead() ? " ��� �������" : " �� ��� �������");
		p("������� ���� �����: " + f1.lastModified());
		p("����� ����� " + f1.length() + " �����");
	}
}
