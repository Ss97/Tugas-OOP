import javax.swing.JOptionPane;

public class Tugas2 {
	public static void main (String[] args){
		System.out.println("Author : 140810150014 Dwiki Nurkurniawan Satya Putra");

		double celcius, fahrenheit;

		fahrenheit = Double.parseDouble(JOptionPane.showInputDialog("Masukkan suhu (F)"));
		celcius = (5.0/9.0)*(fahrenheit -32.0);
		System.out.println ("Nilai celcius : "+celcius);

		celcius = Double.parseDouble(JOptionPane.showInputDialog("Masukkan suhu(C)"));
		fahrenheit = (9.0/5.0)*(celcius +32.0);
		System.out.println ("Nilai fahrenheit : "+fahrenheit);
	}
}