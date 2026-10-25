
package subcpmk12;

import java.util.Scanner;
    
public class case1perhitunganzakat {
    
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan total harta: ");
        double harta = input.nextDouble();
        
        System.out.print("Masukkan nilai nisab: ");
        double nisab = input.nextDouble();
        
        if (harta >= nisab) {
            double zakat = harta * 0.025;
            System.out.println("Zakat = " + zakat);
        } else {
            System.out.println("Harta belum mencapai nisab.");
        }
    }
}
