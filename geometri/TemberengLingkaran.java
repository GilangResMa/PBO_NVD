package geometri;

public class TemberengLingkaran extends Lingkaran {
    private double sudut; 

    public TemberengLingkaran(double jariJari, double sudut) {
        super(jariJari);
        this.sudut = sudut;
        this.hitungKeliling();
        this.hitungLuas();
    }

    @Override
    public double hitungLuas() {
        double sudutRadian = Math.toRadians(sudut);
        double luasJuring = (sudut / 360.0) * super.getPI() * super.getJariJari() * super.getJariJari();
        double luasSegitiga = 0.5 * super.getJariJari() * super.getJariJari() * Math.sin(sudutRadian);
        this.luas = luasJuring - luasSegitiga;
        return luas;
    }

    @Override
    public double hitungKeliling() {
        double sudutRadian = Math.toRadians(sudut);
        double panjangBusur = sudutRadian * super.getJariJari();
        double taliBusur = 2 * super.getJariJari() * Math.sin(sudutRadian / 2);
        this.keliling = panjangBusur + taliBusur;
        return keliling;
    }
}
