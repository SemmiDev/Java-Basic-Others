package belajar2;

public class App {
    public static void main(String[] args) {
        Binatang binatang = Binatang.Anjing;
        switch(binatang){
            case Ikan:
                System.out.println("Ini Ikan");
                break;
            case Anjing:
                System.out.println("Ini Anjing");
                break;
            case Kucing:
                System.out.println("Ini kucing");
                break;
        }

        System.out.println(Binatang.Anjing);
        System.out.println(Binatang.Anjing.getNama());
        System.out.println("Nama variable di class enum : " + Binatang.Anjing.name());

        Binatang binatang1 = Binatang.Anjing;
        System.out.println(binatang1);
    }
}
