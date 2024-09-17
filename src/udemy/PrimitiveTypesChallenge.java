package udemy;

public class PrimitiveTypesChallenge {
    public static void main(String[] args) {
        byte b = 127;
        short s = 32767;
        int i = 2147483;
        // TODO soma dos 3
        long l = 50000L + 10L * (b + s + i) ;
        System.out.println(l);
    }
}
