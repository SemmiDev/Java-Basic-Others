package belajar2;

public enum Binatang {
    Anjing("Alexy"),Kucing("Empus"),Ikan("Koi");

    private String nama;

    Binatang(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public String toString(){
        return "bintang ini bernama : " + nama;
    }
}
