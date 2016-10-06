import javax.swing.JOptionPane;

public class Latihan2 {
	public static void main(String[] args) {
		System.out.println("Author : 140810150014 Dwiki Nurkurniawan Satya Putra");
		int input = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah deretan Fibonacci"));
		System.out.print("0 ");
		for (byte i = 0; i < input - 1; i++) {
			System.out.print(fibo(i + 1) + " ");
		}
	}

	public static int fibo(int n) {
		if(n <= 2){
            return 1;
        }

		return fibo(n-1) + fibo(n -2);
	}
}