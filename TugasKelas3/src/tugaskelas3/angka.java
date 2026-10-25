
package tugaskelas3;

import java.util.Scanner;

public class angka {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("masukkan nilai anda");
        int nilai = input.nextInt();
        
        if(nilai>=91 && nilai<100){
            System.out.println("nilai anda adalah A");
            
        }else if(nilai>=86 && nilai<91){
            System.out.println("nilai anda adalah A-");
      
        }else if(nilai>=81 && nilai<86){
            System.out.println("nilai anda adalah B+");
            
        }else if (nilai>=76 && nilai<81){
            System.out.println("nilai anda adalah B");
            
        }else if (nilai>=71 && nilai<76){
            System.out.println("nilai anda adalah B-");
            
        }else if (nilai>=66 && nilai<71){
            System.out.println ("nilai anda adalah C");
            
        }else if (nilai>=61 && nilai<66){
            System.out.println ("nilai anda adalah C-");
            
        }else if (nilai>=56 && nilai<61){
            System.out.println ("nilai anda adalah D");
            
        }else if (nilai>=0 && nilai<56){
            System.out.println ("nilai anda adalah E");
        }
    }
}
