package baitapvenha;

public class hinhvuong {
	private int canh;


	public hinhvuong(int canh) {
		super();
		this.canh = canh;
	}

	public int getCanh() {
		return canh;
	}

	public void setCanh(int canh) {
		this.canh = canh;
	}

	public int chuvi() {
		return 4 * this.canh;
	}

	public int dientich() {
		return this.canh * this.canh;
	}

	public static void main(String[] args) {

		hinhvuong hv = new hinhvuong(8);
		System.out.println(hv.dientich());
		System.out.println(hv.chuvi());
		// nhanvien.TestNv();
	}
}
