package belajar;

public class Main {

    public static void main(String[] args) {
        Mobil a = new Mobil(7);
        a.mulai();

        // panggil method static
        Mobil.Bensin bensin = new Mobil.Bensin();
        bensin.biaya();
    }
}
