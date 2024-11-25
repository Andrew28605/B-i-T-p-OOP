package B7_Cricle;

public class Test {
	   public static void main(String[] args) {
	        ResizableCircle rc = new ResizableCircle();
	        System.out.println("nhap thong tin ");
	        rc.nhap();
	        System.out.println("thong tin cua hinh tron la: " + rc.inThongTin());
	        rc.resize(50);
	        System.out.println("thong tin sau khi doi la: " + rc.inThongTin());
	    }
	}
