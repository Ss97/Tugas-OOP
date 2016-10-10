package perbankan;

public class PengambilanUang extends Tabungan {
	private int proteksi;

	public PengambilanUang(int saldo){
		super (saldo);
	}

	public PengambilanUang(int saldo, int proteksi){
		super (saldo);
		this.proteksi = proteksi;
	}

	public int getSaldo(){
		return super.getSaldo();
	}

	public boolean ambilUang(int jumlah){
		int temp = 0;
		if (this.getSaldo() - jumlah <= this.proteksi){
			return false;
		}
		else {
			temp = this.getSaldo() - jumlah;
			super.saldo = temp;
			return true;
		}
	}
}