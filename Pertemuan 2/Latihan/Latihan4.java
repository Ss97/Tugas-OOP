public class Latihan4 {
	public static void main(String[] args) {
		System.out.println("Author : 140810150014 Dwiki Nurkurniawan Satya Putra");
		for (byte i = 1; i <= 20; i++) {
			if (i % 3 == 0) {
				continue;
			} else if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}
	}
}