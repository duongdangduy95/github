package baitapvenha;

public class hinhtron {
	public hinhtron(int bk) {
		super();
		this.bk = bk;
	}
	private int bk;
	public int getBk() {
		return bk;
	}
	public void setBk(int bk) {
		this.bk = bk;
	}
	public double chuvi() {
		return 6.28 * this.bk;
	}

	public double dientich() {
		return 3.14 * this.bk * this.bk;
	}
	public static void main(String[] args) {

		hinhtron ht = new hinhtron(4);
		System.out.println(ht.dientich());
		System.out.println(ht.chuvi());
	}
}
