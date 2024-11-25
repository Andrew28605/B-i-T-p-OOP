package B7_Cricle;
import java.util.Scanner;

public class ResizableCircle extends Circle implements Resizable {

    public ResizableCircle() {
    }

    public ResizableCircle(double radius) {
        super(radius);
    }
    public void nhap(){
        super.nhap();
    }
    @Override
    public void resize(int percent) {
        radius = radius * percent / 100;
    }
    
    public String inThongTin(){
        return "ban kinh=" + radius + " ,dien tich=" + getPerimeter() + " ,chu vi=" + getArea();
    }
}