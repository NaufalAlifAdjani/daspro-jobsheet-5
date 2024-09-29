import java.util.Scanner;

public class SistemParkir {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String kendaraan;
        int jam, totalBiaya;

        // Meminta input dari pengguna
        System.out.print("Masukkan jenis kendaraan (mobil/motor): ");
        kendaraan = input.nextLine();

        System.out.print("Masukkan durasi parkir (dalam jam): ");
        jam = input.nextInt();

        // Menampilkan hasil
        if (kendaraan.equalsIgnoreCase("mobil")) {
            totalBiaya = jam * 5000;
            System.out.println("Total Biaya parkir : "+totalBiaya);
        } else if (kendaraan.equalsIgnoreCase("motor")) {
            totalBiaya = jam * 3000;
            System.out.println("Total Biaya parkir : "+totalBiaya);
        } else {
            System.out.println("Invalid Kendaraan");
        }
    }
}
