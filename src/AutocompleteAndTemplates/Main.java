package AutocompleteAndTemplates;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        double angka1 = input.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        double angka2 = input.nextDouble();

        System.out.print("Pilih operasi (tambah/kurang/kali/bagi): ");
        String operasi = input.next();

        double hasil = 0;

        switch (operasi) {
            case "tambah":
                  hasil = angka1 + angka2;
                      break;
            case "kurang":
                 hasil = angka1 - angka2;
                 break;
            case "kali":
                 hasil = angka1 * angka2;
                 break;
            case "bagi":
                if (angka2 != 0) {
                      hasil = angka1 / angka2;
                } else {
                    System.out.println("Kesalahan: Tidak bisa membagi dengan nol.");
                    return;
                }
                break;
            default:
                System.out.println("Operasi tidak valid.");
                return;
        }

        System.out.println("Hasil operasi " + operasi + " adalah: " + hasil);

        input.close();
    }
}
