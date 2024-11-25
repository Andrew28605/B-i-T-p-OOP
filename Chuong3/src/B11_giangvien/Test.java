package B11_giangvien;

public class Test {
	 public static void main(String[] args) {
	        GVCoHuu gvch = new GVCoHuu();
	        System.out.println("nhap giang vien co huu");
	        gvch.nhapThongTin();
	        GVThinhGiang gvtg = new GVThinhGiang();
	        System.out.println("nhap giang vien thinh giang");
	        gvtg.nhapThongTin();
	        GiangVien gv1 = gvch;
	        GiangVien gv2 = gvtg;
	        System.out.println("thong tin cua giang vien co huu: " + gv1.inThongTin());
	        System.out.println("thong tin cua giang vien thinh giang: " + gv2.inThongTin());
	    }
	}
