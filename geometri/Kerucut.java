package geometri;

public class Kerucut extends Lingkaran {
    private double tinggi;
    protected double volume;
    protected double luasPermukaan;

    public Kerucut(double jariJari, double tinggi) {
        super(jariJari);
        this.tinggi = tinggi;
        this.hitungVolume();
        this.hitungLuasPermukaan();
    }

    public double hitungVolume() {
        double r = super.getJariJari();
        volume = (1.0 / 3.0) * super.getPI() * r * r * tinggi;
        return volume;
    }

    public double hitungLuasPermukaan() {
        double r = super.getJariJari();
        double s = Math.sqrt(r * r + tinggi * tinggi); 
        luasPermukaan = super.getPI() * r * (r + s);
        return luasPermukaan;
    }
}
