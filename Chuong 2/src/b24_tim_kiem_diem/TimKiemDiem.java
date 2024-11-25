package b24_tim_kiem_diem;
import java.util.Scanner;

public class TimKiemDiem {
    //nhap diem
    public static float []nhapDiem(int n){
        Scanner sc=new Scanner(System.in);
        float [] diem=new float[n];
        for(int i=0;i<n;i++){
            System.out.print("a["+i+"]= ");
            diem[i]=sc.nextFloat();
        }
        return diem;
    }
    public static void checkDiem(float [] diem,float n){
        int sopt=0;
        for(int i=0;i<diem.length;i++){
            if(diem[i]==n)
                sopt++;
            else
                sopt=sopt+0;
        }
        if(sopt>0)
            System.out.println("co "+sopt+" phan tu la diem "+n);
        if(sopt==0)
            System.out.println("khong co diem trong danh sach");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao so phan tu cua mang diem : ");
        int n= sc.nextInt();
        float []dsDiem= nhapDiem(n);
        System.out.println("nhap vao so diem can tim : ");
        float timDiem= sc.nextFloat();
        checkDiem(dsDiem,timDiem);

    }
}
