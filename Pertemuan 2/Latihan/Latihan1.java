import javax.swing.JOptionPane;

public class Latihan1 {
	public static void main(String[] args) {
		System.out.println("Author : 140810150014 Dwiki Nurkurniawan Satya Putra");
		char input = JOptionPane.showInputDialog("Masukkan satu huruf").charAt(0);
		if ((int) input >= 97 && (int) input <= 122) {
			System.out.println(input + " adalah Huruf Kecil");
		} else if ((int) input >= 65 && (int) input <= 90) {
			System.out.println(input + " adalah Huruf Besar");
		} else if ((int) input >= 48 && (int) input <= 57) {
			System.out.println(input + " adalah Angka");
		} else {
			System.out.println(input + " adalah Simbol");
		}
	}
}