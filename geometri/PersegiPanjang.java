package geometri;

public class PersegiPanjang extends BangunDatar {
    private double panjang;
    private double lebar;

    public PersegiPanjang(double panjang, double lebar) {   
        this.panjang = panjang;
        this.lebar = lebar;
        this.hitungKeliling();
        this.hitungLuas();
    }

    @Override
    public double hitungLuas() {
        this.luas = panjang * lebar;
        return luas;
    }

    @Override
    public double hitungKeliling() {
        this.keliling =  2 * (panjang + lebar);   
        return keliling;
    }

    public double getPanjang() {
        return panjang;
    }

    public double getLebar() {
        return lebar;
    }
}
