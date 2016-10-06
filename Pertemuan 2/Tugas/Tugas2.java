import javax.swing.JOptionPane;
public class Tugas2 {
	public static void main(String[] args) {
		System.out.println("Author : 140810150014 Dwiki Nurkurniawan Satya Putra");
		double a = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai a"));
		double b = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai b"));
		double c = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai c"));

		double d = (b * b) - (4 * a * c)		;
		if (d == 0) {
			System.out.println("x1 = x2 = " + ((-1*b) / (2 * a)));
		} else if (d > 0) {
			System.out.println("x1 = " + (((-1 * b) + (Math.sqrt(d))) / (2 * a)));
			System.out.println("x2 = " + (((-1 * b) - (Math.sqrt(d))) / (2 * a)));
		} else {
			double x1 = -b / (2*a);
			double x2 = Math.sqrt(d) / (2 * a);
			System.out.println("x1 = " + x1 + " + " + x2 + " i");
			System.out.println("x1 = " + x1 + " - " + x2 + " i");
		}
	}
}