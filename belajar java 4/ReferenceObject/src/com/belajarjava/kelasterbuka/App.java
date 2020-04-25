package com.belajarjava.kelasterbuka;

class Buku{
    String judul;
    String penulis;
    Buku(String judul, String penulis){
        this.judul = judul;
        this.penulis = penulis;
    }

    void display(){
        System.out.println("Judul \t: " + this.judul);
        System.out.println("Penulis \t: " + this.penulis);
    }
}

public class App {
    public static void main(String[] args) {
        Buku satu = new Buku("Belajar Java","Sammi Aldhi Yanto");
        satu.display();
        String addressBuku1 = Integer.toHexString(System.identityHashCode(satu));
        System.out.println("Alamat dari buku satu : " + addressBuku1);

        Buku tiga = new Buku("Belajar Java","Sammi Aldhi Yanto");
        satu.display();
        String addressBuku3 = Integer.toHexString(System.identityHashCode(tiga));
        System.out.println("Alamat dari buku tiga : " + addressBuku3);

        // objek dan alamat akan sama
        Buku dua = satu;
        dua.display();
        String addressBuku2 = Integer.toHexString(System.identityHashCode(dua));
        System.out.println("Alamat dari buku dua : " + addressBuku2);

        // ubah satu yg lain akan berubah juga
        satu.penulis = "Fauziah Ramadhani";
        satu.display();
        dua.display();

        if(Integer.toHexString(System.identityHashCode(dua)).equals("10f87f48")){
            System.out.println("BENAR ADA");
        }else{
            System.out.println("TIDAK ADA");
        }
    }
}
