package B2_InvalidDate;

public class ThoiGian {
	 private int ngay;
	    private int thang;
	    private int nam;

	    public ThoiGian() {
	    }

	    public ThoiGian(int ngay, int thang, int nam) throws InvalidDateTimeException {
	        if(ngay<=0 || thang<0 ||nam <0)
	            throw new InvalidDateTimeException("ngay,thang,nam phai la cac so duong");
	        if (ngay>31)
	            throw new InvalidDateTimeException("ngay khong duoc la so qua 31");
	        if(thang>12)
	            throw new InvalidDateTimeException("thang khong duoc la so qua 12");
	        this.ngay = ngay;
	        this.thang = thang;
	        this.nam = nam;
	    }

	    public int getNgay() {
	        return ngay;
	    }

	    public void setNgay(int ngay) {
	        this.ngay = ngay;
	    }

	    public int getThang() {
	        return thang;
	    }

	    public void setThang(int thang) {
	        this.thang = thang;
	    }

	    public int getNam() {
	        return nam;
	    }

	    public void setNam(int nam) {
	        this.nam = nam;
	    }

	    @Override
	    public String toString() {
	        return "ThoiGian{" +
	                "ngay=" + ngay +
	                ", thang=" + thang +
	                ", nam=" + nam +
	                '}';
	    }


	}
