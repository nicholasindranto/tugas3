package tugas3;

public class Balok extends PersegiPanjang implements MenghitungRuang {
    private double tinggi;

    public Balok(double p, double l, double t) {
        super(p, l);
        this.tinggi = t;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double t) {
        this.tinggi = t;
    }

    @Override
    public double volume() {
        return ((super.luas()) * (getTinggi()));
    }

    @Override
    public double luasPermukaan() {
        return ((2.0f * (super.luas())) + (2.0f * (super.getPanjang()) * (getTinggi())) + (2.0f * (super.getLebar()) * (this.tinggi)));
    }
}
