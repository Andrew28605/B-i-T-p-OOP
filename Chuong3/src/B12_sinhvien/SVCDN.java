package B12_sinhvien;
import java.util.Scanner;

public class SVCDN extends Nguoi{
	 protected float TDKT;
	    protected int SMKT;

	    public SVCDN() {
	        super();
	    }

	    public SVCDN(float TDKT, int SMKT) {
	        this.TDKT = TDKT;
	        this.SMKT = SMKT;
	    }

	    public SVCDN(float TDKT, int SMKT, String hoTen, String diaChi, String loaiSV) {
	        super(hoTen, diaChi, loaiSV);
	        this.TDKT = TDKT;
	        this.SMKT = SMKT;
	    }

	    @Override
	    public float tinhDiem() {
	        return TDKT/SMKT;
	    }
	    public void nhapThongTin(){
	        Scanner sc = new Scanner(System.in);
	        super.nhapThongTin();
	        System.out.printf("nhap TDKT: "); TDKT = sc.nextFloat();
	        System.out.printf("nhap SMKT: "); SMKT = sc.nextInt();
	    }
	}
