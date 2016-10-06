public class Tugas1 {
	public static void main(String[] args) {
		System.out.println("Author : Dwiki Nurkurniawan Satya Putra 140810150014");
		int[][] arrayOfInts = {
			{32, 87, 3, 589}, {12, 1076, 2000, 8}, {622, 127, 77, 955}
		};
		for (byte i = 0; i < arrayOfInts.length; i++) {
			for (byte j = 0; j < arrayOfInts[0].length; j++) {
				if (arrayOfInts[i][j] == 12) {
					System.out.println(String.format("Found 12 at %s, %s", i, j));
					break;
				}
			}
		}
	}
}