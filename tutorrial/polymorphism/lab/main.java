package tutorrial.polymorphism.lab;

public class Main {
    public static void main(String[] args) {
        Sinhvien it1 = new SinhVienIT(10, 7);
		System.out.println(" sinh vien it score = " + it1.getScore());

		Sinhvien cokhi1 = new SinhVienCoKhi(6, 9);
		System.out.println(" sinh vien cokhi1 score = " + cokhi1.getScore());

    }
}
