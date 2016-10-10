package perbankan;

public class PenyimpananUang extends Tabungan {
	private double tingkatBunga;

	public PenyimpananUang(int saldo, double tingkatBunga) {
		super(saldo);
		this.tingkatBunga = tingkatBunga;
	}

	public double cekUang() {
		return super.getSaldo() + (this.tingkatBunga * super.getSaldo());
	}
}