package belajar;

public class Main3 {

    static void apaanNi() throws ClassNotFoundException{
        System.out.println("Ada Yang Error Ni!");
        throw new ClassNotFoundException("Udah Saya Tangkap");
    }

    public static void main(String[] args) {
       // Kata kunci throws adalah solusi Jika sebuah method dapat menyebabkan sebuah exception
       // namun tidak menangkapnya, sebuah method perlu untuk menangkap dan mendaftarkan exception yang mungkin terjadi.

        try{
            Main3.apaanNi();
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
