package B6_Employee;
import java.util.Scanner;

public class PartTimeEmployee extends Employee {
	 private int hoursPerWeek;

	    public PartTimeEmployee() {
	    }

	    public PartTimeEmployee(int hoursPerWeek) {
	        this.hoursPerWeek = hoursPerWeek;
	    }

	    public PartTimeEmployee(int hoursPerWeek, String dateHired) {
	        super(dateHired);
	        this.hoursPerWeek = hoursPerWeek;
	    }

	    public PartTimeEmployee(int hoursPerWeek, String dateHired, String name, int age, char gender) {
	        super(dateHired, name, age, gender);
	        this.hoursPerWeek = hoursPerWeek;
	    }
	    public void nhap(){
	        Scanner sc = new Scanner(System.in);
	        super.nhap();
	        System.out.printf("nhap so gio lam: ");hoursPerWeek = sc.nextInt();
	    }
	    @Override
	    public String toString() {
	        return super.toString() + "PartTimeEmployee{" + "hoursPerWeek=" + hoursPerWeek + '}';
	    }
	    
	}
