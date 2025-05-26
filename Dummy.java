// Package untuk program geometri
package com.geometry;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

// 1. ABSTRACTION - Abstract class untuk bangun datar
abstract class BangunDatar {
    protected String nama;
    
    public BangunDatar(String nama) {
        this.nama = nama;
    }
    
    // Abstract methods yang harus diimplementasikan oleh subclass
    public abstract double hitungLuas();
    public abstract double hitungKeliling();
    
    // Concrete method
    public String getNama() {
        return nama;
    }
    
    public void tampilkanInfo() {
        System.out.println("=== " + nama + " ===");
        System.out.println("Luas: " + hitungLuas());
        System.out.println("Keliling: " + hitungKeliling());
    }
}

// 2. INHERITANCE & ENCAPSULATION - Class Persegi sebagai turunan BangunDatar
class Persegi extends BangunDatar {
    private double sisi; // Encapsulation - private field
    
    public Persegi(double sisi) {
        super("Persegi");
        this.sisi = sisi;
    }
    
    // Getter dan Setter (Encapsulation)
    public double getSisi() {
        return sisi;
    }
    
    public void setSisi(double sisi) {
        this.sisi = sisi;
    }
    
    @Override
    public double hitungLuas() {
        return sisi * sisi;
    }
    
    @Override
    public double hitungKeliling() {
        return 4 * sisi;
    }
}

// Class Persegi Panjang
class PersegiPanjang extends BangunDatar {
    private double panjang, lebar;
    
    public PersegiPanjang(double panjang, double lebar) {
        super("Persegi Panjang");
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    public double getPanjang() { return panjang; }
    public double getLebar() { return lebar; }
    public void setPanjang(double panjang) { this.panjang = panjang; }
    public void setLebar(double lebar) { this.lebar = lebar; }
    
    @Override
    public double hitungLuas() {
        return panjang * lebar;
    }
    
    @Override
    public double hitungKeliling() {
        return 2 * (panjang + lebar);
    }
}

// Class Lingkaran
class Lingkaran extends BangunDatar {
    private double jariJari;
    private static final double PI = 3.14159;
    
    public Lingkaran(double jariJari) {
        super("Lingkaran");
        this.jariJari = jariJari;
    }
    
    public double getJariJari() { return jariJari; }
    public void setJariJari(double jariJari) { this.jariJari = jariJari; }
    
    @Override
    public double hitungLuas() {
        return PI * jariJari * jariJari;
    }
    
    @Override
    public double hitungKeliling() {
        return 2 * PI * jariJari;
    }
}

// Class Segitiga
class Segitiga extends BangunDatar {
    private double alas, tinggi, sisiA, sisiB, sisiC;
    
    public Segitiga(double alas, double tinggi, double sisiA, double sisiB, double sisiC) {
        super("Segitiga");
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisiA = sisiA;
        this.sisiB = sisiB;
        this.sisiC = sisiC;
    }
    
    // Getters dan Setters
    public double getAlas() { return alas; }
    public double getTinggi() { return tinggi; }
    public void setAlas(double alas) { this.alas = alas; }
    public void setTinggi(double tinggi) { this.tinggi = tinggi; }
    
    @Override
    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }
    
    @Override
    public double hitungKeliling() {
        return sisiA + sisiB + sisiC;
    }
}

// Interface untuk bangun ruang (Abstraction)
interface BangunRuang {
    double hitungVolume();
    double hitungLuasPermukaan();
    void tampilkanInfoRuang();
}

// INHERITANCE - Kubus sebagai turunan dari Persegi dan implementasi BangunRuang
class Kubus extends Persegi implements BangunRuang {
    
    public Kubus(double sisi) {
        super(sisi);
        this.nama = "Kubus";
    }
    
    @Override
    public double hitungVolume() {
        return Math.pow(getSisi(), 3);
    }
    
    @Override
    public double hitungLuasPermukaan() {
        return 6 * hitungLuas(); // 6 × luas persegi
    }
    
    @Override
    public void tampilkanInfoRuang() {
        System.out.println("=== " + nama + " ===");
        System.out.println("Sisi: " + getSisi());
        System.out.println("Luas Alas: " + hitungLuas());
        System.out.println("Keliling Alas: " + hitungKeliling());
        System.out.println("Volume: " + hitungVolume());
        System.out.println("Luas Permukaan: " + hitungLuasPermukaan());
    }
}

// Balok sebagai turunan dari PersegiPanjang
class Balok extends PersegiPanjang implements BangunRuang {
    private double tinggi;
    
    public Balok(double panjang, double lebar, double tinggi) {
        super(panjang, lebar);
        this.tinggi = tinggi;
        this.nama = "Balok";
    }
    
    public double getTinggiBalok() { return tinggi; }
    public void setTinggiBalok(double tinggi) { this.tinggi = tinggi; }
    
    @Override
    public double hitungVolume() {
        return hitungLuas() * tinggi; // luas alas × tinggi
    }
    
    @Override
    public double hitungLuasPermukaan() {
        return 2 * (hitungLuas() + getPanjang() * tinggi + getLebar() * tinggi);
    }
    
    @Override
    public void tampilkanInfoRuang() {
        System.out.println("=== " + nama + " ===");
        System.out.println("Panjang: " + getPanjang() + ", Lebar: " + getLebar() + ", Tinggi: " + tinggi);
        System.out.println("Luas Alas: " + hitungLuas());
        System.out.println("Keliling Alas: " + hitungKeliling());
        System.out.println("Volume: " + hitungVolume());
        System.out.println("Luas Permukaan: " + hitungLuasPermukaan());
    }
}

// Tabung sebagai turunan dari Lingkaran
class Tabung extends Lingkaran implements BangunRuang {
    private double tinggi;
    private static final double PI = 3.14159;
    
    public Tabung(double jariJari, double tinggi) {
        super(jariJari);
        this.tinggi = tinggi;
        this.nama = "Tabung";
    }
    
    public double getTinggiTabung() { return tinggi; }
    public void setTinggiTabung(double tinggi) { this.tinggi = tinggi; }
    
    @Override
    public double hitungVolume() {
        return hitungLuas() * tinggi; // π × r² × t
    }
    
    @Override
    public double hitungLuasPermukaan() {
        return 2 * hitungLuas() + hitungKeliling() * tinggi; // 2πr² + 2πrt
    }
    
    @Override
    public void tampilkanInfoRuang() {
        System.out.println("=== " + nama + " ===");
        System.out.println("Jari-jari: " + getJariJari() + ", Tinggi: " + tinggi);
        System.out.println("Luas Alas: " + hitungLuas());
        System.out.println("Keliling Alas: " + hitungKeliling());
        System.out.println("Volume: " + hitungVolume());
        System.out.println("Luas Permukaan: " + hitungLuasPermukaan());
    }
}

// Prisma Segitiga sebagai turunan dari Segitiga
class PrismaSegitiga extends Segitiga implements BangunRuang {
    private double tinggi;
    
    public PrismaSegitiga(double alas, double tinggiSegitiga, double sisiA, double sisiB, double sisiC, double tinggiPrisma) {
        super(alas, tinggiSegitiga, sisiA, sisiB, sisiC);
        this.tinggi = tinggiPrisma;
        this.nama = "Prisma Segitiga";
    }
    
    public double getTinggiPrisma() { return tinggi; }
    public void setTinggiPrisma(double tinggi) { this.tinggi = tinggi; }
    
    @Override
    public double hitungVolume() {
        return hitungLuas() * tinggi;
    }
    
    @Override
    public double hitungLuasPermukaan() {
        return 2 * hitungLuas() + hitungKeliling() * tinggi;
    }
    
    @Override
    public void tampilkanInfoRuang() {
        System.out.println("=== " + nama + " ===");
        System.out.println("Alas: " + getAlas() + ", Tinggi Segitiga: " + getTinggi() + ", Tinggi Prisma: " + tinggi);
        System.out.println("Luas Alas: " + hitungLuas());
        System.out.println("Keliling Alas: " + hitungKeliling());
        System.out.println("Volume: " + hitungVolume());
        System.out.println("Luas Permukaan: " + hitungLuasPermukaan());
    }
}

// Class untuk mengelola koleksi bangun (Class and Object)
class KoleksiBangun {
    private List<BangunDatar> bangunDatarList;
    private List<BangunRuang> bangunRuangList;
    
    public KoleksiBangun() {
        bangunDatarList = new ArrayList<>();
        bangunRuangList = new ArrayList<>();
    }
    
    public void tambahBangunDatar(BangunDatar bangun) {
        bangunDatarList.add(bangun);
    }
    
    public void tambahBangunRuang(BangunRuang bangun) {
        bangunRuangList.add(bangun);
    }
    
    // POLYMORPHISM - Method yang menerima berbagai jenis bangun datar
    public void tampilkanSemuaBangunDatar() {
        System.out.println("\n========== BANGUN DATAR ==========");
        for (BangunDatar bangun : bangunDatarList) {
            bangun.tampilkanInfo(); // Polymorphism - method yang sama, implementasi berbeda
            System.out.println();
        }
    }
    
    public void tampilkanSemuaBangunRuang() {
        System.out.println("\n========== BANGUN RUANG ==========");
        for (BangunRuang bangun : bangunRuangList) {
            bangun.tampilkanInfoRuang(); // Polymorphism
            System.out.println();
        }
    }
}

// Main class untuk menjalankan program
public class GeometryCalculator {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        KoleksiBangun koleksi = new KoleksiBangun();
        
        System.out.println("===== PROGRAM KALKULATOR GEOMETRI =====");
        System.out.println("Program ini menghitung bangun datar dan bangun ruang");
        System.out.println("Mengimplementasikan 5 Pilar OOP: Abstraction, Inheritance, Polymorphism, Encapsulation, Class & Object");
        
        boolean lanjut = true;
        
        while (lanjut) {
            System.out.println("\n===== MENU UTAMA =====");
            System.out.println("1. Tambah Bangun Datar");
            System.out.println("2. Tambah Bangun Ruang");
            System.out.println("3. Tampilkan Semua Bangun Datar");
            System.out.println("4. Tampilkan Semua Bangun Ruang");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            
            int pilihan = scanner.nextInt();
            
            switch (pilihan) {
                case 1:
                    tambahBangunDatar(scanner, koleksi);
                    break;
                case 2:
                    tambahBangunRuang(scanner, koleksi);
                    break;
                case 3:
                    koleksi.tampilkanSemuaBangunDatar();
                    break;
                case 4:
                    koleksi.tampilkanSemuaBangunRuang();
                    break;
                case 5:
                    lanjut = false;
                    System.out.println("Terima kasih telah menggunakan program ini!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
        
        scanner.close();
    }
    
    private static void tambahBangunDatar(Scanner scanner, KoleksiBangun koleksi) {
        System.out.println("\n=== PILIH BANGUN DATAR ===");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Lingkaran");
        System.out.println("4. Segitiga");
        System.out.print("Pilih bangun datar: ");
        
        int pilihan = scanner.nextInt();
        
        switch (pilihan) {
            case 1:
                System.out.print("Masukkan panjang sisi: ");
                double sisi = scanner.nextDouble();
                koleksi.tambahBangunDatar(new Persegi(sisi));
                System.out.println("Persegi berhasil ditambahkan!");
                break;
            case 2:
                System.out.print("Masukkan panjang: ");
                double panjang = scanner.nextDouble();
                System.out.print("Masukkan lebar: ");
                double lebar = scanner.nextDouble();
                koleksi.tambahBangunDatar(new PersegiPanjang(panjang, lebar));
                System.out.println("Persegi Panjang berhasil ditambahkan!");
                break;
            case 3:
                System.out.print("Masukkan jari-jari: ");
                double jariJari = scanner.nextDouble();
                koleksi.tambahBangunDatar(new Lingkaran(jariJari));
                System.out.println("Lingkaran berhasil ditambahkan!");
                break;
            case 4:
                System.out.print("Masukkan alas: ");
                double alas = scanner.nextDouble();
                System.out.print("Masukkan tinggi: ");
                double tinggi = scanner.nextDouble();
                System.out.print("Masukkan sisi A: ");
                double sisiA = scanner.nextDouble();
                System.out.print("Masukkan sisi B: ");
                double sisiB = scanner.nextDouble();
                System.out.print("Masukkan sisi C: ");
                double sisiC = scanner.nextDouble();
                koleksi.tambahBangunDatar(new Segitiga(alas, tinggi, sisiA, sisiB, sisiC));
                System.out.println("Segitiga berhasil ditambahkan!");
                break;
            default:
                System.out.println("Pilihan tidak valid!");
        }
    }
    
    private static void tambahBangunRuang(Scanner scanner, KoleksiBangun koleksi) {
        System.out.println("\n=== PILIH BANGUN RUANG ===");
        System.out.println("1. Kubus");
        System.out.println("2. Balok");
        System.out.println("3. Tabung");
        System.out.println("4. Prisma Segitiga");
        System.out.print("Pilih bangun ruang: ");
        
        int pilihan = scanner.nextInt();
        
        switch (pilihan) {
            case 1:
                System.out.print("Masukkan panjang sisi: ");
                double sisi = scanner.nextDouble();
                Kubus kubus = new Kubus(sisi);
                koleksi.tambahBangunDatar(kubus); // Kubus juga adalah BangunDatar
                koleksi.tambahBangunRuang(kubus);
                System.out.println("Kubus berhasil ditambahkan!");
                break;
            case 2:
                System.out.print("Masukkan panjang: ");
                double panjang = scanner.nextDouble();
                System.out.print("Masukkan lebar: ");
                double lebar = scanner.nextDouble();
                System.out.print("Masukkan tinggi: ");
                double tinggi = scanner.nextDouble();
                Balok balok = new Balok(panjang, lebar, tinggi);
                koleksi.tambahBangunDatar(balok);
                koleksi.tambahBangunRuang(balok);
                System.out.println("Balok berhasil ditambahkan!");
                break;
            case 3:
                System.out.print("Masukkan jari-jari: ");
                double jariJari = scanner.nextDouble();
                System.out.print("Masukkan tinggi: ");
                double tinggiTabung = scanner.nextDouble();
                Tabung tabung = new Tabung(jariJari, tinggiTabung);
                koleksi.tambahBangunDatar(tabung);
                koleksi.tambahBangunRuang(tabung);
                System.out.println("Tabung berhasil ditambahkan!");
                break;
            case 4:
                System.out.print("Masukkan alas segitiga: ");
                double alas = scanner.nextDouble();
                System.out.print("Masukkan tinggi segitiga: ");
                double tinggiSegitiga = scanner.nextDouble();
                System.out.print("Masukkan sisi A: ");
                double sisiA = scanner.nextDouble();
                System.out.print("Masukkan sisi B: ");
                double sisiB = scanner.nextDouble();
                System.out.print("Masukkan sisi C: ");
                double sisiC = scanner.nextDouble();
                System.out.print("Masukkan tinggi prisma: ");
                double tinggiPrisma = scanner.nextDouble();
                PrismaSegitiga prisma = new PrismaSegitiga(alas, tinggiSegitiga, sisiA, sisiB, sisiC, tinggiPrisma);
                koleksi.tambahBangunDatar(prisma);
                koleksi.tambahBangunRuang(prisma);
                System.out.println("Prisma Segitiga berhasil ditambahkan!");
                break;
            default:
                System.out.println("Pilihan tidak valid!");
        }
    }
}
