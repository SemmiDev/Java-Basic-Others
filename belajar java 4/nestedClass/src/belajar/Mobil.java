package belajar;

public class Mobil {
    private int nomor;
    public  Mobil(int nomor){
        this.nomor = nomor;
    }

    // inner class
    private class Mesin{
        public void hidup(){
            System.out.println("mesin " + nomor + " hidup");
        }
    }
    // static class
    public static class Bensin{
        public void biaya(){
            System.out.println("biaya bensin, yaitu...");
        }
    }
    // method dalam class mobil
    public void mulai(){
        System.out.println("menyalakan  mobil nomor " + nomor);
        Mesin mesin = new Mesin();
        mesin.hidup();

        String merek = "BMW";
        // class lokal dalam method mulai
        class Data{
            // method local
            public void  tampilData(){
                System.out.println("nomor : " + nomor);
                System.out.println("merek : " + merek);
            }
        }

        Data data = new Data();
        data.tampilData();
    }
}
