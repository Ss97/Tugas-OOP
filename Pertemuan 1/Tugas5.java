public class Tugas5 {

    public static void main(String[] args) {
        System.out.println("Author : 140810150014 Dwiki Nurkurniawan Satya Putra");
        Tugas5 konversi = new Tugas5();
        int x = -19;
        System.out.println("Reprentasi bit dari nilai "+x+" adalah = "+konversi.Konversi(x));
    }

    public String Konversi(int i){
        StringBuilder b = new StringBuilder();
        for(int x = 31; x>=0; x--){
            b.append((i & (1 << x)) >>> x);
        }
        return b.toString();
    }
}