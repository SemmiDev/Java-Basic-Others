package belajar;

public class Main {
    Hari hari;

    Main(Hari hari){
        this.hari = hari;
    }

    
    public enum Hari{
        SENIN,SELASA,RABU,KAMIS,JUMAT,SABTU,MINGGU
    }

    public void showDay(){
        switch (hari) {
            case SENIN:
                System.out.println("Hari senin");
                break;
            case SELASA:
                System.out.println("Hari selasa");
                break;
            case RABU:
                System.out.println("Hari rabu");
                break;
            case KAMIS:
                System.out.println("Hari kamis");
                break;
            case JUMAT:
                System.out.println("Hari jum'at");
                break;
            case SABTU:
                System.out.println("Hari sabtu");
                break;
            case MINGGU:
                System.out.println("Hari minggu");
                break;
        }
    }

    public static void main(String[] args) {
        Main a = new Main(Hari.RABU);
        a.showDay();

        Main b = new Main(Hari.SENIN);
        b.showDay();

    }
}
