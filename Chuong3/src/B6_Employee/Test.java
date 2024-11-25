package B6_Employee;

public class Test {
	 public static void main(String[] args) {
	        PartTimeEmployee pte = new PartTimeEmployee();
	        System.out.println("nhap thong tin");
	        pte.nhap();
	        pte.setName("ABC");
	        System.out.println("ten la: " + pte.getName());
	        pte.setAge(20);
	        System.out.println("tuoi la: "+ pte.getAge());
	        
	        System.out.println("thong tin la: " + pte.toString());
	    }
	}
