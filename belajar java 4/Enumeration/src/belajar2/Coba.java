public class Coba {
		
		public enum Status {
			GANTENG,TIDAK_GANTENG
		}

		public static String name;

		public static void setName(String name){
			name = name;
		}

		static void statusMukaKamu(){
			if(name.equalsIgnoreCase("SAMMI")){
				System.out.println(Status.GANTENG);
			}else{
				System.out.println(Status.TIDAK_GANTENG);
			}
		}

	public static void main(String[] args) {
			name = "SAMMI";
			statusMukaKamu();
	}
}