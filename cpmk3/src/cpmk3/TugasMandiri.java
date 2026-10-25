
package cpmk3;

import java.util.Scanner;

public class TugasMandiri {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        int pilihan, pertambahan, pengurangan, perkalian;
        double pembagian;
        
        pertambahan = 1;
        pengurangan = 2;
        pembagian = 3;
        
        System.out.println ("Andi ingin belajar apa hari ini?");
        System.out.println ("1.pertambahan  2.pengurangan  3.pembagian");
        
        pilihan = input.nextInt ();
        
        if (pilihan==1)
        {System.out.println ("Andi belajar pertambahan");
        }
        else if (pilihan==2)
        {System.out.println ("Andi belajar pengurangan");
        }
        else if (pilihan==3)
        {System.out.println ("Andi belajar pembagian");
        }
        else
        {System.out.println ("Andi belajar perkalian");
        }
    }
}
