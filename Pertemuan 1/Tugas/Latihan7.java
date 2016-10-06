import java.util.Scanner;
public class Latihan7 {
    
    public static void main(String[] args) {
        System.out.println("Author : Dwiki Nurkurniawan Satya Putra 140810150014");
        Latihan7 konversi = new Latihan7();
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai desimal = ");
        int x = input.nextInt();
        System.out.println("Susunan bit dari "+x+" adalah = "+konversi.Konversi(x));
    }

    public String Konversi(int i){
        StringBuilder b = new StringBuilder();
        for(int x = 31; x>=0; x--){
            b.append((i & (1 << x)) >>> x);
        }
        return b.toString();
    }
}