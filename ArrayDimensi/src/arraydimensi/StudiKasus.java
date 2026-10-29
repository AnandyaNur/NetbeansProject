
package arraydimensi;

public class StudiKasus {
    
    public static void main(String[] args) {
        
       String [][][] dataMahasiswa = new String[3][3][5];
        String[][][] data = {
           
            {
                {"Andi", "Budi", "Caca", "Dodi", "Eko"},
                {"Fani", "Rahma", "Hadi", "Puspa", "Joko"},
                {"Amelia", "Andini", "Lala", "Maya", "Eko"}
            },
        {
            {"Nino", "Oky", "Anita", "Nita", "Nia"},
            {"Melati", "Bunga", "Ida", "Nissa", "Ardha"},
            {"Pasha", "Ryan", "Eka", "Dewi", "Lia"}
        },
        {
            {"Diana", "Togar", "Bety", "Ika", "Nasya"},
            {"Daren", "Hilmi", "Ridha", "Zahra", "Nabila"},
            {"Demian", "Riska", "Wulan", "Rendra", "Elva"}
        }
    };
    for (int i = 0; i < 3; i++){
    System.out.println("Prodi" +(i+1));
    for (int j = 0; j < 3; j++){
         System.out.print("Kelas" +(j+1)+ " ");
     for (int k = 0; k < 5; k++){           
                System.out.print(data[i][j][k] + " ");
     }
        System.out.println();
                
    }
        }
            }
                }