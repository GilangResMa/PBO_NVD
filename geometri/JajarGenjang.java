package geometri;

public class JajarGenjang extends BangunDatar {
    private double alas;
    private double tinggi;
    private double sisiA;
    private double sisiB;

    public JajarGenjang(double alas, double tinggi, double sisiA, double sisiB) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisiA = sisiA;
        this.sisiB = sisiB;
        this.hitungKeliling();
        this.hitungLuas();
    }

    @Override
    public double hitungKeliling() {
        this.keliling = 2 * (sisiA + sisiB);
        return keliling;
    }

    @Override
    public double hitungLuas() {
        this.luas = alas * tinggi;
        return luas;
    } 

    public double getSisiA(){
        return sisiA;
    }

    public double getSisiB(){
        return sisiB;
    }
}