package tugas3;

public class PersegiPanjang implements MenghitungBidang {
    private double panjang;
    private double lebar;

    public PersegiPanjang(double p, double l) {
        this.panjang = p;
        this.lebar = l;
    }

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double p) {
        this.panjang = p;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double l) {
        this.lebar = l;
    }

    @Override
    public double luas() {
        return ((getPanjang()) * (getLebar()));
    }

    @Override
    public double keliling() {
        return ((2.0f * (getPanjang())) + (2.0f * (getLebar())));
    }
}
