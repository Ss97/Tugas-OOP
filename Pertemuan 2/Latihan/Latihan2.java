import javax.swing.JOptionPane;

public class Latihan2 {
	public static void main(String[] args) {
		System.out.println("Author : 140810150014 Dwiki Nurkurniawan Satya Putra");
		int input = Integer.parseInt(JOptionPane.showInputDialog("Masukkan angka"));
		fakt(input);
	}

	public static void fakt(int n) {
		int ret = 1;
		System.out.println("n\t\tn!");
		System.out.println("------------------");
		for (byte i = 1; i <= n; ++i ) {
			System.out.println(i + "\t\t" + (ret*=i));
		}
	}
}