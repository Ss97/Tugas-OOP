import javax.swing.JOptionPane;

public class Latihan5 {
	public static void main(String[] args) {
		System.out.println("Author : 140810150014 Dwiki Nurkurniawan Satya Putra");
		String input = JOptionPane.showInputDialog("Masukkan Satu kata");

		System.out.print("Kebalikan \"" + input + "\" adalah \"");
		for (int i = input.length() - 1; i >= 0; i--) {
			System.out.print(input.charAt(i));
		}

		System.out.print("\"");
	}
}