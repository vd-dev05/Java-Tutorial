package tutorrial.inheritance.lab;
// ko co tham so

class  SinhVien {
    protected String id;
    protected String name;
    protected  double  price ;
    protected double  tax;

    public SinhVien(String id,String name,double  price , double  tax)  {
        this.id = id;
        this.name = name;
        this.price = price;
        this.tax = tax;
    }

    public double  getPriceTax() {
        return price * tax;
    }
}

class  SinhVienIT extends SinhVien {
    private String language;

    public  SinhVienIT(String id,String name, double price ,double tax,String language) {
        super(id, name, price, tax);
        this.language = " ";
    }

    public  double  getPriceTax() {
        return super.getPriceTax();
    }
}

class SinhVienCoKhi extends SinhVien {
    private String skill;

    public  SinhVienCoKhi(String id,String name, double price ,double tax, String skill) {
        super(id, name, price, tax);
        this.skill = " ";
    }

    public  double  getPriceTax() {
        return super.getPriceTax();
    }
}
public class bai {
    public static void main(String[] args) {
        SinhVienIT svit = new SinhVienIT("SV001", "Nguyen Van A", 5000000, 0.2, "java");
        SinhVienCoKhi svck = new SinhVienCoKhi("SV002", "Nguyen Van B", 51000000, 0.1, "Co khi");
        System.out.println(svit.getPriceTax());
        System.out.println(svck.getPriceTax());
    }
}
