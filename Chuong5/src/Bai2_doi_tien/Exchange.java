package Bai2_doi_tien;
import java.util.ArrayList;

public class Exchange {
	 private ArrayList<Rate> rates;

	    // Constructor
	    public Exchange() {
	        rates = new ArrayList<>();
	        // Dữ liệu mảng MonArr
	        String[] monArr = {
	            "USD;VND;17000", "EUR;USD;1.2", "USD;IDN;15789", "USD;EUR;0.83", "CAD;IDN;16869"
	        };

	        // Phân tách mảng và tạo các đối tượng Rate
	        for (String entry : monArr) {
	            String[] parts = entry.split(";");
	            String code1 = parts[0];
	            String code2 = parts[1];
	            double rate = Double.parseDouble(parts[2]);
	            rates.add(new Rate(code1, code2, rate));
	        }
	    }

	    // Phương thức chuyển đổi tiền tệ
	    public double convert(String code1, String code2, double amount) {
	        for (Rate rate : rates) {
	            // Kiểm tra nếu tìm thấy tỷ giá
	            if (rate.getCode1().equals(code1) && rate.getCode2().equals(code2)) {
	                return amount * rate.getRate();
	            }
	        }
	        return -1;  // Trả về -1 nếu không tìm thấy tỷ giá
	    }
	}
