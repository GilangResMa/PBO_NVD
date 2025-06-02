package geometri;

public class LayangLayang extends BangunDatar {

    private double diagonal1;
    private double diagonal2;
    private double sisiPendek;
    private double sisiPanjang;


    public LayangLayang(double diagonal1, double diagonal2, double sisiPendek, double sisiPanjang) {
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
        this.sisiPendek = sisiPendek;
        this.sisiPanjang = sisiPanjang;
        this.hitungKeliling();
        this.hitungLuas();
    }

    @Override
    public double hitungLuas() {
        this.luas = 0.5 * diagonal1 * diagonal2;
        return luas;
    }

    @Override
    public double hitungKeliling() {
        this.keliling =  2 * (sisiPendek + sisiPanjang);
        return keliling;
    }

    public double getSisiPendek(){
        return sisiPendek;
    }

    public double getSisiPanjang(){
        return sisiPanjang;
    }
}
