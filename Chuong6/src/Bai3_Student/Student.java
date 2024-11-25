package Bai3_Student;
import java.io.*;

public class Student {
	private String code;
	private String name;
	private String dob;
	private String gender;
	public Student() {
		this.code = "";
		this.name = "";
		this.dob = "";
		this.gender = "";
	}
	public Student(String code, String name, String dob, String gender) {
		super();
		this.code = code;
		this.name = name;
		this.dob = dob;
		this.gender = gender;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Student [code=" + code + ", name=" + name + ", dob=" + dob + ", gender=" + gender + "]";
	}
	//ghi doi tuong
	public void writeToFile(DataOutputStream out) throws IOException {
        out.writeUTF(this.code);
        out.writeUTF(this.name);
        out.writeUTF(this.dob);
        out.writeUTF(this.gender);
    }
	//doc doi tuong
	 public static Student readFromFile(DataInputStream in) throws IOException {
	        String code = in.readUTF();
	        String name = in.readUTF();
	        String dob = in.readUTF();
	        String gender = in.readUTF();
	        return new Student(code, name, dob, gender);
	    }
	}	