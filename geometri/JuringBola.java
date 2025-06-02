package geometri;

public class JuringBola extends Bola {
    private double sudutDerajat;
    private double volume;
    private double luasPermukaan;

    public JuringBola(double jariJari, double sudutDerajat) {
        super(jariJari);
        this.sudutDerajat = sudutDerajat;
    }

    public double hitungVolume() {
        double Vbola = super.hitungVolume();
        volume = (sudutDerajat / 360.0) * Vbola;
        return volume;
    }

    public double hitungLuasPermukaan() {
        double Lbola = super.hitungLuasPermukaan();
        luasPermukaan = (sudutDerajat / 360.0) * Lbola;
        return luasPermukaan;
    }

}
