
package arraydimensi;

public class HapusSpasi {

    public static void main(String[] args) {
        String kalimat = "Ini adalah contoh kalimat";
        StringBuilder sb = new StringBuilder(kalimat);

        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == ' ') {
                sb.deleteCharAt(i);
                i--; 
            }
        }
        
        System.out.println("Tanpa spasi: " + sb.toString());
    }
}
