public class Percobaan5{
	public static void main(String args[]){
		System.out.println("Author : 140810150014 Dwiki Nurkurniawan Satya Putra");
		int[] array1 = {7, 4, 8, 1, 4, 1, 4 };
		int[] array2 = new int[3];
		System.arraycopy(array1,0,array2,0,3);
		
		System.out.print("Array1 : ");
		
		for(int i=0; i<array1.length; i++)
			System.out.print(array1[i] + " ");
		System.out.println();
		
		System.out.print("Array2 : ");
		
		for(int i=0;i<array2.length;i++)
			System.out.print(array2[i] + " ");
	}
}