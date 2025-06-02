package geometri;

public class LimasLayangLayang extends LayangLayang {
    private double tinggi;
    private double volume;
    private double luasPermukaan;

    public LimasLayangLayang(double diagonal1, double diagonal2, double sisiPendek, double sisiPanjang, double tinggi) {
        super(diagonal1, diagonal2, sisiPendek, sisiPanjang);
        this.tinggi = tinggi;
        this.hitungVolume();
        this.hitungLuasPermukaan();
    }

    public double hitungLuasPermukaan() {
        double luasAlas = super.luas;
        double a = super.getSisiPendek();
        double b = super.getSisiPanjang();
        double tinggiSegitigaPendek = Math.sqrt(Math.pow(tinggi, 2) + Math.pow(a / 2, 2));
        double tinggiSegitigaPanjang = Math.sqrt(Math.pow(tinggi, 2) + Math.pow(b / 2, 2));
        double luasSisiTegak = 2 * (0.5 * a * tinggiSegitigaPendek) + 2 * (0.5 * b * tinggiSegitigaPanjang);
        luasPermukaan =  luasAlas + luasSisiTegak;
        return luasPermukaan;
    }

    public double hitungVolume() {
        volume =  (1.0 / 3.0) * super.luas * tinggi;
        return volume;
    }
}
