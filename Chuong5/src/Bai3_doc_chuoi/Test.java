package Bai3_doc_chuoi;
import java.util.HashMap;
import java.util.Map;

public class Test {
	public static void main(String[] args) {
        // Mảng các chuỗi ban đầu
        String[] inputStrings = {
            "learn java by example",
            "guide to advance java",
            "example of distributed in java"
        };

        // Tạo HashMap để lưu trữ tần suất từ
        Map<String, Integer> wordCountMap = new HashMap<>();

        // Đếm số lần xuất hiện của mỗi từ
        int totalWords = 0;

        for (String sentence : inputStrings) {
            // Tách từng câu thành các từ
            String[] words = sentence.split(" ");

            // Lặp qua từng từ trong câu và đếm tần suất
            for (String word : words) {
                // Tăng tần suất của từ trong HashMap
                wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                totalWords++;
            }
        }

        // Hiển thị tần suất của từng từ
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Hiển thị tổng số từ
        System.out.println("Total words: " + totalWords);
    }
}
