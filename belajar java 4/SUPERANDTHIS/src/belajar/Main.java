package belajar;

public class Main {
    String nama;
    int umur;

    Main(){
        // memangil constructor Main
        this("Sam",19);
    }

    Main(String nama, int umur){
        this.nama = nama;
        this.umur = umur;

        System.out.println("Nama : " + this.nama + ", Umur : " + this.umur);
    }


    public static void main(String[] args) {
        new Main();
    }
}
