package geometri;

public class BelahKetupat extends BangunDatar {
    protected double sisi;
    protected double diagonal1;
    protected double diagonal2;

    public BelahKetupat(double diagonal1, double diagonal2, double sisi) {
        this.sisi = sisi;
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
        this.hitungKeliling();
        this.hitungLuas();
    }

    @Override
    public double hitungKeliling() {
        this.keliling = (2 * diagonal1) + (2 * diagonal2);
        return keliling;
    }

    @Override
    public double hitungLuas() {
        this.luas = (diagonal1 * diagonal2) / 2;
        return luas;
    }

    public double getSisi() {
        return sisi;
    }
    
    public double getDiagonal1() {
        return diagonal1;
    }

    public double getDiagonal2() {
        return diagonal2;
    }
}