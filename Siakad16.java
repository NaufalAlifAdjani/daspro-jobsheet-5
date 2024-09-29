import java.util.Scanner;

public class Siakad16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama, kelas, nim;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUTS, nilaiAkhir,nilaiUAS;

        System.out.print("Masukkan nama : ");
        nama = sc.nextLine();
        System.out.print("Masukkan NIM : ");
        nim = sc.nextLine();
        System.out.print("Masukkan Kelas : ");
        kelas = sc.nextLine();
        System.out.print("Masukkan nomor absen : ");
        absen = sc.nextByte();

        System.out.println("");
        
        System.out.print("Masukkan nilai kuis : ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan nilai tugas : ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan nilai UTS : ");
        nilaiUTS = sc.nextDouble();
        System.out.print("Masukkan nilai UAS : ");
        nilaiUAS = sc.nextDouble();

         System.out.println("");

        nilaiAkhir = ((nilaiKuis*20/100)+(nilaiTugas*15/100)+(nilaiUTS*30/100)+(nilaiUAS*35/100));

        System.out.println("Nama : "+nama+" NIM: "+nim);
        System.out.println("Kelas : "+kelas+" Absen: "+absen);
        System.out.println("Nilai Akhir : "+nilaiAkhir);
        if(nilaiAkhir>80){
            System.out.println("Nilai Akhir Huruf : A");
            System.out.println("Kualifikasi : Sangat Baik");
        }else if (nilaiAkhir>73){
            System.out.println("Nilai Akhir Huruf : B+");
            System.out.println("Kualifikasi : Lebih dari Baik");
        }else if (nilaiAkhir>65){
            System.out.println("Nilai Akhir Huruf : B");
            System.out.println("Kualifikasi : Baik");
        }else if (nilaiAkhir>60){
            System.out.println("Nilai Akhir Huruf : C+");
            System.out.println("Kualifikasi : Lebih dari Cukup");
        }else if (nilaiAkhir>50){
            System.out.println("Nilai Akhir Huruf : C");
            System.out.println("Kualifikasi : Cukup");
        }else if (nilaiAkhir>39){
            System.out.println("Nilai Akhir Huruf : D");
            System.out.println("Kualifikasi : Kurang");
        }else if (nilaiAkhir<39){
            System.out.println("Nilai Akhir Huruf : Gagal");
        }
        
    }
}