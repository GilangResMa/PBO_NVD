package geometri;

public class LimasPersegi extends Persegi {
    private double tinggi;
    private double volume;
    private double luasPermukaan;

    public LimasPersegi(double sisi, double tinggi) {
        super(sisi);
        this.tinggi = tinggi;
        this.hitungVolume();
        this.hitungLuasPermukaan();
    }

    public double hitungVolume() {
        volume =  (1.0 / 3.0) * super.luas * tinggi;
    return volume;
    }

    public double hitungLuasPermukaan() {
        double tinggiSegitiga = Math.sqrt(Math.pow((super.getSisi() / 2), 2) + Math.pow(tinggi, 2));
        double luasSegitiga = 0.5 * super.getSisi() * tinggiSegitiga;
        luasPermukaan =  super.luas + 4 * luasSegitiga;
        return luasPermukaan;
    }
}
