class Base {
	Base(int i) {
		System.out.println("base constructor");
	}
	Base() {

	}
}

public class Sup extends Base {
	public static void main(String[] args) {
		Sup s = new Sup();

		//baris1
	}

	Sup() {
		super(2);
	}

	public void derived() {
		//baris 3
	}


}