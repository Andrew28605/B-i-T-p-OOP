package Bai4_tra_tu_dien;
import java.util.HashMap;
import java.util.Map;

public class Dictionary {
	// Tạo HashMap lưu trữ các từ và nghĩa
    private Map<String, String> dictionary;

    // Constructor để khởi tạo từ điển
    public Dictionary() {
        dictionary = new HashMap<>();
        // Thêm các từ và nghĩa vào từ điển
        dictionary.put("apple", "qua tao");
        dictionary.put("ball", "qua bong");
        dictionary.put("cat", "con meo");
        dictionary.put("dog", "con cho");
        dictionary.put("elephant", "con voi");
        dictionary.put("fish", "con ca");
        dictionary.put("gift", "mon qua");
        dictionary.put("home", "nha");
    }

    // Phương thức lookup để tra cứu nghĩa của từ
    public String lookup(String word) {
        return dictionary.getOrDefault(word, "khong tim thay");
    }
}
