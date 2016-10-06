import javax.swing.JOptionPane;

public class Tugas1 {
	public static void main(String[] args) {
		int rad = Integer.parseInt(JOptionPane.showInputDialog("Masukkan radius"));
		int k = 1;
		for (int i = 0; i < (2* rad) - 1; i++) {
			for (int j = 1; j <= (2 * rad) - 1; j++) {
				if (i < rad) {
					if (j >= rad - i && j <= rad + i) {
						System.out.print("*");
					} else {
						System.out.print("0");
					}
				} else {
					if ((j-1) % i <= (i - rad) && i % (j) >= (i - rad)) {
						System.out.print("0");
					} else {
						System.out.print("*");
					}
					k++;
				}
			}
			System.out.println();
		}
	}
}

//j >= rad - (i % rad) && j <= rad + (i%rad) 