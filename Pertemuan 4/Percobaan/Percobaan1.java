public class Siswa { int nrp;
public void setNrp(int i) { nrp=i;
}
}
public class Percobaan1 {
public static void main(String args[]) {
	System.out.println("Author : Dwiki Nurkurniawan Satya Putra");
 Siswa anak=new Siswa(); anak.setNrp(5); System.out.println(anak.nrp);
}
}