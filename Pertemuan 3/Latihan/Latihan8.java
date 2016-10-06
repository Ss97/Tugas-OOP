public class Latihan8 {
    public static void main(String[] args) {
        System.out.println("Author : Dwiki Nurkurniawan Satya Putra 140810150014");
        Latihan8 e = new Latihan8();
    }
    Latihan8(){
        String s = "Java";
        String s2 = "java";
        if(s.equalsIgnoreCase(s2)){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not equal");
        }
    }
    
}
