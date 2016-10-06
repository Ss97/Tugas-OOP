import javax.swing.JOptionPane;

public class Lingkaran {
	
	public static void main(String[] args) {
		double r;
		int pilih = Integer.parseInt(JOptionPane.showInputDialog("Pilih salah satu\n1. Cari Luas\n2.Cari Keliling"));
		r = Double.parseDouble(JOptionPane.showInputDialog("Masukkan jari-jari"));
        System.out.println("Author : Dwiki Nurkurniawan Satya Putra 140810150014");
		switch (pilih) {
			case 1 : System.out.println("Luas Lingkaran : " + cariLuas(r));
					 break;
			case 2 : System.out.println("Keliling Lingkaran : " + cariKeliling(r));
		}
	}

	public static double cariLuas(double r) {
		return java.lang.Math.PI * (r * r);
	}

	public static double cariKeliling(double r) {
		return 2 * java.lang.Math.PI * r;
	}

}