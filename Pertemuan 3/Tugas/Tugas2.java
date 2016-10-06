public class Tugas2 {
	public static void main(String[] args) {
		System.out.println("Author : Dwiki Nurkurniawan Satya Putra 140810150014");
		char[] matKul = {
			'p', 'e', 'm', 'r', 'o', 'g', 'r', 'a', 'm', 'a', 'n', 'b', 'e', 'r', 'b', 'a', 's', 'i', 's', 'o', 'b', 'y', 'e', 'k'
		};
		int count = 0;
		for (byte i = 0; i < matKul.length; i++) {
			if (matKul[i] == 'a') {
				count++;
			}
		}

		System.out.println("a = " + count);
	}
}