import java.util.Scanner;

public class Tugas4{
	public static void main(String [] argh){
		System.out.println("Author : 140810150014 Dwiki Nurkurniawan Satya Putra");
		Scanner nilai = new Scanner(System.in);
		int awaljam,awalmenit,akhirjam,akhirmenit;
		System.out.println("Menghitung durasi waktu(Menit)\n");
		System.out.print("Insert Awal Jam : ");
		awaljam = nilai.nextInt();
		System.out.print("Insert Awal Menit : ");
		awalmenit = nilai.nextInt();
		System.out.print("Insert Akhir Jam : ");
		akhirjam = nilai.nextInt();
		System.out.print("Insert Akhir Menit : ");
		akhirmenit = nilai.nextInt();
		
		// penyederhanaan nilai
		double menit_terakhir=60+akhirmenit;
		double durasi_menit=menit_terakhir-awalmenit;
		double jam_terakhir=akhirjam-1;
		double durasi_jam=jam_terakhir-awaljam;
		double total=(durasi_jam*60)+durasi_menit;
		System.out.print("Durasi waktu antara pukul "+awaljam+"."+awalmenit+" s/d pukul "+akhirjam+"."+akhirmenit+" adalah "+total+" menit");
	}
 }