import javax.swing.JOptionPane;

public class Tugas3 {
	public static void main(String[] args) {
		System.out.println("Author : Dwiki Nurkurniawan Satya Putra 140810150014");
		String input = JOptionPane.showInputDialog("Kalimat");
		char search = JOptionPane.showInputDialog("Cari Karakter").charAt(0);
		System.out.println("Kalimat : " + input);
		System.out.println("Karakter dicari : " + search);
		for (byte i = 0; i < input.length(); i++) {
			if (input.charAt(i) == search) {
				System.out.println(String.format("Karakter %s terdapat pada index %d", search, i));
			}
		}
	}
}