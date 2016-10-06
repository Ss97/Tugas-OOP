import javax.swing.JOptionPane;
public class Diamond {
	public static void main(String[] args) {
		System.out.println("Author : 140810150014 Dwiki Nurkurniawan Satya Putra");
		int n = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jari-jari"));

		for (int i = 1; i <= (2*n-1); i += 2) {
			for (int j = 0; j < (n-1) - i / 2; j++)
			System.out.print("0"); 

			for (int j = 0; j < i; j++)
			System.out.print("*");

			for (int j = 0; j < (n-1) - i / 2; j++)
			System.out.print("0"); 

			System.out.print("\n");
		}

		for (int i = (2*n-3); i >= 1; i -= 2) {
			for (int j = 0; j < (n-1) - i / 2; j++)
			System.out.print("0");

			for (int j = 0; j < i; j++)
				System.out.print("*");

			for (int j = 0; j < (n-1) - i / 2; j++)
				System.out.print("0");
				System.out.print("\n");
		}
	}
}