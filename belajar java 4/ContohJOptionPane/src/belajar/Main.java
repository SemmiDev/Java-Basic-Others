package belajar;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
         opening();
         login();
    }

    static void opening(){
        JOptionPane.showMessageDialog(null, "Selamat datang admin silahakan anda login terlebih dahulu");
    }
    static void login() {
        final String dataUsername = "sammidev";
        final String dataPassword = "admin";

        String username = JOptionPane.showInputDialog(null, "Masukkan username anda : ");
        String password = JOptionPane.showInputDialog(null, "Masukkan passwod anda : ");

        boolean next = true;
            if (username.equalsIgnoreCase(dataUsername) && (password.equalsIgnoreCase(dataPassword))) {
                JOptionPane.showMessageDialog(null, "Selamat Datang Admin!", "ADMIN", JOptionPane.PLAIN_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Username dan Password anda salah", "LOGIN FAILED", JOptionPane.ERROR_MESSAGE);

                int question;
                question = JOptionPane.showConfirmDialog(null, "Apakah anda ingin ingin login kembali? ");
                if (question == 0) {
                    login();
                }else if(question == 1){
                    JOptionPane.showMessageDialog(null, "Terima kasih!", "TERIMA KASIH", JOptionPane.PLAIN_MESSAGE);
                }else if(question == 2){
                    System.exit(0);
                }
            }
        }
}
