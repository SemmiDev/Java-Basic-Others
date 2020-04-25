package Belajar;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("document.txt");
        // cara pertama

//        BufferedReader bufferedReader = null;
//
//        try {
//                FileReader fileReader = new FileReader(file);
//                bufferedReader = new BufferedReader(fileReader);
//
//                String line;
//                while ((line = bufferedReader.readLine()) != null) {
//                    System.out.println(line);
//                }
//            } catch (FileNotFoundException e) {
//                System.out.println("File Tidak Ditemukan! " + file.toString());
//            } catch (IOException e) {
//            System.out.println("File tidak bisa dibaca " + file.toString());
//            }
//
//            bufferedReader.close();

        // cara kedua
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file))){
            String line;
            while((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
        }catch (FileNotFoundException e){
            System.out.printf("File %s , tidak ditemukan",file.toString());
        }catch (IOException e){
            System.out.printf("File %s , tidak bisa dibaca",file.toString());
        }
    }
}
