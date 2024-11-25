package B2_InvalidDate;

public class Test {
	public static void main(String[] args) {
        try {
            ThoiGian TG1= new ThoiGian(-5,15,2020);
            System.out.println(TG1);
        } catch (InvalidDateTimeException e) {
            System.out.println("loi "+e.getMessage());
        }
    }
}
