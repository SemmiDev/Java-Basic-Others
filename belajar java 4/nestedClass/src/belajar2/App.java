package belajar2;

import java.util.zip.CheckedInputStream;

public class App {
    public static void main(String[] args) {
        Cinta sam = new Cinta("Sammi Aldhiyanto","Fauziah Ramadhani");
        sam.mulai();
        Cinta.Berjuang berjuang = new Cinta.Berjuang();
        berjuang.berjuang();
    }
}
