package belajar2;
public class Cinta {
    private String namaKamu;
    private String namaPasangan;

    public Cinta(String name, String namaPasangan){
        this.namaKamu = name;
        this.namaPasangan = namaPasangan;
    }
    private class Status{
        public void status(){
            System.out.println("Status cinta " + namaKamu + " ke " + namaPasangan + " adalah : null ");
        }
    }
    public static class Berjuang{
        public void berjuang(){
            System.out.println("Ayoo!! terus berjuang");
        }
    }
    public void mulai(){
        System.out.println("Menyalakan gelora cinta " + namaKamu + " ke " + namaPasangan);
        System.out.println("Selamat berjuang, Walaupun");
        Status a = new Status();
        a.status();

        String since = "20 Oktober 2001";
        class Data{
            public void tampilData(){
                System.out.println("Namamu : " + namaKamu);
                System.out.println("Mencintai sejak : " + since);
            }
        }
        Data data = new Data();
        data.tampilData();
    }
}
