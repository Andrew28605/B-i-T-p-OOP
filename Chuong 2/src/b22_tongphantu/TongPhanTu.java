package b22_tongphantu;
import java.util.Scanner;

public class TongPhanTu {
	 //nhap mang
    public static float [] nhapMang(int n){
        float [] mang=new float[n];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++){
            System.out.print("a["+i+"]= ");
            mang[i]=sc.nextFloat();
        }
        return mang;
    }
    //tinh tong
    public static float tinhTong(float [] mang) {
        float tong = 0;
        for(int i=0;i<mang.length;i++){
            tong+=mang[i];
        }
        return tong;
    }
//main
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("nhap vao so phan tu cua mang n : ");
    int n = sc.nextInt();
    float[] mangN= nhapMang(n);
    System.out.println("tong phan tu cua mang n la : "+tinhTong(mangN));
}

}
