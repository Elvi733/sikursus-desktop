package latihan;

import java.util.Scanner;

public class LatihanBidangDatar {
<<<<<<< HEAD

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Menampilkan Pilihan Menu
        System.out.println("=== MENU HITUNG BIDANG DATAR ===");
        System.out.println("1. Persegi Panjang");
        System.out.println("2. Lingkaran");
        System.out.print("Pilih jenis bidang datar (1/2): ");
        int pilihan = input.nextInt();

        System.out.println("--------------------------------");

        // Proses Logika Berdasarkan Pilihan
        if (pilihan == 1) {
            // Input Persegi Panjang
            System.out.print("Masukkan Panjang (cm): ");
            double panjang = input.nextDouble();
            System.out.print("Masukkan Lebar (cm)  : ");
            double lebar = input.nextDouble();

            // Rumus Persegi Panjang
            double luas = panjang * lebar;
            double keliling = 2 * (panjang + lebar);

            // Output Hasil
            System.out.println("\n========= HASIL REKAP =========");
            System.out.printf("Luas Persegi Panjang    : %.2f cm²%n", luas);
            System.out.printf("Keliling Persegi Panjang: %.2f cm%n", keliling);

        } else if (pilihan == 2) {
            // Input Lingkaran
            System.out.print("Masukkan Jari-jari (cm): ");
            double r = input.nextDouble();

            // Rumus Lingkaran
            double luas = Math.PI * r * r;
            double keliling = 2 * Math.PI * r;

            // Output Hasil
            System.out.println("\n========= HASIL REKAP =========");
            System.out.printf("Luas Lingkaran    : %.2f cm²%n", luas);
            System.out.printf("Keliling Lingkaran: %.2f cm%n", keliling);

        } else {
            System.out.println("Error: Pilihan menu tidak valid!");
        }
        System.out.println("===============================");
=======
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Bikin variabel buat nentuin apakah loop bakal jalan terus atau berhenti
        String lanjut = "y"; 
        
        // Selama variabel 'lanjut' isinya huruf 'y', program bakal muter terus di dalam blok ini
        while (lanjut.equalsIgnoreCase("y")) {
            
            System.out.println("=== PROGRAM HITUNG PERSEGI PANJANG ===");
            
            System.out.print("Masukkan nilai panjang (cm): ");
            double panjang = input.nextDouble(); 
            
            System.out.print("Masukkan nilai lebar (cm)  : ");
            double lebar = input.nextDouble();   
            
            double luas = panjang * lebar;
            double keliling = 2 * (panjang + lebar);
            
            System.out.println("\n--- HASIL KALKULASI ---"); 
            System.out.println("Luas Area       : " + luas + " cm persegi");
            System.out.println("Total Keliling  : " + keliling + " cm");
            System.out.println("-----------------------");
            
            // Konfirmasi ke user mau ngulang apa nggak
            System.out.print("Mau hitung angka lain? (y/n): ");
            lanjut = input.next(); // Nangkep jawaban 'y' atau 'n'
            
            System.out.println(); // Kasih enter kosong biar rapi pas muter ke atas lagi
        }
        
        // Kalau user ngetik selain 'y', loop-nya jebol dan baris ini bakal dieksekusi
        System.out.println("Program selesai. Thank you!");
        input.close();
>>>>>>> 5f8b914b6a2a0cc8301109a5b0e05f0ea9665917
    }
}