package geometri;

public class Balok extends PersegiPanjang {
    private double tinggi;
    protected double volume;
    protected double luasPermukaan;

    public Balok(double panjang, double lebar, double tinggi) {
        super(panjang, lebar);
        this.tinggi = tinggi;
        this.hitungVolume();
        this.hitungLuasPermukaan();
    }

    public double hitungVolume() {
        volume = super.luas * tinggi;
        return volume;  
    }

    public double hitungLuasPermukaan() {
        double p = super.getPanjang();
        double l = super.getLebar();
        luasPermukaan = 2 * ((p * l) + (p * tinggi) + (l * tinggi));
        return luasPermukaan;
    }
}
