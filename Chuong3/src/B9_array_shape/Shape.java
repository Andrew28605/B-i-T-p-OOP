package B9_array_shape;
import java.util.Scanner;

public abstract class Shape {
	protected String color;

    public Shape() {
    }

    public Shape(String color) {
        this.color = color;
    }
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("nhap mau sac: ");
        color = sc.nextLine();
    }
    public abstract double getArea();

    @Override
    public String toString() {
        return "Shape{" + "color=" + color + '}';
    }
    
}
