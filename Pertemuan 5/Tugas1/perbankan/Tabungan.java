package perbankan;

public class Tabungan {
	public int saldo;

	public Tabungan(int saldo) {
		this.saldo = saldo;
	}

	public int getSaldo() {
		return this.saldo;
	}

	/*public void simpanUang(int jumlah) {
		this.saldo += jumlah;
	}

	public boolean ambilUang(int jumlah) {
		if (this.saldo - jumlah > 0) {
			this.saldo -= jumlah;
			return true;
		} else {
			return false;
		}
	}*/
}