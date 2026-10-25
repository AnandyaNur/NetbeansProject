
package perulangan;
import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka;
        do {
            System.out.print("Masukkan angka (0 untuk berhenti): ");
            angka = input.nextInt();
            System.out.println("Anda memasukkan: " + angka);
        } while (angka != 0);
        System.out.println("Program selesai.");
    }
}
