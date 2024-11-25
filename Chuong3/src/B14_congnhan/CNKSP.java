package B14_congnhan;
import java.util.Scanner;

public class CNKSP  extends CongNhan{
	   protected double soSanPham;
	    protected double donGiaSanPham;

	    public double getSoSanPham() {
	        return soSanPham;
	    }

	    public void setSoSanPham(double soSanPham) {
	        this.soSanPham = soSanPham;
	    }

	    public double getDonGiaSanPham() {
	        return donGiaSanPham;
	    }

	    public void setDonGiaSanPham(double donGiaSanPham) {
	        this.donGiaSanPham = donGiaSanPham;
	    }

	    public String getHoTen() {
	        return hoTen;
	    }

	    public void setHoTen(String hoTen) {
	        this.hoTen = hoTen;
	    }

	    public String getDiaChi() {
	        return diaChi;
	    }

	    public void setDiaChi(String diaChi) {
	        this.diaChi = diaChi;
	    }

	    public String getLoaiCN() {
	        return loaiCN;
	    }

	    public void setLoaiCN(String loaiCN) {
	        this.loaiCN = loaiCN;
	    }

	    public CNKSP(double soSanPham, double donGiaSanPham, String hoTen, String diaChi, String loaiCN) {
	        super(hoTen, diaChi, loaiCN);
	        this.soSanPham = soSanPham;
	        this.donGiaSanPham = donGiaSanPham;
	    }

	    public CNKSP(double soSanPham, double donGiaSanPham) {
	        this.soSanPham = soSanPham;
	        this.donGiaSanPham = donGiaSanPham;
	    }

	    public CNKSP() {super();
	    }

	    
	    
	    public void nhapThongTin(){
	        Scanner sc = new Scanner(System.in);
	                super.nhapThongTin();
	        System.out.printf("nhap so san pham: "); soSanPham = sc.nextDouble();
	        System.out.printf("nhap don gia san pham: "); donGiaSanPham = sc.nextDouble();
	    }
	    /**
	     *
	     * @return
	     */
	    @Override
	    public double tinhLuong() {
	        double thuong = 0 ;  
	        if(soSanPham < 1000) thuong = 0;
	        if(soSanPham - 1000 >= 100) thuong = 1000000;
	        if(soSanPham - 1000 >= 150) thuong = 1500000;
	        double luong = soSanPham * donGiaSanPham + thuong;
	        return luong;
	    }

	    @Override
	    public String toString() {
	        return super.toString() + " ,CNKSP{" + "soSanPham=" + soSanPham + 
	                ", donGiaSanPham=" + donGiaSanPham  + '}';
	    }
	}
