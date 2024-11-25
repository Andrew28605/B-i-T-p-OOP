package B8_geometry;

public class Test {
	public static void main(String[] args) {
        System.out.println("nhap thong tin cua hinh chu nhat");
        Rectangle rectangle = new Rectangle();
        rectangle.nhap();
        
        System.out.println("nhap thong tin cua hinh tam giac");
        Triangle triangle = new Triangle();
        triangle.nhap();
        
        System.out.printf("\ndien tich dinh chu nhat la: " + rectangle.getArea());
        System.out.printf("\nthong tin hinh chu nhat: " + rectangle.toString());
        System.out.printf("\ndien tich dinh tam giac la: " + triangle.getArea());
        System.out.printf("\nthong tin hinh tam giac: " + triangle.toString());
        
        
    }
}
