public class Latihan6{
        public static void main (String[] args){

            char c = 'a';
            byte b = 12;
            short s = 32767;
            int i = 2147483647;
            long l = 72036854775807L;
            float f = 3.324243532f;
            double d = 3.23442323445242;

            System.out.println("Author : 140810150014 Dwiki Nurkurniawan Satya Putra");
            System.out.println("Default value char = "+c);
            System.out.println("Default value byte = "+b);
            System.out.println("Default value short = "+s);
            System.out.println("Default value int = "+i);
            System.out.println("Default value long = "+l);
            System.out.println("Default value float = "+f);
            System.out.println("Default value double = "+d);

            d = f;
            f = l;
            l = i;
            i = s;
            s = b;
            //c = i;

            System.out.println("\nSetelah Promotion : ");

            System.out.println("\nDefault value c(int)      = "+c);
            System.out.println("Default value b(short)    = "+b);
            System.out.println("Default value s(byte)     = "+s);
            System.out.println("Default value i(short)    = "+i);
            System.out.println("Default value l(int)     = "+l);
            System.out.println("Default value f(long)    = "+f);
            System.out.println("Default value d(float)   = "+d);
      }
}