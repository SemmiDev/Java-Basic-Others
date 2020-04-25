package belajar2;

public class Anak extends  DataDiri{

    Anak(){
        // menjalankan constructor  milik si DataDiri , constructor akan dipanggil
        super();

        String name = "Dev";
        int umur = 18;

        // menjalankan constructor Anak
        System.out.println("Nama : " + name + ", Umur : " + umur + ", Hobby : ");

    }
}
