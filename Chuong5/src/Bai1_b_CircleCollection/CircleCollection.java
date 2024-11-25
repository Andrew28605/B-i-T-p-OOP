package Bai1_b_CircleCollection;
import java.util.ArrayList;

import Bai1_a_Circle.Circle;



public class CircleCollection {
	 private ArrayList<Circle> al;

	    // Hàm khởi tạo
	    public CircleCollection() {
	        al = new ArrayList<>();
	    }

	    // Phương thức thêm một hình tròn vào danh sách
	    public void addCircle(Circle c) {
	        al.add(c);
	    }

	    // Phương thức lấy hình tròn tại vị trí pos
	    public Circle getCircle(int pos) {
	        if (pos >= 0 && pos < al.size()) {
	            return al.get(pos);
	        }
	        throw new IndexOutOfBoundsException("Vị trí không hợp lệ!");
	    }

	    // Phương thức thiết lập giá trị cho phần tử tại vị trí pos
	    public void setCircle(int pos, Circle c) {
	        if (pos >= 0 && pos < al.size()) {
	            al.set(pos, c);
	        } else {
	            throw new IndexOutOfBoundsException("Vị trí không hợp lệ!");
	        }
	    }

	    // Ghi đè phương thức toString để trả về thông tin các hình tròn trong danh sách
	    @Override
	    public String toString() {
	        StringBuilder sb = new StringBuilder();
	        for (Circle c : al) {
	            sb.append(c.toString()).append("\n");
	        }
	        return sb.toString();
	    }

	    // Phương thức tính tổng diện tích của tất cả các hình tròn
	    public double calcSumArea() {
	        double sum = 0;
	        for (Circle c : al) {
	            sum += c.getArea();
	        }
	        return sum;
	    }

	    // Phương thức tìm diện tích nhỏ nhất
	    public double findMinArea() {
	        if (al.isEmpty()) {
	            throw new IllegalStateException("Danh sách rỗng!");
	        }
	        double minArea = al.get(0).getArea();
	        for (Circle c : al) {
	            if (c.getArea() < minArea) {
	                minArea = c.getArea();
	            }
	        }
	        return minArea;
	    }

	    // Phương thức tìm diện tích lớn nhất
	    public double findMaxArea() {
	        if (al.isEmpty()) {
	            throw new IllegalStateException("Danh sách rỗng!");
	        }
	        double maxArea = al.get(0).getArea();
	        for (Circle c : al) {
	            if (c.getArea() > maxArea) {
	                maxArea = c.getArea();
	            }
	        }
	        return maxArea;
	    }
	}