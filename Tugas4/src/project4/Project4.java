
package project4;
import java.util.Scanner;

public class Project4 {

   
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int angka;
        do{
            System.out.print("Masukan angka (0 untuk keluar):");
            angka = input.nextInt();
            
            if (angka == 0){
                System.out.print("Thank You Program  Kaluar:");
            }else if (angka % 2 ==0){
            System.out.println("Angka genap");
        }else {
                System.out.println("Angka Ganjil");
                }
        }while (angka !=0);
    }
    
}
