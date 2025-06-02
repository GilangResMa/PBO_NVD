package geometri;

public class Trapesium extends BangunDatar {
    private double alasAtas;
    private double alasBawah;
    private double sisiMiring;
    private double tinggi;

    public Trapesium(double alasAtas,double alasBawah,double sisiMiring, double tinggi) {   
        this.alasAtas = alasAtas;
        this.alasBawah = alasBawah;
        this.sisiMiring = sisiMiring;
        this.tinggi = tinggi;
        this.hitungKeliling();
        this.hitungLuas();
    }

    @Override
    public double hitungLuas() {
        this.luas = 0.5 * (alasAtas + alasBawah) * tinggi; 
        return luas;
    }

    @Override
    public double hitungKeliling() {
        this.keliling =  alasAtas + alasBawah + 2 * sisiMiring;   
        return keliling;
    }

    public double getAlasAtas() {
        return alasAtas;
    }

    public double getAlasBawah() {
        return alasBawah;
    }

    public double getSisiMiring() {
        return sisiMiring;
    }

}

