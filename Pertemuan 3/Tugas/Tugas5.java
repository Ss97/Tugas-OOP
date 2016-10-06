import javax.swing.JOptionPane;

public class Tugas5 {
	public static void main(String[] args) {
		System.out.println("Author : Dwiki Nurkurniawan Satya Putra 140810150014");
		String in = JOptionPane.showInputDialog("String Masukan");
		System.out.println("String Masukan : " + in);
		in = in.toLowerCase();
		String last = in.substring(in.length() - 1);
		String first = in.substring(0, 1);
		in = in.replace(last, "\n");
		in = in.replace(first, last);
		in = in.replace("\n", first);
		in = in.toLowerCase();
		
		System.out.println(in);
	}
}