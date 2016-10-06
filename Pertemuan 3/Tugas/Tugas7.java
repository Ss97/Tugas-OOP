import javax.swing.JOptionPane;

public class Tugas7 {
	public static void main(String[] args) {
		System.out.println("Author : Dwiki Nurkurniawan Satya Putra 140810150014");
		String in = JOptionPane.showInputDialog("Masukkan String utama");
		String cari = JOptionPane.showInputDialog("String yang diganti");
		String pengganti = JOptionPane.showInputDialog("String Pengganti");
		System.out.println("String Utama : " + in);
		System.out.println("Dicari : " + cari);
		System.out.println("Pengganti : " + pengganti);
		in = in.replace(cari, pengganti);
		System.out.println(in);
	}
}