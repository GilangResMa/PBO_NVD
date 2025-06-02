package geometri;

public class JuringLingkaran extends Lingkaran {
    private double sudutJuring; 

    public JuringLingkaran(double jariJari,double sudutJuring) {
        super(jariJari);
        this.sudutJuring = sudutJuring;
        this.hitungKeliling();
        this.hitungLuas();
    }

    @Override
    public double hitungLuas() {
        this.luas = (sudutJuring / 360.0) * super.hitungLuas();
        return luas;
    }

    @Override
    public double hitungKeliling() {
        this.keliling = (sudutJuring / 360.0) * super.keliling + 2 * super.getJariJari();;
        return keliling;
    }
}
