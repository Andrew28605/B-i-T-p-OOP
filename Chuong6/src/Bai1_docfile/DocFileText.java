package Bai1_docfile;
import java.util.Scanner;
import java.io.*;

public class DocFileText {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap so nguyen: ");
		int a = sc.nextInt();
		System.out.println("nhap so thuc: ");
		double b = sc.nextDouble();
		System.out.println("nhap ky tu: ");
		char c = sc.next().charAt(0);
		System.out.println("nhap chuoi ky tu: ");
		String d = sc.next();
		System.out.println("so nguyen: " + a + "\n so thuc: " + b + "\n ky tu: " + c + "\n chuoi ky tu: " + d);
	    String file = "exp.text";
	    try(BufferedWriter writer = new BufferedWriter(new FileWriter(file))){
	    	writer.write("Chuoi ky tu: " + d +"\n" );
	    	
            writer.write("Ky tu: " + c +"\n");
            writer.write("So nguyen: " + a+"\n");
            writer.write("So thuc: " + b+"\n");
            System.out.println("Du lieu da duoc ghi vao file " + file);
	    }
	    catch(IOException e) {
	    	e.printStackTrace();
	    }
	    try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            System.out.println("\nDua ra du lieu tu file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } 
	    catch (IOException e) {
            e.printStackTrace();
        }
	}
}	
