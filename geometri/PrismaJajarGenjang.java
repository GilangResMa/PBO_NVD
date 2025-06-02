package geometri;

public class PrismaJajarGenjang extends JajarGenjang {
    private double tinggiPrisma;
    private double volume;
    private double luasPermukaan;

    public PrismaJajarGenjang(double alas, double tinggiAlas, double sisiA, double sisiB, double tinggiPrisma) {
        super(alas, tinggiAlas, sisiA, sisiB);
        this.tinggiPrisma = tinggiPrisma;
        this.hitungVolume();
        this.hitungLuasPermukaan();
    }

    public double hitungVolume() {
        volume =  super.luas * tinggiPrisma;
        return volume;
    }

    public double hitungLuasPermukaan() {
        luasPermukaan = 2 * super.luas + super.keliling * tinggiPrisma;
        return luasPermukaan;
    }
}
