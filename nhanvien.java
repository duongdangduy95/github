package baitapvenha;

//import bai3.NhanVien;

public class nhanvien {
	private String tenNhanVien;

	public String getTenNhanVien() {
		return tenNhanVien;
	}

	public void setTenNhanVien(String tenNhanVien) {
		this.tenNhanVien = tenNhanVien;
	}

	private double luongcoban, hesoluong, luongmax;

	public double getLuongcoban() {
		return luongcoban;
	}

	public void setLuongcoban(double luongcoban) {
		this.luongcoban = luongcoban;
	}

	public double getHesoluong() {
		return hesoluong;
	}

	public void setHesoluong(double hesoluong) {
		this.hesoluong = hesoluong;
	}

	public double getLuongmax() {
		return luongmax;
	}

	public void setLuongmax(double luongmax) {
		this.luongmax = luongmax;
	}

	public double tinhluong() {
		double k = hesoluong * luongcoban;
		return k;
	}

	public boolean tangluong(double k) {
		double luong = luongcoban * (hesoluong + k);
		if (luong > luongmax) {
			System.out.println("luong vuot muc");
			return false;
		} else {
			return true;
		}
	}

	public void inTTin() {

		System.out.println("ten nhan vien " + tenNhanVien);
		System.out.println("luong co ban " + luongcoban);
		System.out.println("he so luong " + hesoluong);
		System.out.println("luong " + tinhluong());

	}

	public static void TestNv() {
		nhanvien nv = new nhanvien();
		nv.setTenNhanVien("duongdangduy");
		nv.setLuongcoban(4000);
		nv.setHesoluong(2);
		nv.setLuongmax(10000);
		nv.inTTin();
		nv.tangluong(1);
	}

	public static void main(String[] args) {
		nhanvien.TestNv();
		// nhanvien nv=new nhanvien();
		// nv.setTenNhanVien("duongdangduy");
		// nv.setLuongcoban(4000);
		// nv.setHesoluong(2);
		// nv.setLuongmax(10000);
		// nv.inTTin();
		// nv.tangluong(1);
	}
}
