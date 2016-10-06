import javax.swing.JOptionPane;

public class Tugas3 {
	public static void main(String[] args) {
		System.out.println("Author : 140810150014 Dwiki Nurkurniawan Satya Putra");
		int tahun = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Tahun (1990 -2016)"));
		
		if (tahun < 1990 || tahun > 2016) {
			if (tahun < 1990) {
				System.out.println("Maaf, tahun input dibawah 1900");
			} else {
				System.out.println("Maaf, tahun input diatas 2016");
			}
		} else {
			if (tahun % 4 == 0) {
				System.out.println(tahun + " adalah tahun kabisat");
			} else {
				System.out.println(tahun + " bukan tahun kabisat");
			}
		}
	}
}