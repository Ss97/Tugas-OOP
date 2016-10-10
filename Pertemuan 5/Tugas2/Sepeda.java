public class Sepeda extends Kendaraan {
	protected int jmlSadel;
	protected int jmlGir;

	public void setJmlSadel(String jmlSadel) {
		this.jmlSadel = Integer.parseInt(jmlSadel);
	}

	public String getJmlSadel() {
		return this.jmlSadel;
	}

	public void setJmlGir(String jmlGir) {
		this.jmlGir = jmlGir;
	}

	public int getJmlGir() {
		return this.jmlGir
	}
}