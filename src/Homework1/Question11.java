package Homework1;

public class Question11 {
    public static void main(String[] args){
        int a = 5;
        int b = 8;
        int c = 12;

        boolean top = (a + b + c) == 25;
        boolean buyuk = (a + b) > c;
        boolean kucuk = (a * a) < b;
        boolean ortancaDeger = (b > a && b < c) || (b > c && b < a);
        boolean topKucuk = c < (a + b);

        System.out.println("a, b ve c'nin toplamı 25'e eşit mi? " + top);
        System.out.println("a ve b'nin toplamı c'den büyük mü? " + buyuk);
        System.out.println("a'nın karesi b'den küçük mü? " + kucuk);
        System.out.println("b, a ve c arasında ortanca değer mi? " + ortancaDeger);
        System.out.println("c, a ve b'nin toplamından küçük mü? " + topKucuk);

    }
}
