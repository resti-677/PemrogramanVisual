
package project2;
import java.util.Scanner;


public class Project2 {

   
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukan Nama Anda :");
        String nama = input.nextLine();
        
        System.out.print("Masukan Usia Anda :");
        int usia = input.nextInt();
        
        System.out.print("Masukan Tinggi Badan Anda (cm) :");
        double tinggiBadan = input.nextDouble();
        
        System.out.println("Nama: " + nama);
        System.out.println("Usia: " + usia + " tahun");
        System.out.println("Tinggi Badan: " + tinggiBadan + " cm");
        
        
        
        
    }
    
}
