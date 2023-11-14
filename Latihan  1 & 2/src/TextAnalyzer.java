import java.util.Scanner;

public class TextAnalyzer {

    private static String teks = "";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String teks = "";

        boolean running = true;
        while (running) {
            System.out.println("=== MENU TEKS ANALYZER ===");
            System.out.println("1. Masukkan teks");
            System.out.println("2. Hitung jumlah karakter");
            System.out.println("3. Hitung jumlah kata");
            System.out.println("4. Cari kata dalam teks");
            System.out.println("5. Keluar");
            System.out.println("Pilihan Anda : ");

            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("Masukkan teks:");
                    teks = scanner.nextLine();
                    if (!teks.isEmpty()) {
                        System.out.println("Teks telah dimasukkan!\n");
                    } else {
                        System.out.println("Teks kosong. Silakan masukkan teks terlebih dahulu.\n");
                    }
                    break;

                case 2:
                    int jumlahKarakter = teks.length();
                    System.out.println("Jumlah karakter dalam teks: " + jumlahKarakter);
                    break;
                case 3:
                    String[] kata = teks.split("\\s+");
                    int jumlahKata = kata.length;
                    System.out.println("Jumlah kata dalam teks: " + jumlahKata);
                    break;
                case 4:
                    System.out.println("Masukkan kata yang ingin dicari dalam teks: ");
                    String kataCari = scanner.nextLine();

                    boolean ditemukan = false;
                    for (String kataTeks : teks.split("\\s+")) {
                        if (kataTeks.equalsIgnoreCase(kataCari)) {
                            ditemukan = true;
                            break;
                        }
                    }

                    if (ditemukan) {
                        System.out.println("Kata \"" + kataCari + "\" ditemukan dalam teks.");
                    } else {
                        System.out.println("Kata \"" + kataCari + "\" tidak ditemukan dalam teks.");
                    }
                    break;
                case 5:
                    running = false;
                    System.out.println("Terima kasih telah menggunakan program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }

        scanner.close();
    }
}
