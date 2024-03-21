package baitapvenha;

public class vector {
private double tp1,tp2,tp3;
    
    
    public vector(double tp1, double tp2, double tp3) {
		this.tp1 = tp1;
		this.tp2 = tp2;
		this.tp3 = tp3;
	}


	public vector() {
		
	}


	public double getTp1() {
		return tp1;
	}


	public void setTp1(double tp1) {
		this.tp1 = tp1;
	}


	public double getTp2() {
		return tp2;
	}


	public void setTp2(double tp2) {
		this.tp2 = tp2;
	}


	public double getTp3() {
		return tp3;
	}


	public void setTp3(double tp3) {
		this.tp3 = tp3;
	}


	public static vector truhaivecto(vector vt1, vector vt2) {
    	vector vt = new vector();
    	vt.setTp1(vt1.getTp1() - vt2.getTp1());
    	vt.setTp2(vt1.getTp2() - vt2.getTp2());
    	vt.setTp3(vt1.getTp3() - vt2.getTp3());
    	return vt;
    }
	
	
	
//	@Override
//	public String toString() {
//		return "vector [tp1=" + tp1 + ", tp2=" + tp2 + ", tp3=" + tp3 + "]";
//	}
	public static vector conghaivecto(vector vt1, vector vt2) {
    	vector vt = new vector();
    	vt.setTp1(vt1.getTp1() + vt2.getTp1());
    	vt.setTp2(vt1.getTp2() + vt2.getTp2());
    	vt.setTp3(vt1.getTp3() + vt2.getTp3());
    	return vt;
    }
	
	
	
//	@Override
//	public String toString() {
//		return "vector [tp1=" + tp1 + ", tp2=" + tp2 + ", tp3=" + tp3 + "]";
//	}
	public static vector nhanhaivecto(vector vt1, vector vt2) {
    	vector vt = new vector();
    	vt.setTp1(vt1.getTp1() * vt2.getTp1());
    	vt.setTp2(vt1.getTp2() * vt2.getTp2());
    	vt.setTp3(vt1.getTp3() * vt2.getTp3());
    	return vt;
    }
	public static vector nhanhangso(vector vt1,double hangso) {
    	vector vt = new vector();
    	vt.setTp1(vt1.getTp1() * hangso);
    	vt.setTp2(vt1.getTp2() * hangso);
    	vt.setTp3(vt1.getTp3() * hangso);
    	return vt;
    }
	
	
	@Override
	public String toString() {
		return "vector [tp1=" + tp1 + ", tp2=" + tp2 + ", tp3=" + tp3 + "]";
	}


	public static void main(String[] args) {
		vector vt1 = new vector(1.2, 2.3, 3.4);
		vector vt2 = new vector(1.2, 2.3, 4.5);
		vector vt = new vector();
		System.out.println(truhaivecto(vt1, vt2).toString()); 
		System.out.println(conghaivecto(vt1, vt2).toString());
		System.out.println(nhanhaivecto(vt1, vt2).toString());
		System.out.println(nhanhangso(vt1,3).toString());
	}
}
