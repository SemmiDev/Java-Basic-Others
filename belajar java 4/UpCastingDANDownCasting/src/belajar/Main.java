package belajar;

import javax.swing.text.Position;

class Binatang{
    void makan(){
        System.out.println("Bianatan makan ...");
    }
}

class Kucing extends Binatang{
    @Override
    void makan() {
        System.out.println("Kucing makan Ikan");
    }

    void suara(){
        System.out.println("Suara kucing, meong meong meong");
    }
}

public class Main {

    public static void main(String[] args) {
        Binatang binatang1 = new Binatang();
        Kucing kucing1 = new Kucing();

        binatang1.makan();
        kucing1.makan();
        kucing1.suara();

        // upcasting // koversi ke super class
        Binatang binatang2 = kucing1;
        binatang2.makan();
        // akan error jika menggunakan binatang2.suara();

        // downcasting // konversi ke child class
        Kucing kucing2 = (Kucing) binatang2;
        kucing2.makan();
        kucing2.suara();

    // akan error
//        Binatang binatang3 = new Binatang();
//        Kucing kucing3 = new Kucing();
//        kucing3 = (Kucing) binatang3;
//
//        kucing3.makan();
//        kucing3.suara();

        Kucing kucing3 = new Kucing();
        Binatang binatang3 = kucing3;
        binatang3.makan();


    }
}
