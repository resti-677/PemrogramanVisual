
package project5;
import java.util.Scanner;

public class Project5 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        boolean lanjut = true;

        while (lanjut) {
            int jumlah = 0;
            int jumlahAngka = 0;

            System.out.println("Masukkan serangkaian angka (0 untuk menghitung rata-rata):");

            while (true) {
                try {
                    int angka = Integer.parseInt(input.nextLine());

                    if (angka == 0) {
                        break;
                    }

                    jumlah += angka;
                    jumlahAngka++;
                } catch (NumberFormatException e) {
                    System.out.println("Input tidak ada. Masukkan angka.");
                }
            }

            if (jumlahAngka > 0) {
                double rataRata = (double) jumlah / jumlahAngka;
                System.out.println("Rata-rata angka adalah: " + rataRata);
            } else {
                System.out.println("Tidak ada nilai atau angka yang dimasukkan.");
            }

            System.out.print("Apakah Anda ingin menghitung rata-rata lagi? (yes/no): ");
            String jawaban = input.nextLine().toLowerCase();

            if (!jawaban.equals("ya")) {
                lanjut = false;
            }
        }

        System.out.println("Thank You. Program berhenti.");
    }
    
}
