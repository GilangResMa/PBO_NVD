import java.util.InputMismatchException; 
import java.util.Scanner;
import geometri.*;

public class Main {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int pilihan;
            do {
                System.out.println("\n=== Program Perhitungan Benda Geometri ===");
                System.out.println("1. Hitung dinamis bangun datar");
                System.out.println("2. Hitung dinamis bangun ruang");
                System.out.println("3. Hitung keseluruhan bangun"); 
                System.out.println("4. Exit");
                System.out.print("Masukkan pilihan anda : ");

                try {
                    pilihan = input.nextInt();

                    switch (pilihan) {
                        case 1:
                            System.out.println("\n=== Bangun Datar ===");
                            System.out.println("1. Segitiga");
                            System.out.println("2. Jajar Genjang");
                            System.out.println("3. Belah Ketupat");
                            System.out.println("4. Persegi Panjang");
                            System.out.println("5. Layang-Layang");
                            System.out.println("6. Persegi");
                            System.out.println("7. Trapesium (Belum Implementasi)");
                            System.out.println("8. Lingkaran (Belum Implementasi)");
                            System.out.println("9. Juring Lingkaran (Belum Implementasi)");
                            System.out.println("10. Tembereng Lingkaran (Belum Implementasi)");
                            System.out.print("Masukkan pilihan bangun datar : ");
                            int pilihanBangunDatar = input.nextInt();

                            switch (pilihanBangunDatar) {
                                case 1:
                                    System.out.println("\n--- Menghitung Segitiga ---");

                                    System.out.print("Masukkan nilai alas segitiga : ");
                                    double alas = input.nextDouble();

                                    System.out.print("Masukkan nilai tinggi segitiga : ");
                                    double tinggi = input.nextDouble();

                                    Segitiga segitiga = new Segitiga(alas,tinggi);
                                    System.out.println("Luas Segitiga = " + segitiga.hitungLuas());
                                    System.out.println("Keliling Segitiga = " + segitiga.hitungKeliling());
                                    break;
                                case 2:
                                    System.out.println("\n--- Menghitung JajarGenjang ---");

                                    System.out.print("Masukkan nilai alas JajarGenjang : ");
                                    double alasJajarGenjang = input.nextDouble();

                                    System.out.print("Masukkan nilai tinggi JajarGenjang : ");
                                    double tinggiJajarGenjang = input.nextDouble();

                                    System.out.print("Masukkan nilai sisi A JajarGenjang : ");
                                    double sisiAJajarGenjang = input.nextDouble();

                                    System.out.print("Masukkan nilai sisi B JajarGenjang : ");
                                    double sisiBJajarGenjang = input.nextDouble();

                                    JajarGenjang jajarGenjang = new JajarGenjang(alasJajarGenjang,tinggiJajarGenjang,sisiAJajarGenjang,sisiBJajarGenjang);
                                    System.out.println("Luas JajarGenjang = " + jajarGenjang.hitungLuas());
                                    System.out.println("Keliling JajarGenjang = " + jajarGenjang.hitungKeliling());
                                case 3:
                                    System.out.println("\n--- Menghitung BelahKetupat ---");

                                    System.out.print("Masukkan nilai alas BelahKetupat : ");
                                    double diagonal1BelahKetupat = input.nextDouble();

                                    System.out.print("Masukkan nilai tinggi BelahKetupat : ");
                                    double diagonal2BelahKetupat = input.nextDouble();

                                    System.out.print("Masukkan nilai sisi BelahKetupat : ");
                                    double sisiBelahKetupat = input.nextDouble();

                                    BelahKetupat belahKetupat = new BelahKetupat(diagonal1BelahKetupat,diagonal2BelahKetupat,sisiBelahKetupat);
                                    System.out.println("Luas BelahKetupat = " + belahKetupat.hitungLuas());
                                    System.out.println("Keliling BelahKetupat = " + belahKetupat.hitungKeliling());
                                case 4:
                                    System.out.println("\n--- Menghitung PersegiPanjang ---");

                                    System.out.print("Masukkan nilai panjang PersegiPanjang : ");
                                    double panjangPersegiPanjang = input.nextDouble();

                                    System.out.print("Masukkan nilai lebar PersegiPanjang : ");
                                    double lebarPersegiPanjang = input.nextDouble();

                                    PersegiPanjang persegiPanjang = new PersegiPanjang(panjangPersegiPanjang,lebarPersegiPanjang);
                                    System.out.println("Luas PersegiPanjang = " + persegiPanjang.hitungLuas());
                                    System.out.println("Keliling PersegiPanjang = " + persegiPanjang.hitungKeliling());
                                case 5:
                                    System.out.println("\n--- Menghitung LayangLayang ---");

                                    System.out.print("Masukkan nilai alas LayangLayang : ");
                                    double diagonal1LayangLayang = input.nextDouble();

                                    System.out.print("Masukkan nilai tinggi LayangLayang : ");
                                    double diagonal2LayangLayang = input.nextDouble();

                                    System.out.print("Masukkan nilai sisi A LayangLayang : ");
                                    double sisiALayangLayang = input.nextDouble();

                                    System.out.print("Masukkan nilai sisi B LayangLayang : ");
                                    double sisiBLayangLayang = input.nextDouble();

                                    LayangLayang layangLayang = new LayangLayang(diagonal1LayangLayang,diagonal2LayangLayang,sisiALayangLayang, sisiBLayangLayang);
                                    System.out.println("Luas LayangLayang = " + layangLayang.hitungLuas());
                                    System.out.println("Keliling LayangLayang = " + layangLayang.hitungKeliling());
                                case 6:
                                    System.out.println("\n--- Menghitung Persegi ---");
                                    System.out.print("Masukkan nilai sisi persegi : ");
                                    double sisi = input.nextDouble();
                                    Persegi persegi = new Persegi(sisi);
                                    System.out.println("Luas Persegi = " + persegi.hitungLuas());
                                    System.out.println("Keliling Persegi = " + persegi.hitungKeliling());
                                    break;
                                case 7:
                                    System.out.println("\n--- Menghitung Trapesium ---");
                                    System.out.print("Masukkan nilai alas atas trapesium : ");
                                    double alasAtasTrapesium = input.nextDouble();
                                    System.out.print("Masukkan nilai alas bawah trapesium : ");
                                    double alasBawahTrapesium = input.nextDouble();
                                    System.out.print("Masukkan nilai sisi miring  trapesium : ");
                                    double sisiMiringTrapesium = input.nextDouble();
                                    System.out.print("Masukkan nilai tinggi trapesium : ");
                                    double tinggiTrapesium = input.nextDouble();
                                    Trapesium trapesium = new Trapesium(alasAtasTrapesium, alasBawahTrapesium, sisiMiringTrapesium, tinggiTrapesium);
                                    System.out.println("Luas Trapesium = " + trapesium.hitungLuas());
                                    System.out.println("Keliling Trapesium = " + trapesium.hitungKeliling());
                                    break;
                                case 8:
                                    System.out.println("\n--- Menghitung Lingkaran ---");
                                    System.out.print("Masukkan nilai jari-jari Lingkaran : ");
                                    double jariJariLingkaran = input.nextDouble();
                                    
                                    Lingkaran lingkaran = new Lingkaran(jariJariLingkaran);
                                    System.out.println("Luas Lingkaran = " + lingkaran.hitungLuas());
                                    System.out.println("Keliling Lingkaran = " + lingkaran.hitungKeliling());
                                    break;
                                case 9:
                                    System.out.println("\n--- Menghitung Juring Lingkaran ---");
                                    System.out.print("Masukkan nilai jari-jari Lingkaran : ");
                                    double jariJariLingkaran_juring = input.nextDouble();
                                    
                                    System.out.print("Masukkan nilai sudut Juring Lingkaran : ");
                                    double sudutJuring = input.nextDouble();
                                    
                                    JuringLingkaran juringLingkaran = new JuringLingkaran(jariJariLingkaran_juring, sudutJuring);
                                    System.out.println("Luas Juring Lingkaran = " + juringLingkaran.hitungLuas());
                                    System.out.println("Keliling Juring Lingkaran = " + juringLingkaran.hitungKeliling());
                                    break;
                                case 10:
                                    System.out.println("\n--- Menghitung Tembereng Lingkaran ---");
                                    System.out.print("Masukkan nilai jari-jari Lingkaran : ");
                                    double jariJariLingkaran_tembereng = input.nextDouble();
                                    
                                    System.out.print("Masukkan nilai sudut Tembereng Lingkaran : ");
                                    double sudutTembereng = input.nextDouble();
                                    
                                    TemberengLingkaran temberengLingkaran = new TemberengLingkaran(jariJariLingkaran_tembereng, sudutTembereng);
                                    System.out.println("Luas Tembereng Lingkaran = " + temberengLingkaran.hitungLuas());
                                    System.out.println("Keliling Tembereng Lingkaran = " + temberengLingkaran.hitungKeliling());
                                    break;
                                default:
                                    System.out.println("Pilihan bangun datar tidak valid.");
                            }
                            break; 
                        case 2:
                            System.out.println("=== Bangun Ruang ===");
                            System.out.println("1. Kubus"); 
                            System.out.println("2. Limas Persegi"); 
                            System.out.println("3. Prisma Persegi"); 
                            System.out.println("4. Limas Belah Ketupat");
                            System.out.println("5. Prisma Belah Ketupat"); 
                            System.out.println("6. Limas Layang Layang"); 
                            System.out.println("7. Prisma Layang Layang"); 
                            System.out.println("8. Limas Segitiga"); 
                            System.out.println("9. Prisma Segitiga"); 
                            System.out.println("10. Limas Jajar Genjang");
                            System.out.println("11. Prisma Jajar Genjang"); 
                            System.out.println("12. Limas Trapesium");
                            System.out.println("13. Prisma Trapesium");
                            System.out.println("14. Balok");
                            System.out.println("15. Limas Persegi Panjang");
                            System.out.println("16. Prisma Persegi Panjang");
                            System.out.println("17. Bola ");
                            System.out.println("18. Cincin Bola");
                            System.out.println("19. Juring Bola ");
                            System.out.println("20. Tembereng Bola ");
                            System.out.println("21. Kerucut");
                            System.out.println("22. Kerucut Terpancung");
                            System.out.println("23. Tabung");
                            System.out.print("Masukkan pilihan bangun ruang : ");
                            int pilihanBangunRuang = input.nextInt();

                            switch (pilihanBangunRuang) {
                                case 1:
                                    System.out.println("\n--- Menghitung Kubus ---");

                                    System.out.print("Masukkan nilai sisi kubus : ");
                                    double sisiKubus = input.nextDouble();

                                    Kubus kubus = new Kubus(sisiKubus);
                                    System.out.println("Volume Kubus = " + kubus.hitungVolume());
                                    System.out.println("Luas Permukaan Kubus = " + kubus.hitungLuasPermukaan());
                                    break;
                                case 2:
                                    System.out.println("\n--- Menghitung Limas Persegi ---");

                                    System.out.print("Masukkan nilai sisi limas persegi : ");
                                    double sisiLimasPersegi = input.nextDouble();

                                    System.out.print("Masukkan nilai tinggi limas persegi: ");
                                    double tinggiLimasPersegi = input.nextDouble();

                                    LimasPersegi limasPersegi = new LimasPersegi(sisiLimasPersegi,tinggiLimasPersegi);
                                    System.out.println("Volume LimasPersegi = " + limasPersegi.hitungVolume());
                                    System.out.println("Luas Permukaan LimasPersegi = " + limasPersegi.hitungLuasPermukaan());
                                    break;
                                case 3:
                                    System.out.println("\n--- Menghitung Prisma Persegi ---");

                                    System.out.print("Masukkan nilai sisi prisma persegi : ");
                                    double sisiPrismaPersegi = input.nextDouble();

                                    System.out.print("Masukkan nilai tinggi prisma persegi: ");
                                    double tinggiPrismaPersegi = input.nextDouble();

                                    PrismaPersegi prismaPersegi = new PrismaPersegi(sisiPrismaPersegi,tinggiPrismaPersegi);
                                    System.out.println("Volume PrismaPersegi = " + prismaPersegi.hitungVolume());
                                    System.out.println("Luas Permukaan PrismaPersegi = " + prismaPersegi.hitungLuasPermukaan());
                                    break;
                                case 4:
                                    System.out.println("\n--- Menghitung Limas Belah Ketupat ---");

                                    System.out.print("Masukkan nilai diagonal 1 limas belah ketupat : ");
                                    double diagonal1BelahKetupat = input.nextDouble();

                                    System.out.print("Masukkan nilai diagonal 2 limas belah ketupat : ");
                                    double diagonal2BelahKetupat = input.nextDouble();

                                    System.out.print("Masukkan nilai sisi limas belah ketupat : ");
                                    double sisiBelahKetupat = input.nextDouble();

                                    System.out.print("Masukkan nilai tinggi limas belah ketupat : ");
                                    double tinggiBelahKetupat = input.nextDouble();

                                    LimasBelahKetupat limasBelahKetupat = new LimasBelahKetupat(diagonal1BelahKetupat, diagonal2BelahKetupat, sisiBelahKetupat, tinggiBelahKetupat);
                                    System.out.println("Volume LimasBelahKetupat = " + limasBelahKetupat.hitungVolume());
                                    System.out.println("Luas Permukaan LimasBelahKetupat = " + limasBelahKetupat.hitungLuasPermukaan());
                                    break;
                                case 5:
                                    System.out.println("\n--- Menghitung Prisma  Belah Ketupat ---");

                                    System.out.print("Masukkan nilai diagonal 1 prisma belah ketupat : ");
                                    double diagonal1BelahKetupatP = input.nextDouble();

                                    System.out.print("Masukkan nilai diagonal 2 prisma belah ketupat : ");
                                    double diagonal2BelahKetupatP = input.nextDouble();

                                    System.out.print("Masukkan nilai sisi prisma belah ketupat : ");
                                    double sisiBelahKetupatP = input.nextDouble();

                                    System.out.print("Masukkan nilai tinggi prisma belah ketupat : ");
                                    double tinggiBelahKetupatP = input.nextDouble();

                                    PrismaBelahKetupat prismaBelahKetupat = new PrismaBelahKetupat(diagonal1BelahKetupatP, diagonal2BelahKetupatP, sisiBelahKetupatP, tinggiBelahKetupatP);
                                    System.out.println("Volume PrismaBelahKetupat = " + prismaBelahKetupat.hitungVolume());
                                    System.out.println("Luas Permukaan PrismaBelahKetupat = " + prismaBelahKetupat.hitungLuasPermukaan());
                                    break;
                                case 6:
                                    System.out.println("\n--- Menghitung Limas Layang Layang ---");

                                    System.out.print("Masukkan nilai diagonal 1 Limas Layang Layang : ");
                                    double diagonal1LayangLayangL = input.nextDouble();

                                    System.out.print("Masukkan nilai diagonal 2 Limas Layang Layang : ");
                                    double diagonal2LayangLayangL = input.nextDouble();

                                    System.out.print("Masukkan nilai sisi panjang Limas Layang Layang : ");
                                    double sisiPanjangLayangLayangL = input.nextDouble();

                                    System.out.print("Masukkan nilai sisi pendek Limas Layang Layang : ");
                                    double sisiPendekLayangLayangL = input.nextDouble();

                                    System.out.print("Masukkan nilai tinggi Limas Layang Layang : ");
                                    double tinggiLayangLayangL = input.nextDouble();

                                    LimasLayangLayang limasLayangLayang = new LimasLayangLayang(diagonal1LayangLayangL, diagonal2LayangLayangL, sisiPanjangLayangLayangL, sisiPendekLayangLayangL, tinggiLayangLayangL);
                                    System.out.println("Volume LimasLayangLayang = " + limasLayangLayang.hitungVolume());
                                    System.out.println("Luas Permukaan LimasLayangLayang = " + limasLayangLayang.hitungLuasPermukaan());
                                    break;
                                case 7:
                                    System.out.println("\n--- Menghitung Prisma Layang Layang ---");

                                    System.out.print("Masukkan nilai diagonal 1 Prisma Layang Layang : ");
                                    double diagonal1LayangLayangP = input.nextDouble();

                                    System.out.print("Masukkan nilai diagonal 2 Prisma Layang Layang : ");
                                    double diagonal2LayangLayangP = input.nextDouble();

                                    System.out.print("Masukkan nilai sisi panjang Prisma Layang Layang : ");
                                    double sisiPanjangLayangLayangP = input.nextDouble();

                                    System.out.print("Masukkan nilai sisi pendek Prisma Layang Layang : ");
                                    double sisiPendekLayangLayangP = input.nextDouble();

                                    System.out.print("Masukkan nilai tinggi Prisma Layang Layang : ");
                                    double tinggiLayangLayangP = input.nextDouble();

                                    PrismaLayangLayang prismaLayangLayang = new PrismaLayangLayang(diagonal1LayangLayangP, diagonal2LayangLayangP, sisiPanjangLayangLayangP, sisiPendekLayangLayangP, tinggiLayangLayangP);
                                    System.out.println("Volume PrismaLayangLayang = " + prismaLayangLayang.hitungVolume());
                                    System.out.println("Luas Permukaan PrismaLayangLayang = " + prismaLayangLayang.hitungLuasPermukaan());
                                    break;
                                case 8:
                                    System.out.println("\n--- Menghitung Limas Segitiga  ---");

                                    System.out.print("Masukkan nilai alas Segitiga : ");
                                    double alasSegitigaL = input.nextDouble();

                                    System.out.print("Masukkan nilai tinggi Segitiga : ");
                                    double tinggiSegitigaL = input.nextDouble();

                                    System.out.print("Masukkan nilai tinggi Limas Segitiga : ");
                                    double tinggiLimasSegitiga = input.nextDouble();

                                    LimasSegitiga limasSegitiga = new LimasSegitiga(alasSegitigaL, tinggiSegitigaL, tinggiLimasSegitiga);
                                    System.out.println("Volume Limas Segitiga = " + limasSegitiga.hitungVolume());
                                    System.out.println("Luas Permukaan Limas Segitiga = " + limasSegitiga.hitungLuasPermukaan());
                                    break;
                                case 9:
                                    System.out.println("\n--- Menghitung Prisma Segitiga  ---");

                                    System.out.print("Masukkan nilai alas Segitiga : ");
                                    double alasSegitigaP = input.nextDouble();

                                    System.out.print("Masukkan nilai tinggi Segitiga : ");
                                    double tinggiSegitigaP = input.nextDouble();

                                    System.out.print("Masukkan nilai tinggi Prisma Segitiga : ");
                                    double tinggiPrismaSegitiga = input.nextDouble();

                                    PrismaSegitiga prismaSegitiga = new PrismaSegitiga(alasSegitigaP, tinggiSegitigaP, tinggiPrismaSegitiga);
                                    System.out.println("Volume Prisma Segitiga = " + prismaSegitiga.hitungVolume());
                                    System.out.println("Luas Permukaan Prisma Segitiga = " + prismaSegitiga.hitungLuasPermukaan());
                                    break;
                                case 10:
                                    System.out.println("\n--- Menghitung Limas Jajar Genjang  ---");

                                    System.out.print("Masukkan nilai alas JajarGenjang : ");
                                    double alasJajarGenjangL = input.nextDouble();

                                    System.out.print("Masukkan nilai tinggi Jajar Genjang : ");
                                    double tinggiJajarGenjangL = input.nextDouble();

                                    System.out.print("Masukkan nilai sisi A Jajar Genjang : ");
                                    double sisiAJajarGenjangL = input.nextDouble();

                                    System.out.print("Masukkan nilai sisi B Jajar Genjang : ");
                                    double sisiBJajarGenjangL = input.nextDouble();

                                    System.out.print("Masukkan nilai tinggi Limas Jajar Genjang : ");
                                    double tinggiLimasJajarGenjang = input.nextDouble();

                                    LimasJajarGenjang limasJajarGenjang = new LimasJajarGenjang(alasJajarGenjangL, tinggiJajarGenjangL, sisiAJajarGenjangL, sisiBJajarGenjangL, tinggiLimasJajarGenjang);
                                    System.out.println("Volume Limas Jajar Genjang = " + limasJajarGenjang.hitungVolume());
                                    System.out.println("Luas Permukaan Limas Jajar Genjang = " + limasJajarGenjang.hitungLuasPermukaan());
                                    break;
                                case 11:
                                    System.out.println("\n--- Menghitung Prisma Jajar Genjang  ---");

                                    System.out.print("Masukkan nilai alas JajarGenjang : ");
                                    double alasJajarGenjangP = input.nextDouble();

                                    System.out.print("Masukkan nilai tinggi Jajar Genjang : ");
                                    double tinggiJajarGenjangP = input.nextDouble();

                                    System.out.print("Masukkan nilai sisi A Jajar Genjang : ");
                                    double sisiAJajarGenjangP = input.nextDouble();

                                    System.out.print("Masukkan nilai sisi B Jajar Genjang : ");
                                    double sisiBJajarGenjangP = input.nextDouble();

                                    System.out.print("Masukkan nilai tinggi Prisma Jajar Genjang : ");
                                    double tinggiPrismaJajarGenjang = input.nextDouble();

                                    PrismaJajarGenjang prismaJajarGenjang = new PrismaJajarGenjang(alasJajarGenjangP, tinggiJajarGenjangP, sisiAJajarGenjangP, sisiBJajarGenjangP, tinggiPrismaJajarGenjang);
                                    System.out.println("Volume Prisma Jajar Genjang = " + prismaJajarGenjang.hitungVolume());
                                    System.out.println("Luas Permukaan Prisma Jajar Genjang = " + prismaJajarGenjang.hitungLuasPermukaan());
                                    break;
                                case 12:
                                    System.out.println("\n--- Menghitung Limas Trapesium  ---");

                                    System.out.print("Masukkan nilai alas atas Trapesium : ");
                                    double alasAtasTrapesiumL = input.nextDouble();

                                    System.out.print("Masukkan nilai alas bawah Trapesium : ");
                                    double alasBawahTrapesiumL = input.nextDouble();

                                    System.out.print("Masukkan nilai sisi miring Trapesium : ");
                                    double sisiMiringTrapesiumL = input.nextDouble();

                                    System.out.print("Masukkan nilai tinggi Trapesium : ");
                                    double tinggiTrapesiumL = input.nextDouble();

                                    System.out.print("Masukkan nilai tinggi Limas Trapesium : ");
                                    double tinggiLimasTrapesium = input.nextDouble();

                                    LimasTrapesium limasTrapesium = new LimasTrapesium(alasAtasTrapesiumL, alasBawahTrapesiumL, sisiMiringTrapesiumL, tinggiTrapesiumL, tinggiLimasTrapesium);
                                    System.out.println("Volume Limas Trapesium = " + limasTrapesium.hitungVolume());
                                    System.out.println("Luas Permukaan Limas Trapesium = " + limasTrapesium.hitungLuasPermukaan());
                                    break;
                                case 13:
                                    System.out.println("\n--- Menghitung Prisma Trapesium  ---");

                                    System.out.print("Masukkan nilai alas atas Trapesium : ");
                                    double alasAtasTrapesiumP = input.nextDouble();

                                    System.out.print("Masukkan nilai alas bawah Trapesium : ");
                                    double alasBawahTrapesiumP = input.nextDouble();

                                    System.out.print("Masukkan nilai sisi miring Trapesium : ");
                                    double sisiMiringTrapesiumP = input.nextDouble();

                                    System.out.print("Masukkan nilai tinggi Trapesium : ");
                                    double tinggiTrapesiumP = input.nextDouble();

                                    System.out.print("Masukkan nilai tinggi Prisma Trapesium : ");
                                    double tinggiPrismaTrapesium = input.nextDouble();

                                    PrismaTrapesium prismaTrapesium = new PrismaTrapesium(alasAtasTrapesiumP, alasBawahTrapesiumP, sisiMiringTrapesiumP, tinggiTrapesiumP, tinggiPrismaTrapesium);
                                    System.out.println("Volume Prisma Trapesium = " + prismaTrapesium.hitungVolume());
                                    System.out.println("Luas Permukaan Prisma Trapesium = " + prismaTrapesium.hitungLuasPermukaan());
                                    break;
                                case 14:
                                    System.out.println("\n--- Menghitung Balok ---");

                                    System.out.print("Masukkan nilai panjang balok : ");
                                    double panjangBalok = input.nextDouble();

                                    System.out.print("Masukkan nilai lebar balok : ");
                                    double lebarBalok = input.nextDouble();

                                    System.out.print("Masukkan nilai tinggi balok : ");
                                    double tinggiBalok = input.nextDouble();

                                    Balok balok = new Balok(panjangBalok, lebarBalok, tinggiBalok);
                                    System.out.println("Volume Balok = " + balok.hitungVolume());
                                    System.out.println("Luas Permukaan Balok = " + balok.hitungLuasPermukaan());
                                    break;
                                case 15:
                                    System.out.println("\n--- Menghitung Limas Persegi Panjang ---");

                                    System.out.print("Masukkan nilai panjang Limas Persegi Panjang : ");
                                    double panjangLimasPersegiPanjang = input.nextDouble();

                                    System.out.print("Masukkan nilai lebar Limas Persegi Panjang : ");
                                    double lebarLimasPersegiPanjang = input.nextDouble();

                                    System.out.print("Masukkan nilai tinggi Limas Persegi Panjang : ");
                                    double tinggiLimasPersegiPanjang = input.nextDouble();

                                    LimasPersegiPanjang limasPersegiPanjang = new LimasPersegiPanjang(panjangLimasPersegiPanjang, lebarLimasPersegiPanjang, tinggiLimasPersegiPanjang);
                                    System.out.println("Volume Limas Persegi Panjang = " + limasPersegiPanjang.hitungVolume());
                                    System.out.println("Luas Permukaan Limas Persegi Panjang = " + limasPersegiPanjang.hitungLuasPermukaan());
                                    break;
                                case 16:
                                    System.out.println("\n--- Menghitung Prisma Persegi Panjang ---");

                                    System.out.print("Masukkan nilai panjang Prisma Persegi Panjang : ");
                                    double panjangPrismaPersegiPanjang = input.nextDouble();

                                    System.out.print("Masukkan nilai lebar Prisma Persegi Panjang : ");
                                    double lebarPrismaPersegiPanjang = input.nextDouble();

                                    System.out.print("Masukkan nilai tinggi Prisma Persegi Panjang : ");
                                    double tinggiPrismaPersegiPanjang = input.nextDouble();

                                    PrismaPersegiPanjang prismaPersegiPanjang = new PrismaPersegiPanjang(panjangPrismaPersegiPanjang, lebarPrismaPersegiPanjang, tinggiPrismaPersegiPanjang);
                                    System.out.println("Volume Prisma Persegi Panjang = " + prismaPersegiPanjang.hitungVolume());
                                    System.out.println("Luas Permukaan Prisma Persegi Panjang = " + prismaPersegiPanjang.hitungLuasPermukaan());
                                    break;
                                case 17:
                                    System.out.println("\n--- Menghitung Bola ---");

                                    System.out.print("Masukkan nilai jari-jari bola : ");
                                    double jariJariBola = input.nextDouble();

                                    Bola bola = new Bola(jariJariBola);
                                    System.out.println("Volume Bola = " + bola.hitungVolume());
                                    System.out.println("Luas Permukaan Bola = " + bola.hitungLuasPermukaan());
                                    break;
                                case 18:
                                   System.out.println("\n--- Menghitung Cincin Bola ---");

                                   System.out.print("Masukkan nilai jari-jari luar cincin bola : ");
                                   double jariJariLuarCincin = input.nextDouble();

                                   System.out.print("Masukkan nilai tinggi cincin bola : ");
                                   double tinggiCincin = input.nextDouble();

                                   CincinBola cincinBola = new CincinBola(jariJariLuarCincin, tinggiCincin);
                                   System.out.println("Volume Cincin Bola = " + cincinBola.hitungVolume());
                                   System.out.println("Luas Permukaan Cincin Bola = " + cincinBola.hitungLuasPermukaan());
                                    break;
                                case 19:
                                   System.out.println("\n--- Menghitung Juring Bola ---");

                                   System.out.print("Masukkan nilai jari-jari juring bola : ");
                                   double jariJariJuring = input.nextDouble();

                                   System.out.print("Masukkan nilai sudut juring bola (dalam derajat): ");
                                   double sudutJuring = input.nextDouble();

                                   JuringBola
                                    juringBola = new JuringBola(jariJariJuring, sudutJuring);
                                   System.out.println("Volume Juring Bola = " + juringBola.hitungVolume());
                                   System.out.println("Luas Permukaan Juring Bola = " + juringBola.hitungLuasPermukaan());
                                    break;
                                case 20:
                                    System.out.println("\n--- Menghitung Tembereng Bola ---");

                                    System.out.print("Masukkan nilai jari-jari tembereng bola : ");
                                    double jariJariTembereng = input.nextDouble();

                                    System.out.print("Masukkan nilai tinggi tembereng bola : ");
                                    double tinggiTembereng = input.nextDouble();

                                    TemberengBola temberengBola = new TemberengBola(jariJariTembereng, tinggiTembereng);
                                    System.out.println("Volume Tembereng Bola = " + temberengBola.hitungVolume());
                                    System.out.println("Luas Permukaan Tembereng Bola = " + temberengBola.hitungLuasPermukaan());
                                    break;
                                case 21:
                                    System.out.println("\n--- Menghitung Kerucut ---");

                                    System.out.print("Masukkan nilai jari-jari kerucut : ");
                                    double jariJariKerucut = input.nextDouble();

                                    System.out.print("Masukkan nilai tinggi kerucut : ");
                                    double tinggiKerucut = input.nextDouble();

                                    Kerucut kerucut = new Kerucut(jariJariKerucut, tinggiKerucut);
                                    System.out.println("Volume Kerucut = " + kerucut.hitungVolume());
                                    System.out.println("Luas Permukaan Kerucut = " + kerucut.hitungLuasPermukaan());
                                    break;
                                case 22:
                                    System.out.println("\n--- Menghitung Kerucut Terpancung ---");

                                    System.out.print("Masukkan nilai jari-jari atas kerucut terpancung : ");
                                    double jariJariAtasKerucut = input.nextDouble();

                                    System.out.print("Masukkan nilai jari-jari bawah kerucut terpancung : ");
                                    double jariJariBawahKerucut = input.nextDouble();

                                    System.out.print("Masukkan nilai tinggi kerucut terpancung : ");
                                    double tinggiKerucutTerpancung = input.nextDouble();

                                    KerucutTerpancung kerucutTerpancung = new KerucutTerpancung(jariJariAtasKerucut, jariJariBawahKerucut, tinggiKerucutTerpancung);
                                    System.out.println("Volume Kerucut Terpancung = " + kerucutTerpancung.hitungVolume());
                                    System.out.println("Luas Permukaan Kerucut Terpancung = " + kerucutTerpancung.hitungLuasPermukaan());
                                    break;
                                case 23:
                                    System.out.println("\n--- Menghitung Tabung ---");

                                    System.out.print("Masukkan nilai jari-jari tabung : ");
                                    double jariJariTabung = input.nextDouble();

                                    System.out.print("Masukkan nilai tinggi tabung : ");
                                    double tinggiTabung = input.nextDouble();

                                    Tabung tabung = new Tabung(jariJariTabung, tinggiTabung);
                                    System.out.println("Volume Tabung = " + tabung.hitungVolume());
                                    System.out.println("Luas Permukaan Tabung = " + tabung.hitungLuasPermukaan());
                                    break;
                                default:
                                    System.out.println("Pilihan bangun ruang tidak valid.");
                            }
                            break;
                        case 3:
                            System.out.println("=== Hitung Keseluruhan ===");
                            System.out.println("\n=== Bagun Datar ===");
                            
                            try{
                                JajarGenjang jajarGenjang = new JajarGenjang(10,7,5,6);
                                System.out.println("\n-> Jajar Genjang \nalas = 10 & tinggi = 7 & sisi A = 5 & sisi B = 6");
                                System.out.println("Luas Jajar Genjang : " + jajarGenjang.hitungLuas()); 
                                System.out.println("Keliling Jajar Genjang : " + jajarGenjang.hitungKeliling());
                            } catch(Exception e){
                                System.out.println("Jajar Genjang tidak bisa dibuat dengan nilai alas dan tinggi bernilai 0 dan negatif!");
                            }
                            
                            // Belah Ketupat
                            try{
                                BelahKetupat belahKetupat = new BelahKetupat(3,4,5);
                                System.out.println("\n-> Belah Ketupat \nsisi = 3 & diagonal= 4.2");
                                System.out.println("Luas Belah Ketupat : " + belahKetupat.hitungLuas()); 
                                System.out.println("Keliling Belah Ketupat : " + belahKetupat.hitungKeliling());
                            } catch(Exception e){
                                System.out.println("Belah Ketupat tidak bisa dibuat dengan nilai diagonal dan sisi yang kurang dari 0 dan negatif! ");
                            }
                            
                            // Layang-Layang
                            try{
                                LayangLayang layangLayang = new LayangLayang(20,10,12,22);
                                System.out.println("\n-> Layang-layang\ndiagonal1 = 20 & diagonal2 = 10 & sisi pendek = 12 & sisi pendek 22");
                                System.out.println("Luas Layang-layang : " + layangLayang.hitungLuas()); 
                                System.out.println("Keliling Layang-layang : " + layangLayang.hitungKeliling());
                            } catch(Exception e){
                                System.out.println("Layang-layang tidak bisa dibuat dengan nilai diagonal dan sisi yang kurang dari 0 dan negatif!");
                            }
                            
                            // Persegi
                            try{
                                Persegi persegi = new Persegi(10);
                                System.out.println("\n-> Persegi\nsisi = 22");
                                System.out.println("Luas Persegi : " + persegi.hitungLuas()); 
                                System.out.println("Keliling Persegi: " + persegi.hitungKeliling());
                            } catch(Exception e){
                                System.out.println("Persegi tidak bisa dibuat dengan nilai sisi yang kurang dari 0 dan negatif!");
                            }
                            
                            // Persegi Panjang
                            try{
                                PersegiPanjang persegiPanjang = new PersegiPanjang(12,10);
                                System.out.println("\n-> Persegi Panjang \npanjang= 12 & lebar = 10");
                                System.out.println("Luas Persegi Panjang : " + persegiPanjang.hitungLuas());
                                System.out.println("Keliling Persegi Panjang: " + persegiPanjang.hitungKeliling());
                            } catch(Exception e){
                                System.out.println("Persegi Panjang tidak bisa dibuat dengan nilai panjang dan lebar yang kurang dari 0 dan negatif!");
                            }
                            
                            // Segitiga
                            try{
                                Segitiga segitiga = new Segitiga(12,10);
                                System.out.println("\n-> Segitiga \n alas= 12 & tinggi= 10");
                                System.out.println("Luas Segitiga : " + segitiga.hitungLuas()); 
                                System.out.println("Keliling Segitiga: " + segitiga.hitungKeliling());
                            } catch(Exception e){
                                System.out.println("Segitiga tidak bisa dibuat dengan nilai alas dan tinggi yang kurang dari 0 dan negatif!");
                            }
                            
                            // Trapesium
                            try{
                                Trapesium trapesium = new Trapesium(10,14,8,6);
                                System.out.println("\n-> Trapesium \n alas atas = 10 & alas bawah = 14 & sisi miring = 8 & tinggi = 6");
                                System.out.println("Luas Trapesium : " + trapesium.hitungLuas()); 
                                System.out.println("Keliling Trapesium : " + trapesium.hitungKeliling());
                            } catch(Exception e){
                                System.out.println("Trapesium tidak bisa dibuat dengan nilai alas atas, alas bawah, sisi miring dan  tinggi yang kurang dari 0 dan negatif!");
                            }
                            
                            // Lingkaran
                            try{
                                Lingkaran lingkaran = new Lingkaran(7);
                                System.out.println("\n-> Lingkaran \n jari-jari = 14");
                                System.out.println("Luas Lingkaran : " + lingkaran.hitungLuas()); 
                                System.out.println("Keliling Lingkaran : " + lingkaran.hitungKeliling());
                            } catch(Exception e){
                                System.out.println("Lingkaran tidak bisa dibuat dengan nilai jari- jari yang kurang dari 0 dan negatif!");
                            }
                            
                            // Juring Lingkaran
                            try{
                                JuringLingkaran juring = new JuringLingkaran(7, 90);
                                System.out.println("\n-> JuringLingkaran\n jari-jari = 7 & sudut 90 derajat");
                                System.out.println("Luas JuringLingkaran: " + juring.hitungLuas()); 
                                System.out.println("Keliling JuringLingkaran: " + juring.hitungKeliling());
                            } catch(Exception e){
                                System.out.println("Juring Lingkaran tidak bisa dibuat dengan nilai jari- jari  yang kurang dari 0 dan negatif!");
                            }
                            
                            // Tembereng Lingkaran
                            try{
                                TemberengLingkaran tembereng = new TemberengLingkaran(7, 90);
                                System.out.println("\n->Tembereng Lingkaran\n jari-jari = 7 & sudut 90 derajat");
                                System.out.println("Luas Tembereng Lingkaran: " + tembereng.hitungLuas());
                                System.out.println("Keliling Tembereng Lingkaran: " + tembereng.hitungKeliling());
                            } catch(Exception e){
                                System.out.println("Tembereng Lingkaran tidak bisa dibuat dengan nilai jari- jari  yang kurang dari 0 dan negatif!");
                            }

                            // Kubus
                            try{
                                Kubus kubus = new Kubus(5);
                                System.out.println("\n-> Kubus\n sisi = 5");
                                System.out.println("Luas Kubus : " + kubus.hitungLuas());
                                System.out.println("Volume Kubus : " + kubus.hitungVolume());
                            } catch(Exception e){
                                System.out.println("Kubus tidak bisa dibuat dengan nilai sisi yang kurang dari 0 dan negatif!");
                            }

                            //limas Persegi
                            try{
                                LimasPersegi limasPersegi = new LimasPersegi(5, 10);
                                System.out.println("\n-> Limas Persegi\n sisi = 5 & tinggi = 10");
                                System.out.println("Luas Limas Persegi : " + limasPersegi.hitungLuas());
                                System.out.println("Volume Limas Persegi : " + limasPersegi.hitungVolume());
                            } catch(Exception e){
                                System.out.println("Limas Persegi tidak bisa dibuat dengan nilai sisi dan tinggi yang kurang dari 0 dan negatif!");
                            }

                            // Prisma Persegi
                            try{
                                PrismaPersegi prismaPersegi = new PrismaPersegi(5, 10);
                                System.out.println("\n-> Prisma Persegi\n sisi = 5 & tinggi = 10");
                                System.out.println("Luas Prisma Persegi : " + prismaPersegi.hitungLuas());
                                System.out.println("Volume Prisma Persegi : " + prismaPersegi.hitungVolume());
                            } catch(Exception e){
                                System.out.println("Prisma Persegi tidak bisa dibuat dengan nilai sisi dan tinggi yang kurang dari 0 dan negatif!");
                            }
                        
                            //limas belah ketupat
                            try{
                                LimasBelahKetupat limasBelahKetupat = new LimasBelahKetupat(5, 10, 6, 10);
                                System.out.println("\n-> Limas Belah Ketupat\n diagonal1 = 5 & diagonal2 = 10 & sisi = 6 & tinggi = 10");
                                System.out.println("Luas Limas Belah Ketupat : " + limasBelahKetupat.hitungLuas());
                                System.out.println("Volume Limas Belah Ketupat : " + limasBelahKetupat.hitungVolume());
                            } catch(Exception e){
                                System.out.println("Limas Belah Ketupat tidak bisa dibuat dengan nilai diagonal, sisi dan tinggi yang kurang dari 0 dan negatif!");
                            }

                            // Prisma Belah Ketupat
                            try{
                                PrismaBelahKetupat prismaBelahKetupat = new PrismaBelahKetupat(5, 10, 6, 10);
                                System.out.println("\n-> Prisma Belah Ketupat\n diagonal1 = 5 & diagonal2 = 10 & sisi = 6 & tinggi = 10");
                                System.out.println("Luas Prisma Belah Ketupat : " + prismaBelahKetupat.hitungLuas());
                                System.out.println("Volume Prisma Belah Ketupat : " + prismaBelahKetupat.hitungVolume());
                            } catch(Exception e){
                                System.out.println("Prisma Belah Ketupat tidak bisa dibuat dengan nilai diagonal, sisi dan tinggi yang kurang dari 0 dan negatif!");
                            }

                            //limas layang-layang
                            try{
                                LimasLayangLayang limasLayangLayang = new LimasLayangLayang(5, 10, 6, 10, 10);
                                System.out.println("\n-> Limas Layang-Layang\n diagonal1 = 5 & diagonal2 = 10 & sisi pendek = 6 & sisi panjang = 10 & tinggi = 10");
                                System.out.println("Luas Limas Layang-Layang : " + limasLayangLayang.hitungLuas());
                                System.out.println("Volume Limas Layang-Layang : " + limasLayangLayang.hitungVolume());
                            } catch(Exception e){
                                System.out.println("Limas Layang-Layang tidak bisa dibuat dengan nilai diagonal, sisi panjang, sisi pendek dan tinggi yang kurang dari 0 dan negatif!");
                            }

                            //prisma layang-layang
                            try{
                                PrismaLayangLayang prismaLayangLayang = new PrismaLayangLayang(5, 10, 6, 10, 10);
                                System.out.println("\n-> Prisma Layang-Layang\n diagonal1 = 5 & diagonal2 = 10 & sisi pendek = 6 & sisi panjang = 10 & tinggi = 10");
                                System.out.println("Luas Prisma Layang-Layang : " + prismaLayangLayang.hitungLuas());
                                System.out.println("Volume Prisma Layang-Layang : " + prismaLayangLayang.hitungVolume());
                            } catch(Exception e){
                                System.out.println("Prisma Layang-Layang tidak bisa dibuat dengan nilai diagonal, sisi panjang, sisi pendek dan tinggi yang kurang dari 0 dan negatif!");
                            }

                            // Limas Segitiga
                            try{
                                LimasSegitiga limasSegitiga = new LimasSegitiga(5, 10, 10);
                                System.out.println("\n-> Limas Segitiga\n alas = 5 & tinggi = 10 & tinggi limas = 10");
                                System.out.println("Luas Limas Segitiga : " + limasSegitiga.hitungLuas());
                                System.out.println("Volume Limas Segitiga : " + limasSegitiga.hitungVolume());
                            } catch(Exception e){
                                System.out.println("Limas Segitiga tidak bisa dibuat dengan nilai alas, tinggi dan tinggi limas yang kurang dari 0 dan negatif!");
                            }

                            // Prisma Segitiga
                            try{
                                PrismaSegitiga prismaSegitiga = new PrismaSegitiga(5, 10, 10);
                                System.out.println("\n-> Prisma Segitiga\n alas = 5 & tinggi = 10 & tinggi prisma = 10");
                                System.out.println("Luas Prisma Segitiga : " + prismaSegitiga.hitungLuas());
                                System.out.println("Volume Prisma Segitiga : " + prismaSegitiga.hitungVolume());
                            } catch(Exception e){
                                System.out.println("Prisma Segitiga tidak bisa dibuat dengan nilai alas, tinggi dan tinggi prisma yang kurang dari 0 dan negatif!");
                            }

                            // Limas Jajar Genjang
                            try{
                                LimasJajarGenjang limasJajarGenjang = new LimasJajarGenjang(6, 10, 5, 5, 10);
                                System.out.println("\n-> Limas Jajar Genjang\n alas = 6 & tinggi = 10 & sisiA = 5 & sisiB = 5 & tinggi limas = 10");
                                System.out.println("Luas Limas Jajar Genjang : " + limasJajarGenjang.hitungLuas());
                                System.out.println("Volume Limas Jajar Genjang : " + limasJajarGenjang.hitungVolume());
                            } catch(Exception e){
                                System.out.println("Limas Jajar Genjang tidak bisa dibuat dengan nilai alas, tinggi, sisiA, sisiB, dan tinggi limas yang kurang dari 0 dan negatif!");
                            }

                            //Prisma Jajar Genjang
                            try{
                                PrismaJajarGenjang prismaJajarGenjang = new PrismaJajarGenjang(6, 10, 5, 5, 10);
                                System.out.println("\n-> Prisma Jajar Genjang\n alas = 6 & tinggi = 10 & sisiA = 5 & sisiB = 5 & tinggi prisma = 10");
                                System.out.println("Luas Prisma Jajar Genjang : " + prismaJajarGenjang.hitungLuas());
                                System.out.println("Volume Prisma Jajar Genjang : " + prismaJajarGenjang.hitungVolume());
                            } catch(Exception e){
                                System.out.println("Prisma Jajar Genjang tidak bisa dibuat dengan nilai alas, tinggi, sisiA, sisiB, dan tinggi prisma yang kurang dari 0 dan negatif! ");
                            }

                            //Limas Trapesium
                            try{
                                LimasTrapesium limasTrapesium = new LimasTrapesium(5, 10, 6, 10, 15);
                                System.out.println("\n-> Limas Trapesium\n alas atas = 5 & alas bawah = 10 & sisi miring = 6 & tinggi = 10 & tinggi limas = 15");
                                System.out.println("Luas Limas Trapesium : " + limasTrapesium.hitungLuas());
                                System.out.println("Volume Limas Trapesium : " + limasTrapesium.hitungVolume());
                            } catch(Exception e){
                                System.out.println("Limas Trapesium tidak bisa dibuat dengan nilai alas atas, alas bawah, sisi miring, tinggi, dan tinggi limas yang kurang dari 0 dan negatif!");
                            }

                            //Prisma Trapesium
                            try{
                                PrismaTrapesium prismaTrapesium = new PrismaTrapesium(5, 10, 6, 10, 15);
                                System.out.println("\n-> Prisma Trapesium\n alas atas = 5 & alas bawah = 10 & sisi miring = 6 & tinggi = 10 & tinggi prisma = 15");
                                System.out.println("Luas Prisma Trapesium : " + prismaTrapesium.hitungLuas());
                                System.out.println("Volume Prisma Trapesium : " + prismaTrapesium.hitungVolume());
                            } catch(Exception e){
                                System.out.println("Prisma Trapesium tidak bisa dibuat dengan nilai alas atas, alas bawah, sisi miring, tinggi, dan tinggi prisma yang kurang dari 0 dan negatif!");
                            }

                            // Balok
                            try{
                                Balok balok = new Balok(5, 10, 15);
                                System.out.println("\n-> Balok\n panjang = 5 & lebar = 10 & tinggi = 15");
                                System.out.println("Luas Balok : " + balok.hitungLuas());
                                System.out.println("Volume Balok : " + balok.hitungVolume());
                            } catch(Exception e){
                                System.out.println("Balok tidak bisa dibuat dengan nilai panjang, lebar, dan tinggi yang kurang dari 0 dan negatif!");
                            }

                            // Limas Persegi Panjang
                            try{
                                LimasPersegiPanjang limasPersegiPanjang = new LimasPersegiPanjang(5, 10, 15);
                                System.out.println("\n-> Limas Persegi Panjang\n panjang = 5 & lebar = 10 & tinggi = 15");
                                System.out.println("Luas Limas Persegi Panjang : " + limasPersegiPanjang.hitungLuas());
                                System.out.println("Volume Limas Persegi Panjang : " + limasPersegiPanjang.hitungVolume());
                            } catch(Exception e){
                                System.out.println("Limas Persegi Panjang tidak bisa dibuat dengan nilai panjang, lebar, dan tinggi yang kurang dari 0 dan negatif!");
                            }

                            // Prisma Persegi Panjang
                            try{
                                PrismaPersegiPanjang prismaPersegiPanjang = new PrismaPersegiPanjang(5, 10, 15);
                                System.out.println("\n-> Prisma Persegi Panjang\n panjang = 5 & lebar = 10 & tinggi = 15");
                                System.out.println("Luas Prisma Persegi Panjang : " + prismaPersegiPanjang.hitungLuas());
                                System.out.println("Volume Prisma Persegi Panjang : " + prismaPersegiPanjang.hitungVolume());
                            } catch(Exception e){
                                System.out.println("Prisma Persegi Panjang tidak bisa dibuat dengan nilai panjang, lebar, dan tinggi yang kurang dari 0 dan negatif!");
                            }

                            // Bola
                            try{
                                Bola bola = new Bola(7);
                                System.out.println("\n-> Bola\n jari-jari = 7");
                                System.out.println("Luas Bola : " + bola.hitungLuas());
                                System.out.println("Volume Bola : " + bola.hitungVolume());
                            } catch(Exception e){
                                System.out.println("Bola tidak bisa dibuat dengan nilai jari-jari yang kurang dari 0 dan negatif!");
                            }

                            // Cincin Bola
                            try{
                                CincinBola cincinBola = new CincinBola(10, 5);
                                System.out.println("\n-> Cincin Bola\n jari-jari luar = 10 & tinggi = 5");
                                System.out.println("Luas Cincin Bola : " + cincinBola.hitungLuas());
                                System.out.println("Volume Cincin Bola : " + cincinBola.hitungVolume());
                            } catch(Exception e){
                                System.out.println("Cincin Bola tidak bisa dibuat dengan nilai jari-jari luar dan tinggi yang kurang dari 0 dan negatif!");
                            }

                            // Juring Bola
                            try{
                                JuringBola juringBola = new JuringBola(7, 90);
                                System.out.println("\n-> Juring Bola\n jari-jari = 7 & sudut = 90 derajat");
                                System.out.println("Luas Juring Bola : " + juringBola.hitungLuas());
                                System.out.println("Volume Juring Bola : " + juringBola.hitungVolume());
                            } catch(Exception e){
                                System.out.println("Juring Bola tidak bisa dibuat dengan nilai jari-jari dan sudut yang kurang dari 0 dan negatif!");
                            }

                            // Tembereng Bola
                            try{
                                TemberengBola temberengBola = new TemberengBola(7, 5);
                                System.out.println("\n-> Tembereng Bola\n jari-jari = 7 & tinggi = 5");
                                System.out.println("Luas Tembereng Bola : " + temberengBola.hitungLuas());
                                System.out.println("Volume Tembereng Bola : " + temberengBola.hitungVolume());
                            } catch(Exception e){
                                System.out.println("Tembereng Bola tidak bisa dibuat dengan nilai jari-jari dan tinggi yang kurang dari 0 dan negatif!");
                            }

                            // Kerucut
                            try{
                                Kerucut kerucut = new Kerucut(7, 10);
                                System.out.println("\n-> Kerucut\n jari-jari = 7 & tinggi = 10");
                                System.out.println("Luas Kerucut : " + kerucut.hitungLuas());
                                System.out.println("Volume Kerucut : " + kerucut.hitungVolume());
                            } catch(Exception e){
                                System.out.println("Kerucut tidak bisa dibuat dengan nilai jari-jari dan tinggi yang kurang dari 0 dan negatif!");
                            }

                            // Kerucut Terpancung
                            try{
                                KerucutTerpancung kerucutTerpancung = new KerucutTerpancung(5, 10, 15);
                                System.out.println("\n-> Kerucut Terpancung\n jari-jari atas = 5 & jari-jari bawah = 10 & tinggi = 15");
                                System.out.println("Luas Kerucut Terpancung : " + kerucutTerpancung.hitungLuas());
                                System.out.println("Volume Kerucut Terpancung : " + kerucutTerpancung.hitungVolume());
                            } catch(Exception e){
                                System.out.println("Kerucut Terpancung tidak bisa dibuat dengan nilai jari-jari atas, jari-jari bawah, dan tinggi yang kurang dari 0 dan negatif!");
                            }

                            // Tabung
                            try{
                                Tabung tabung = new Tabung(7, 10);
                                System.out.println("\n-> Tabung\n jari-jari = 7 & tinggi = 10");
                                System.out.println("Luas Tabung : " + tabung.hitungLuas());
                                System.out.println("Volume Tabung : " + tabung.hitungVolume());
                            } catch(Exception e){
                                System.out.println("Tabung tidak bisa dibuat dengan nilai jari-jari dan tinggi yang kurang dari 0 dan negatif!");
                            }
                            break;
                        case 4:
                            System.out.println("Keluar dari program. Terima kasih!");
                            break;
                        default:
                            System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Input tidak valid. Harap masukkan angka sesuai pilihan.");
                    input.nextLine(); 
                    pilihan = 0; 
                }
            } while (pilihan != 4);
        } 
        System.out.println("Program telah berakhir.");
    }
}