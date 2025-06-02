package geometri;

public class TemberengBola extends Bola {
    private double tinggiTembereng;
    private double volume;
    private double luasPermukaan;

    public TemberengBola(double jariJari, double tinggiTembereng) {
        super(jariJari);
        this.tinggiTembereng = tinggiTembereng;
        this.hitungVolume();
        this.hitungLuasPermukaan();
    }

    public double hitungVolume() {
        double r = super.getJariJari();
        double h = tinggiTembereng;
        volume = (1.0 / 6.0) * super.getPI() * h * (3 * r * r + h * h);
        return volume;
    }

    public double hitungLuasPermukaan() {
        double r = super.getJariJari();
        double h = tinggiTembereng;
        luasPermukaan = 2 * super.getPI() * r * h;
        return luasPermukaan;
    }
}
