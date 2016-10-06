import javax.swing.JOptionPane;

public class Tugas3 {
	public static void main(String[] args) {
		
	}
}

class MultiTabungan {
	private int saldo;

	MultiTabungan(int saldo) {
		this.saldo = saldo;
	}

	public int getSaldo() {
		while (cur != "USD" || cur != "AUD" || cur != "IDR") {
			String cur = JOptionPane.showInputDialog("Satuan (USD, AUD, IDR)");
		}
		if (cur == "IDR") {
			return this.saldo;
		} else if (cur == "AUD") {
			return this.saldo / 10000;
		} else {
			return this.saldo / 9000;
		}
	}

	public void simpanUang(int jumlah) {
		while (cur != "USD" || cur != "AUD" || cur != "IDR") {
			String cur = JOptionPane.showInputDialog("Satuan (USD, AUD, IDR)");
		}
		if (cur == "IDR") {
			this.saldo += jumlah;
		} else if (cur == "AUD") {
			this.saldo += (jumlah * 10000);
		} else {
			this.saldo += (jumlah * 9000);
		}
	}

	public boolean ambilUang(int jumlah) {
		if (this.saldo - jumlah > 0) {
			this.saldo -= jumlah;
			return true;
		} else {
			return false;
		}
	}
}