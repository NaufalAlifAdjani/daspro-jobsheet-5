import java.util.Scanner;
public class PemilihanHariDenganIf16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int angka;

        System.out.print("Masukkan angka : ");
        angka = sc.nextInt();

        if (angka >= 1 && angka <= 5) {
            System.out.println(angka+" is a weekday");
        } else if (angka == 6 || angka == 7) {
            System.out.println(angka+" is a weekend");
        } else {
            System.out.println(angka+" Invalid Number");
        }
     }
}
