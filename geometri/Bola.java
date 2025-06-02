package geometri;

public class Bola extends Lingkaran {
    protected double volume;
    protected double luasPermukaan;

    public Bola(double jariJari) {
        super(jariJari);
        this.hitungVolume();
        this.hitungLuasPermukaan();
    }

    public double hitungVolume() {
        double r = super.getJariJari();
        volume = (4.0 / 3.0) * super.getPI() * r * r * r;
        return volume;
    }

    public double hitungLuasPermukaan() {
        luasPermukaan = 4 * super.luas;
        return luasPermukaan;
    }
}


