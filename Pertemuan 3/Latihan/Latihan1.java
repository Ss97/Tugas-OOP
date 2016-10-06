import javax.swing.JOptionPane;

public class Latihan1 {
	public static void main(String[] args) {
		System.out.println("Author : 140810150014 Dwiki Nurkurniawan Satya Putra");
		int[] pbo = {81,50,89,77};
		int[] bd = {90,83,55,70};
		int[] rpl = {62,87,65,92};
		double[] rata = new double[4];

		System.out.println("NRP\t\tRata-rata");
		System.out.println("------------------------------------");
		for (byte i = 0; i < 4; i++) {
			rata[i] = (pbo[i] * 1.0 + bd[i] + rpl[i]) / 3;
			System.out.println((i+1) + "\t\t" + rata[i]);
		}
	}
}