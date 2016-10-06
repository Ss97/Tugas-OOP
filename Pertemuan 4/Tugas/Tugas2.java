public class Tugas2 {
	public static void main(String[] args) {
		TesMobil tes = new TesMobil();
		tes.mobil1.infoMobil();
		tes.mobil2.infoMobil();
		tes.mobil3.infoMobil();
		tes.mobil4.infoMobil();
	}
}

class TesMobil {
	Mobil mobil1;
	Mobil mobil2;
	Mobil mobil3;
	Mobil mobil4;
	TesMobil() {
		mobil1 = new Mobil("Toyota", "Biru", "Minibus", 2000, 7);
		mobil2 = new Mobil("Daihatsu", "Hitam", "Pick Up", 1500, 2);
		mobil3 = new Mobil("Suzuki", "Silver", "SUV", 1800, 5);
		mobil4 = new Mobil("Honda", "Merah", "Sedan", 1300, 5);
	}
}

class Mobil {
	private String merk;
	private String color;
	private String type;
	private int weight;
	private int jumlahKursi;

	Mobil(String merk, String color, String type, int weight, int jumlahKursi) {
		this.merk = merk;
		this.color = color;
		this.type = type;
		this.weight = weight;
		this.jumlahKursi = jumlahKursi;
	}

	public String getMerk() {
		return merk;
	}
	public String getColor() {
		return color;
	}
	public String getType() {
		return type;
	}
	public int getWeight() {
		return weight;
	}
	public int getJumlahKursi() {
		return jumlahKursi;
	}
	public void infoMobil() {
		System.out.println("Merk : " + getMerk());
		System.out.println("Color : " + getColor());
		System.out.println("Type : " + getType());
		System.out.println("Weight : " + getWeight());
		System.out.println("Seats : " + getJumlahKursi());
	}
}