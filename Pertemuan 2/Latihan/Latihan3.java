import javax.swing.JOptionPane;

public class Latihan3 {
	public static void main(String[] args) {
		System.out.println("Author : 140810150014 Dwiki Nurkurniawan Satya Putra");
		int input = Integer.parseInt(JOptionPane.showInputDialog("Masukkan angka"));
		for (byte i = 1; i <= input; i++) {
			System.out.print(fibo(i) + " ");
		}
	}

	public static int fibo(int n) {
		if(n == 1 || n == 2){
            return 1;
        }

		return fibo(n-1) + fibo(n -2);
	}
}