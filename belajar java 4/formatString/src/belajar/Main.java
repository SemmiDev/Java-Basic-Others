package belajar;

public class Main {

    public static void main(String[] args) {
        // contoh 1
	    String name = "Sammi Aldhiyanto";
	    String show = String.format("Nama saya adalah : %s",name);
        System.out.println(show);

        // contoh 2
        String name2 = "Ayatullah Ramadhan";
        String show2 = String.format("Nama saya adalah : %20s", name2); // jika tidak cukup karakternya maka akan disipkan ke awal
        String show3 = String.format("Nama saya adalah : %-20s", name2); // jika tidak cukup karakter nya maka akan disipkan ke bagian ujung

        System.out.println(show2);
        System.out.println(show3);

        // contoh 3
        int tahun = 2020;
        String name3 = String.format("Facebok dibuat pada tahun %d",tahun);
        String name4 = String.format("Facebok dibuat pada tahun %20d",tahun); // membuat batas karakter yaitu 20 buah
        String name5 = String.format("Facebok dibuat pada tahun %020d",tahun); // isi karakter yang kosong dengan angka 0
        System.out.println(name3);
        System.out.println(name4);
        System.out.println(name5);

        // contoh 4
        String nilai1 = String.format("Angka 1 : %f",7.50);
        String nilai2 = String.format("angka 2 : %.2f",7.50);
        String nilai3 = String.format("Angka 3 : %10.2f",7.50);
        System.out.println(nilai1);
        System.out.println(nilai2);
        System.out.println(nilai3);
    }
}
