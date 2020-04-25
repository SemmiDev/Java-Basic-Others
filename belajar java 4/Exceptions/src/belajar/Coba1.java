public class Coba1 {
	public static void main(String[] args) {
		// try{
			int[] angka = new int[5];
			Scanner input = new Scanner(System.in);
			System.out.print("Masukkan angka : ");
			
			for(int i = 0; i <= angka.length; i++){
				int input1 = input.nextInt();
				angka[i] = input1;
			}

			for(int i : angka){
				System.out.println(i);
			}
		// }
	}
}