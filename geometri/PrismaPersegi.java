package geometri;

public class PrismaPersegi extends Persegi {
    private Persegi alas;
    private double tinggi;
    private double volume;
    private double luasPermukaan;

    public PrismaPersegi(double sisi, double tinggi) {
        super(sisi);
        this.tinggi = tinggi;
        this.hitungVolume();
        this.hitungLuasPermukaan();
    }

    public double hitungVolume() {
        volume  =  super.luas * tinggi;
        return volume;
    }

    public double hitungLuasPermukaan() {
        luasPermukaan = 2 * super.luas + super.keliling * tinggi;
        return luasPermukaan;
    }
}
