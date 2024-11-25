package B7_Cricle;
import java.util.Scanner;

public class Circle implements GeometriObject {
	   protected double radius = 1.0;

	    public Circle() {
	    }
	    public Circle(double radius){
	        this.radius = radius;
	    }
	    public void nhap(){
	        Scanner sc = new Scanner(System.in);
	        System.out.printf("nhap ban kinh: "); radius = sc.nextDouble();
	    }

	    @Override
	    public double getPerimeter() {
	        return 2 * Math.PI * radius;
	    }

	    @Override
	    public double getArea() {
	        return Math.PI * radius * radius;
	    }
	    
	}
