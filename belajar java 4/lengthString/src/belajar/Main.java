package belajar;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String nama1,nama2,nama3,nama4,nama5,nama6,nama7;
        Scanner nameInput = new Scanner(System.in);
        nama1 = nameInput.nextLine();
        nama2 = nameInput.nextLine();
        nama3 = nameInput.nextLine();
        nama4 = nameInput.nextLine();
        nama5 = nameInput.nextLine();
        nama6 = nameInput.nextLine();
        nama7 = nameInput.nextLine();

        System.out.println("panjang nama " + nama1 + ": " +  nama1.length());
        System.out.println("panjang nama " + nama2 + ": " +  nama2.length());
        System.out.println("panjang nama " + nama3 + ": " +  nama3.length());
        System.out.println("panjang nama " + nama4 + ": " +  nama4.length());
        System.out.println("panjang nama " + nama5 + ": " +  nama5.length());
        System.out.println("panjang nama " + nama6 + ": " +  nama6.length());
        System.out.println("panjang nama " + nama7 + ": " +  nama7.length());

        int jumlah = nama1.length() + nama1.length() + nama1.length() + nama1.length() + nama1.length() + nama1.length() + nama1.length();

        System.out.println("Jumlah semua karakter nama : " + jumlah);


    }
}
