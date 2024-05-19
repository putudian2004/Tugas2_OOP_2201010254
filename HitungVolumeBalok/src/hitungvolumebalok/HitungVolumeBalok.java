
package hitungvolumebalok;

import java.util.Scanner;

/**
 *
 * @author Dian Sariani (2201010254)
 * TGL : 2024-05-13
 */
public class HitungVolumeBalok {
    // Atribut private untuk panjang, lebar, dan tinggi balok
    private double panjang;
    private double lebar;
    private double tinggi;

    // Constructor tanpa parameter
    public HitungVolumeBalok() {
        // Kosongkan constructor
    }

    // Setter untuk mengubah nilai panjang balok
    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    // Getter untuk mendapatkan nilai panjang balok
    public double getPanjang() {
        return panjang;
    }

    // Setter untuk mengubah nilai lebar balok
    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    // Getter untuk mendapatkan nilai lebar balok
    public double getLebar() {
        return lebar;
    }

    // Setter untuk mengubah nilai tinggi balok
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    // Getter untuk mendapatkan nilai tinggi balok
    public double getTinggi() {
        return tinggi;
    }

    // Method untuk menghitung volume balok
    public double hitungVolume() {
        return panjang * lebar * tinggi;
    }

    // Method untuk menghitung luas permukaan balok
    public double hitungLuasPermukaan() {
        return 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
    }

    // Method untuk mencetak hasil perhitungan volume dan luas permukaan balok
    public void printHasil() {
        System.out.println("Volume balok: " + hitungVolume());
        System.out.println("Luas permukaan balok: " + hitungLuasPermukaan());
    }

    public static void main(String[] args) {
    // Method main untuk menjalankan aplikasi
        HitungVolumeBalok balok = new HitungVolumeBalok();

        // Minta input panjang, lebar, dan tinggi dari user
        balok.mintaInput();

        // Hitung dan cetak hasil volume
        double volume = balok.hitungVolume();
        System.out.println("Volume balok: " + volume);

        // Hitung dan cetak hasil luas permukaan
        double luasPermukaan = balok.hitungLuasPermukaan();
        System.out.println("Luas permukaan balok: " + luasPermukaan);
    }

    // Method untuk meminta input panjang, lebar, dan tinggi dari user
    public void mintaInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan panjang balok: ");
        panjang = scanner.nextDouble();

        System.out.print("Masukkan lebar balok: ");
        lebar = scanner.nextDouble();

        System.out.print("Masukkan tinggi balok: ");
        tinggi = scanner.nextDouble();
    } 
}
