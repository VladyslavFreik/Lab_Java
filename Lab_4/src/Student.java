import java.io.Serializable;

public class Student implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name, group;
	private int age;
	public String getName() {return name;}
	public void setName(String value) {
		this.name = value;}
	public int getAge() {return age;}
	public void setAge(int value) {
		this.age = value;}
	public String getGroup() {return group;}
	public void setGroup(String value) {
		this.group = value;}

}
