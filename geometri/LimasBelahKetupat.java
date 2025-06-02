package geometri;


public class LimasBelahKetupat extends BelahKetupat {
    private double tinggi;
    private double volume;
    private double luasPermukaan;

    public LimasBelahKetupat(double diagonal1, double diagonal2, double sisi, double tinggi) {
        super(diagonal1, diagonal2, sisi);
        this.tinggi = tinggi;
        this.hitungVolume();
        this.hitungLuasPermukaan();
    }

    public double hitungLuasPermukaan() {
        double luasAlas = super.luas;
        double setengahDiagonal1 = super.diagonal1 / 2.0;
        double setengahDiagonal2 = super.diagonal2 / 2.0;
        double tinggiSegitiga = Math.sqrt(tinggi * tinggi + setengahDiagonal1 * setengahDiagonal2);
        double luasSegitiga = 0.5 * super.sisi * tinggiSegitiga;
        luasPermukaan =  luasAlas + 4 * luasSegitiga;
        return luasPermukaan;
    }

    public double hitungVolume() {
        volume =  (1.0 / 3.0) * super.luas * tinggi;
        return volume;
    }
}
