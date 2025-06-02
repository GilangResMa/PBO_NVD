package geometri;

public class LimasSegitiga extends Segitiga {
    private double tinggiLimas;
    private double volume;
    private double luasPermukaan;

    public LimasSegitiga(double alas,double tinggi, double tinggiLimas) {
        super(alas, tinggi);    
        this.tinggiLimas = tinggiLimas;
        this.hitungVolume();
        this.hitungLuasPermukaan();
    }

    public double hitungLuasPermukaan() {
        double s = super.getSisi(); 
        luasPermukaan = 4 * ((Math.sqrt(3) / 4.0) * Math.pow(s, 2));
        return luasPermukaan;
    }

    public double hitungVolume() {
        volume = (1.0 / 3.0) * super.luas * tinggiLimas;
        return volume;
    }
}