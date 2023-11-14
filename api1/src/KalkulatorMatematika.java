import java.util.Scanner;


public class KalkulatorMatematika {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean ulang = true;

        while (ulang) {
            System.out.println("=== Calculator ===");
            System.out.println("Pilihan operasi:");
            System.out.println("1. Akar Kuadrat");
            System.out.println("2. Pangkat");
            System.out.println("3. Logaritma");
            System.out.println("4. Faktorial");
            System.out.println("5. Keluar");
            System.out.print("Pilih operasi (1/2/3/4/5) : ");

            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan angka : ");
                    double angkaAkar = scanner.nextDouble();
                    double hasilAkar = Math.sqrt(angkaAkar);
                    System.out.println("Hasil akar kuadrat: " + hasilAkar);
                    break;
                case 2:
                    System.out.print("Masukkan angka: ");
                    double angkaPangkat = scanner.nextDouble();
                    System.out.print("Masukkan pangkat: ");
                    double pangkat = scanner.nextDouble();
                    double hasilPangkat = Math.pow(angkaPangkat, pangkat);
                    System.out.println("Hasil pangkat: " + hasilPangkat);
                    break;
                case 3:
                    System.out.print("Masukkan angka : ");
                    double angkaLog = scanner.nextDouble();
                    double hasilLog = Math.log(angkaLog);
                    System.out.println("Hasil logaritma natural: " + hasilLog);
                    break;
                case 4:
                    System.out.print("Masukkan angka: ");
                    int angkaFaktorial = scanner.nextInt();
                    int hasilFaktorial = hitungFaktorial(angkaFaktorial);
                    System.out.println("Hasil faktorial: " + hasilFaktorial);
                    break;
                case 5:
                    ulang = false;
                    System.out.println("Terima kasih telah menggunakan kalkulator ini");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }

        scanner.close();
    }

    // Fungsi untuk menghitung faktorial
    public static int hitungFaktorial(int angka) {
        if (angka == 0 || angka == 1) {
            return 1;
        } else {
            int hasil = 1;
            for (int i = 2; i <= angka; i++) {
                hasil *= i;
            }
            return hasil;
        }
    }
}
