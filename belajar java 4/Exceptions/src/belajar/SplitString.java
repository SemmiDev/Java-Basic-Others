package belajar;

public class SplitString {
    public static void main(String[] args) {
        String kalimat = "Selamat Datang di wildantechnoart.net";

        boolean cekAwal = kalimat.startsWith("Selamat");
        boolean cekAkhir = kalimat.endsWith("net");

        if((cekAwal && cekAkhir == true)){
        	System.out.println("Hello sam, " + kalimat);
        }
    }
}
