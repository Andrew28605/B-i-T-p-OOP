package B14_congnhan;

public class Test {
	 public static void main(String[] args) {
	        CNKSP cnksp = new CNKSP();
	        System.out.println("nhap CNKSP");
	        cnksp.nhapThongTin();
	        System.out.println("nhan CNTCN");
	        CNTCN cntcn = new CNTCN();
	        cntcn.nhapThongTin();
	        System.out.println("CNKSP: " + cnksp.toString());
	        System.out.println("CNTCN: " + cntcn.toString());
	    }
	}
