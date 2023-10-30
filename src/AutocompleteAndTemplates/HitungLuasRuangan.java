package AutocompleteAndTemplates;

import java.util.Scanner;

/**
 * Program ini menghitung luas ruangan berdasarkan panjang dan lebar yang dimasukkan oleh pengguna.
 */
public class HitungLuasRuangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /**
         * Meminta pengguna untuk memasukkan panjang ruangan
         */
        System.out.print("Masukkan panjang ruangan (meter): ");
        double panjang = input.nextDouble();

        /**
         * Meminta pengguna untuk memasukkan lebar ruangan
         *
         * @return Panjang ruangan yang dimasukkan oleh pengguna (dalam meter).
         */
        System.out.print("Masukkan lebar ruangan (meter): ");
        double lebar = input.nextDouble();

        /**
         * Menghitung luas ruangan
         *
         * @return Luas ruangan yang dihitung (dalam meter persegi).
         */
        double luas = panjang * lebar;

        /**
         * Menampilkan hasil luas ruangan
         *
         * @param luas Luas ruangan yang akan ditampilkan (dalam meter persegi).
          */
        System.out.println("Luas ruangan adalah: " + luas + " meter persegi");

        /**
         * Menutup scanner
          */
        input.close();
    }
}

