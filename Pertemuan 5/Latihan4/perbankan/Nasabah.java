package perbankan;

public class Nasabah {
	private String namaAwal;
	private String namaAkhir;
	private Tabungan tabungan;

	public Nasabah(String namaAwal, String namaAkhir) {
		this.namaAwal = namaAwal;
		this.namaAkhir = namaAkhir;
	}

	public void setTabungan(Tabungan tabungan) {
		this.tabungan = tabungan;
	}
	public Tabungan getTabungan() {
		return this.tabungan;
	}

	public void setNamaAwal(String namaAwal) {
		this.namaAwal = namaAwal;
	}
	public String getNamaAwal() {
		return this.namaAwal;
	}

	public void setNamaAkhir(String namaAkhir) {
		this.namaAkhir = namaAkhir;
	}
	public String getNamaAkhir() {
		return this.namaAkhir;
	}
}