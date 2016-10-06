import javax.swing.JOptionPane;
import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		// System.out.println("Hello World!");
		
		// String name = JOptionPane.showInputDialog("Masukkan nama anda");


		Scanner userInput = new Scanner(System.in);
		System.out.println("Masukkan Nama Anda ");
		String name = userInput.next();
		System.out.println("Halo " + name);
	}
}