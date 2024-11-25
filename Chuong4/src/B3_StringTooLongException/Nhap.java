package B3_StringTooLongException;

public class Nhap {
	String nhap;

    public Nhap(String nhap) throws Exception{
        if(nhap.length()>30){
            throw new Exception("chuoi khong duoc vuot qua 30 ki tu");
        }
        this.nhap = nhap;
    }

    public String getNhap() {
        return nhap;
    }

    public void setNhap(String nhap) {
        this.nhap = nhap;
    }

    @Override
    public String toString() {
        return "Nhap{" +
                "nhap='" + nhap + '\'' +
                '}';
    }
}
