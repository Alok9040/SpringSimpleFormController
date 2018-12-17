package command;

import java.util.Date;
import java.util.List;

public class StudentCommand 
{
	public StudentCommand() 
	{
		System.out.println("Command");
	}
	private String name;
	private String password;
	private int age;
	private List<String> course;
	private Date date;
	
	
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public List<String> getCourse() {
		return course;
	}
	public void setCourse(List<String> course) {
		this.course = course;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "StudentCommand [name=" + name + ", password=" + password + ", age=" + age + ", course=" + course
				+ ", date=" + date + "]";
	}
	
	
	

}
