import javax.swing.JOptionPane;

public class Tugas6 {
	public static void main(String[] args) {
		System.out.println("Author : Dwiki Nurkurniawan Satya Putra 140810150014");
		String per = JOptionPane.showInputDialog("Masukkan Nama Pertama");
		String ked = JOptionPane.showInputDialog("Masukkan Nama Kedua");
		String temp1 = "";
		System.out.println("Input");
		System.out.println("Nama Pertama : " + per);
		System.out.println("Nama Kedua : " + ked);
		for (int i = per.length() - 1; i >= 0; i--) {
			if (per.charAt(i) == ' ') {
				temp1 = per.substring(i);
				per = per.substring(0, i);
				System.out.println(per);
				break;
			}
		}
		for (int i = ked.length() - 1; i >= 0; i--) {
			if (ked.charAt(i) == ' ') {
				per += ked.substring(i);
				ked = ked.substring(0, i) + temp1;
			}
		}

		System.out.println("Output");
		System.out.println("Nama Pertama : " + per);
		System.out.println("Nama Kedua : " + ked);
	}
}