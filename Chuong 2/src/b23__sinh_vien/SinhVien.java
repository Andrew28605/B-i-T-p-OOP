package b23__sinh_vien;
import java.util.Scanner;

public class SinhVien {
	public static float []nhapDiem(int n){
        Scanner sc=new Scanner(System.in);
        float [] diem=new float[n];
        for(int i=0;i<n;i++){
            System.out.print("a["+i+"]= ");
            diem[i]=sc.nextFloat();
        }
        return diem;
    }
    //xuat diem
    public static void xuatDiem(float [] diem){
        for(int i=0;i<diem.length;i++)
            System.out.println("diem["+i+"]: "+diem[i]);
    }
    //sap xep diem theo chieu tang dan
    public static void sapXep(float [] diem){
        for(int i=0;i<diem.length;i++){
            for(int j=i+1;j<diem.length;j++){
                if(diem[j]<diem[i]){
                    float tmp=diem[i];
                    diem[i]=diem[j];
                    diem[j]=tmp;
                }
            }

        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap vao so luong diem muon nhap  : ");
        int n=sc.nextInt();
        float [] bangDiem=nhapDiem(n);
        sapXep(bangDiem);
        System.out.println("bang diem sau khi sap xep la : ");
        xuatDiem(bangDiem);
        float max=bangDiem[bangDiem.length-1];
        System.out.println("sinh vien co diem cao nhat la : "+max);
    }
}
