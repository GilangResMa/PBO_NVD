package geometri;

public class Lingkaran extends BangunDatar {
    private double jariJari;
    protected final double PI = 3.14;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
        this.hitungKeliling();
        this.hitungLuas();
    }

    @Override
    public double hitungLuas() {
        this.luas =  PI * jariJari * jariJari;
        return luas;
    }

    @Override
    public double hitungKeliling() {
        this.keliling = 2 * PI * jariJari;
        return keliling;
    }
    
    public double hitungLuas(double jariJariBaru) {
        this.luas = PI * jariJariBaru * jariJariBaru;
        return luas;
    }

    public double hitungKeliling(double jariJariBaru) {
        this.keliling = 2 * PI * jariJariBaru;
        return keliling;
    }

    public double getJariJari() {
        return jariJari;
    }

    public double getPI(){
        return PI; 
    }
    
}
