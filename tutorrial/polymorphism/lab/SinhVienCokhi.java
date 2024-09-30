package tutorrial.polymorphism.lab;

public class SinhVienCoKhi extends Sinhvien {
    private double scoreCNC;
    private double scorePLC;

    double getScore() {
        return  (this.scoreCNC + this.scorePLC) /2;
    }

    public double getScoreCNC() {
        return scoreCNC;
    }

    public double getScorePLC() {
		return scorePLC;
	}

	public void setScorePLC(double scorePLC) {
		this.scorePLC = scorePLC;
	}

	public SinhVienCoKhi(double scoreCNC, double scorePLC) {
		super();
		this.scoreCNC = scoreCNC;
		this.scorePLC = scorePLC;
	}

}
