package geometri;

public class CincinBola extends Bola {
    private double tinggiCincin;
    private double volume;
    private double luasPermukaan;

    public CincinBola(double jariJari, double tinggiCincin) {
        super(jariJari);
        this.tinggiCincin = tinggiCincin;
    }

    public double hitungVolume() {
        double h = tinggiCincin;
        double r = super.getJariJari();
        volume = super.getPI() * h * h * (r - h / 3.0);
        return volume;
    }

    public double hitungLuasPermukaan() {
        double h = tinggiCincin;
        double r = super.getJariJari();
        luasPermukaan = 2 * super.getPI() * r * h;
        return luasPermukaan;
    }
}
