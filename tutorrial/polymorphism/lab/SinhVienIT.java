package tutorrial.polymorphism.lab;

public class SinhVienIT extends Sinhvien {
    private double scoreJava;
	private double scoreHTML;

	public double getScoreJava() {
		return scoreJava;
	}

	public void setScoreJava(double scoreJava) {
		this.scoreJava = scoreJava;
	}

	public double getScoreHTML() {
		return scoreHTML;
	}

	public void setScoreHTML(double scoreHTML) {
		this.scoreHTML = scoreHTML;
	}

	// @Override
	double getScore() {
		// TODO Auto-generated method stub
		return (this.scoreJava * 2 + this.scoreHTML) / 3;
	}

	public SinhVienIT(double scoreJava, double scoreHTML) {
		super();
		this.scoreJava = scoreJava;
		this.scoreHTML = scoreHTML;
	}

}
