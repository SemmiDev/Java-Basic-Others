package belajar;

public class Main {

    public static void main(String[] args) {
	    try{
	        int a = 10;
	        int hasil = a / 0;
            System.out.println(hasil);

            String[] siswa = new String[3];
            siswa[0] = "Sam";
            siswa[1] = "dev";
            siswa[3] = "coder";

            System.out.println(siswa[5]);

        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("data index ke 5 tidak ada");
        }catch (ArithmeticException ex2){
            System.out.println("Pembagi tidak boleh sama dengan nol");
        }finally {
	        // finally terseraj dibuat atau tidak
            System.out.println("program completed");
        }
    }
}
