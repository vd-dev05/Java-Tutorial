package tutorrial.inheritance.lab;
//  ko tham so
class SinhVien {
    protected String id;
    protected String name;
    protected double price;
    protected double tax;

    // Constructor mặc định
    public SinhVien() {
        this.id = " ";
        this.name = " ";
        this.price = 0.0;
        this.tax = 0.0;
    }

    public double getPriceTax() {
        return price * tax;
    }
}

class SinhVienIT extends SinhVien {
    private String language;

    // Constructor mặc định
    public SinhVienIT() {
        super();
        this.language = " ";
    }

    @Override
    public double getPriceTax() {
        return super.getPriceTax();
    }

   
    public void setDetails(String id, String name, double price, double tax, String language) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.tax = tax;
        this.language = language;
    }
}

class SinhVienCoKhi extends SinhVien {
    private String skill;

    // Constructor mặc định
    public SinhVienCoKhi() {
        super();
        this.skill = " ";
    }

    @Override
    public double getPriceTax() {
        return super.getPriceTax();
    }


    public void setDetails(String id, String name, double price, double tax, String skill) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.tax = tax;
        this.skill = skill;
    }
}

public class bai1 {
    public static void main(String[] args) {
        SinhVienIT svIT = new SinhVienIT();
        svIT.setDetails("SV001", "Nguyen Van A", 2000000, 0.1, "Java");
        
        SinhVienCoKhi svCK = new SinhVienCoKhi();
        svCK.setDetails("SV002", "Tran Thi B", 1500000, 0.05, "Cơ khí");

        System.out.println("Học phí sinh viên IT: " + svIT.getPriceTax());
        System.out.println("Học phí sinh viên Cơ khí: " + svCK.getPriceTax());
    }
}
