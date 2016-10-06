import javax.swing.JOptionPane;

public class Latihan3 {
	public static void main(String[] args) {
		try	{
			int angka = Integer.parseInt(JOptionPane.showInputDialog("Masukkan sebuah angka"));
			System.out.println("Author : 140810150014 Dwiki Nurkurniawan Satya Putra");
			for (int i = 2; i < angka; i++) {
				if (angka % i == 0) {
					System.out.println(angka + " bukan bilangan prima");
					break;
				}
				if (i == angka - 1) {
					System.out.println(angka + " merupakan bilangan prima");
				}
			}
		} catch(Exception e) {
			System.out.println("Error : " + e.toString());
		}
	}
}