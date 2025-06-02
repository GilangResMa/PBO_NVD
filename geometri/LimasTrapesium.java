package geometri;

public class LimasTrapesium extends Trapesium {
    private double tinggiLimas;
    private double volume;
    private double luasPermukaan;

    public LimasTrapesium(double alasAtas,double alasBawah,double sisiMiring, double tinggi, double tinggiLimas) {
        super(alasAtas, alasBawah, sisiMiring, tinggi);
        this.tinggiLimas = tinggiLimas;
        this.hitungVolume();
        this.hitungLuasPermukaan();
    }

    public double hitungVolume() {
        volume = (1.0 / 3.0) * super.luas * tinggiLimas;
        return volume;
    }

    public double hitungLuasPermukaan() {
        double luasAlas = super.luas;

        double tinggiSisiTegak = Math.sqrt(Math.pow(tinggiLimas, 2) + Math.pow((super.getAlasBawah() - super.getAlasAtas()) / 2.0, 2));

        double luasSegitigaAtas = 0.5 * super.getAlasAtas() * tinggiSisiTegak;
        double luasSegitigaBawah = 0.5 * super.getAlasBawah() * tinggiSisiTegak;
        double luasSegitigaMiring = 2 * (0.5 * super.getSisiMiring() * tinggiSisiTegak); 

        luasPermukaan = luasAlas + luasSegitigaAtas + luasSegitigaBawah + luasSegitigaMiring;
        return luasPermukaan;
    }
}
