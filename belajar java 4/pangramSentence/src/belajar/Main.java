package belajar;


public class Main {

    public static void main(String[] args) {
	    String kalimat = "the quick brown fox jumps over the lazy dog";
	    // tampilka output hasil
        System.out.println("Apakah kalimat tersebut pangram ? : " + isPangramSentence(kalimat.toLowerCase()));
    }
    private static boolean isPangramSentence(String kalimat){
        if(kalimat.length() < 26){
            return false;
        }else{
            for(char ch = 'a'; ch <= 'z'; ch++){
                if(kalimat.indexOf(ch) < 0){
                    return false;
                }
            }
        }
        return true;
    }
}
