package geometri;

public class KerucutTerpancung extends Kerucut {
    private double jariJariAtas;
    private double tinggiTerpancung;

    public KerucutTerpancung(double jariJariBawah, double jariJariAtas, double tinggiTerpancung) {
        super(jariJariBawah, hitungTinggiKerucutUtuh(jariJariBawah, jariJariAtas, tinggiTerpancung));
        this.jariJariAtas = jariJariAtas;
        this.tinggiTerpancung = tinggiTerpancung;
    }

    private static double hitungTinggiKerucutUtuh(double rBawah, double rAtas, double tTerpancung) {
        return (rBawah * tTerpancung) / (rBawah - rAtas);
    }

    public double hitungVolume() {
        double r1 = super.getJariJari();
        double r2 = jariJariAtas;
        double t = tinggiTerpancung;
        return (1.0 / 3.0) * super.getPI() * t * (r1 * r1 + r1 * r2 + r2 * r2);
    }

    public double hitungLuasPermukaan() {
        double r1 = super.getJariJari();
        double r2 = jariJariAtas;
        double s = Math.sqrt(Math.pow(tinggiTerpancung, 2) + Math.pow(r1 - r2, 2));
        double selimut = super.getPI() * (r1 + r2) * s;
        double alasBawah = super.getPI() * r1 * r1;
        double alasAtas = super.getPI() * r2 * r2;
        return selimut + alasBawah + alasAtas;
    }
}
