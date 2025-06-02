package geometri;

public class LimasPersegiPanjang extends PersegiPanjang {
    private double tinggi;
    private double volume;
    private double luasPermukaan;

    public LimasPersegiPanjang(double panjang, double lebar, double tinggi) {
        super(panjang, lebar);
        this.tinggi = tinggi;
        this.hitungVolume();
        this.hitungLuasPermukaan();
    }

    public double hitungVolume() {
        volume =  (1.0 / 3.0) * super.luas * tinggi;
        return volume;
    }

    public double hitungLuasPermukaan() {
        double panjang = super.getPanjang();
        double lebar = super.getLebar();

        double tinggiSegitigaPanjang = Math.sqrt(Math.pow(tinggi, 2) + Math.pow(lebar / 2, 2));
        double tinggiSegitigaLebar = Math.sqrt(Math.pow(tinggi, 2) + Math.pow(panjang / 2, 2));

        double luasSisiPanjang = panjang * tinggiSegitigaPanjang;
        double luasSisiLebar = lebar * tinggiSegitigaLebar;

        luasPermukaan =  super.luas + 2 * (0.5 * luasSisiPanjang) + 2 * (0.5 * luasSisiLebar);
        return luasPermukaan;
    }
}
