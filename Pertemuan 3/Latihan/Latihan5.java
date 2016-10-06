public class Latihan5 {
	public static void main(String[] args) {
		System.out.println("Author : 140810150014 Dwiki Nurkurniawan Satya Putra");
		Latihan5 c = new Latihan5();
		String s = new String("ello");
		c.amethod(s);
	}
	public void amethod(String s) {
		char c = 'H';
		c += s;
		System.out.println(c);
	}
}