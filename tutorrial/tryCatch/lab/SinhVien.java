package tutorrial.tryCatch.lab;

import java.util.Scanner;

class SinhVien {
    private String masv;
    private String hoten;
    private double diem;
    private int age;

    public  SinhVien(String masv, String hoten,double diem,int age) {
        this.masv = masv;
        this.hoten = hoten;
        this.diem = diem;
        this.age = age;
    }

    public String getMasv() {
        return masv;
    }
    public void setMasv(String masv) {
        this.masv = masv;
    }
    public String getHoten() {
        return hoten;
    }
    public  void setHoten(String hoten) {
        this.hoten = hoten;
    }
    public String toString() {
        return "Ma SV: " + masv + ", Ho Ten: " + hoten + ", Điem: " + diem + ", Tuoi: " + age;
    }
    public static SinhVien nhapDuLieu() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap ma sinh vien: ");
        String masv = scanner.nextLine();
        
        System.out.print("Nhap ho ten: ");
        String hoten = scanner.nextLine();
        
        double diem;
        while (true) {
            try {
                System.out.print("Nhap điem (0 < điem < 10): ");
                diem = Double.parseDouble(scanner.nextLine());
                if (diem <= 0 || diem >= 10) {
                    throw new IllegalArgumentException();
                }
                break;
            } catch (Exception e) {
                System.out.println("Điem khong hop le! Vui lòng nhap lai.");
            }
        }

        int age;
        while (true) {
            try {
                System.out.print("Nhap tuoi (18 < tuoi < 100): ");
                age = Integer.parseInt(scanner.nextLine());
                if (age <= 18 || age >= 100) {
                    throw new IllegalArgumentException();
                }
                break;
            } catch (Exception e) {
                System.out.println("Tuoi khong hop le! Vui long nhap lai.");
            }
        }

        return new SinhVien(masv, hoten, diem, age);
    }

    public static void main(String[] args) {
        SinhVien sv = nhapDuLieu();
        System.out.println(sv);
    }
}
