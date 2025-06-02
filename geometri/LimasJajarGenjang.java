package geometri;

public class LimasJajarGenjang extends JajarGenjang {
    private double tinggiLimas;
    private double volume;
    private double luasPermukaan;

    public LimasJajarGenjang(double alas, double tinggi, double sisiA, double sisiB, double tinggiLimas) {
        super(alas, tinggi, sisiA, sisiB);
        this.tinggiLimas = tinggiLimas;
        this.hitungVolume();
        this.hitungLuasPermukaan();
    }

    public double hitungVolume() {
        volume = (1.0 / 3.0) * super.luas * tinggiLimas;
        return volume;
    }

    public double hitungLuasPermukaan() {
        double a = super.getSisiA();
        double b = super.getSisiB();
        double tinggiSegitigaA = Math.sqrt(Math.pow(tinggiLimas, 2) + Math.pow((b / 2), 2));
        double tinggiSegitigaB = Math.sqrt(Math.pow(tinggiLimas, 2) + Math.pow((a / 2), 2));
        double luasSisiA = a * tinggiSegitigaA / 2;
        double luasSisiB = b * tinggiSegitigaB / 2;
        luasPermukaan =  super.luas + 2 * (luasSisiA + luasSisiB);
        return luasPermukaan;
    }
}
