package geometri;

public class Tabung extends Lingkaran {
    private double tinggi;
    private double volume;
    private double luasPermukaan;

    public Tabung(double jariJari, double tinggi) {
        super(jariJari);
        this.tinggi = tinggi;
        this.hitungVolume();
        this.hitungLuasPermukaan();
    }

    public double hitungVolume() {
        volume =  super.luas * tinggi;
        return volume;
    }

    public double hitungLuasPermukaan() {
        luasPermukaan =  2 * super.luas + super.keliling * tinggi;
        return luasPermukaan;
    }
}
