
package arraydimensi;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.println("=====================================");
        System.out.println("          Pengecek Anagram           ");
        System.out.println("=====================================");

        System.out.print("Masukkan kata pertama: ");
        String kata1 = input.nextLine();

        System.out.print("Masukkan kata kedua  : ");
        String kata2 = input.nextLine();

        // Menghilangkan semua spasi dan mengubah jadi huruf kecil
        String kataBersih1 = kata1.replaceAll("\\s+", "").toLowerCase();
        String kataBersih2 = kata2.replaceAll("\\s+", "").toLowerCase();

        boolean apakahAnagram = false;

        if (kataBersih1.length() == kataBersih2.length()) {
            char[] arrayChar1 = kataBersih1.toCharArray();
            char[] arrayChar2 = kataBersih2.toCharArray();

            Arrays.sort(arrayChar1);
            Arrays.sort(arrayChar2);

            apakahAnagram = Arrays.equals(arrayChar1, arrayChar2);
        }
        
        if (apakahAnagram) {
            System.out.println("Hasil: \"" + kata1 + "\" dan \"" + kata2 + "\" adalah ANAGRAM!");
        } else {
            System.out.println("Hasil: \"" + kata1 + "\" dan \"" + kata2 + "\" BUKAN anagram.");
        }
        
        input.close();
    }
}
