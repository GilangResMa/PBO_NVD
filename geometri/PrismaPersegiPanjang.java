package geometri;

public class PrismaPersegiPanjang extends PersegiPanjang{
    private double tinggi;
    private double volume;
    private double luasPermukaan;

    public PrismaPersegiPanjang(double panjang, double lebar, double tinggi) {
        super(panjang, lebar);
        this.tinggi = tinggi;
        this.hitungVolume();
        this.hitungLuasPermukaan();
    }

    public double hitungVolume() {
        volume = super.luas * tinggi;
        return volume;
    }

    public double hitungLuasPermukaan() {
        double luasAlas = super.luas;
        double kelilingAlas = super.keliling;
        luasPermukaan =  2 * luasAlas + kelilingAlas * tinggi;
        return luasPermukaan;
    }
}
