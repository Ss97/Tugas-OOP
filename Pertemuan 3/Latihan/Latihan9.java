public class Latihan9 {
    public static void main(String[] args) {
        System.out.println("Author : Dwiki Nurkurniawan Satya Putra 140810150014");
        String str = "Java";
        StringBuffer buffer = new StringBuffer(str);
        if(str.equals(buffer)){
            System.out.println("Both are equal");
        }
        else{
            System.out.println("Both are not equal");
        }
    }
    
}
