
package project3;
import java.util.Scanner;

public class Project3 {

  
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan Angka Kesatu:");
        int angka1 = input.nextInt();
        
        System.out.print("Masukan Angka Kedua:");
        int angka2 = input.nextInt();
        
        int hasilPenjumlahan = angka1 + angka2;
        int hasilPengurangan = angka1 - angka2;
        int hasilPerkalian = angka1 * angka2;
        double hasilPembagian = 0.0;
        if (angka2 != 0){
            hasilPembagian = (double) angka1/angka2;
        }else{
            System.out.println("Tidak bisa melakukan pembagian karena angka kedua nol.");
        }
        System.out.println("Hasil penjumlan:" + hasilPenjumlahan);
        System.out.println("Hasil pengurangan:" + hasilPengurangan);
        System.out.println("Hasil perkalian:" + hasilPerkalian);
        
        if (angka2 !=0){
            System.out.println("Hasil pembagian:" + hasilPembagian);
        }
    }
    
}
