
package TugasPraktikum;
import java.util.Scanner;

public class Faktorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int n = input.nextInt();

        int f = 1;

        System.out.print(n + "! = ");

        for (int i = n; i >= 1; i--) {
            f = f * i;

            if (i > 1) {
                System.out.print(i + " x ");
            } else {
                System.out.print(i);
            }
        }

        System.out.println();
        System.out.println(n + "! = " + f);
    }
}