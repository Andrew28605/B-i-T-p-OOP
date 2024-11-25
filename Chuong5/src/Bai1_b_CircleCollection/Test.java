package Bai1_b_CircleCollection;

import Bai1_a_Circle.Circle;

public class Test {
	  public static void main(String[] args) {
	        // Tạo đối tượng CircleCollection
	        CircleCollection collection = new CircleCollection();

	        // Thêm các hình tròn vào danh sách
	        collection.addCircle(new Circle(3.0));
	        collection.addCircle(new Circle(5.0));
	        collection.addCircle(new Circle(2.0));

	        // In thông tin các hình tròn
	        System.out.println("Danh sách hình tròn:");
	        System.out.println(collection);

	        // Tính tổng diện tích
	        System.out.println("Tổng diện tích: " + collection.calcSumArea());

	        // Tìm diện tích nhỏ nhất và lớn nhất
	        System.out.println("Diện tích nhỏ nhất: " + collection.findMinArea());
	        System.out.println("Diện tích lớn nhất: " + collection.findMaxArea());

	        // Lấy và cập nhật hình tròn tại vị trí 1
	        Circle circle = collection.getCircle(1);
	        System.out.println("Hình tròn tại vị trí 1: " + circle);

	        collection.setCircle(1, new Circle(6.0));
	        System.out.println("Danh sách sau khi cập nhật:");
	        System.out.println(collection);
	    }
	}
