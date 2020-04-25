package belajar;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main implements Runnable{

    public static void main(String[] args) throws InterruptedException {
        // inisiasi objek baru
        // hitungan 3,2,1
        CountDownLatch latch = new CountDownLatch(3);

        // max thread yg digunakan
        ExecutorService service = Executors.newFixedThreadPool(3);
        for(int i = 0; i < 3; i++){
            service.submit(new Main(latch));
        }

        // block main thread sementara
        // sampai latch 0
        latch.await();

        // output terakhir
        System.out.println("Selesai ....");
    }
    private CountDownLatch latch;

    // mengembalikan nilai untuk var ref
    public Main(CountDownLatch latch){
        this.latch = latch;
    }
    @Override
    public void run() {
        // run task
        System.out.println("START ...");

        // thread sleep jeda 3 detik
        try{
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // decrement latch
        // melepas semua thread yg menunggu , jika angka capai 0
        latch.countDown();
    }
}
