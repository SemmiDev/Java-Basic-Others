package belajar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        // gunakan system.in untuk mengambil input dari keyboard
        InputStreamReader inputStream = new InputStreamReader(System.in);
        // baca text
        BufferedReader bufferedReader = new BufferedReader(inputStream);
        System.out.print("Masukkan nama kalian disini! ");
        String nama = bufferedReader.readLine();
        // simpan nilai input kedalam variable nama

        System.out.printf("Nama kamu adalah %s", nama);
    }
}
