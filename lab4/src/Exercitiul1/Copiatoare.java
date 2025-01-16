package Exercitiul1;

public class Copiatoare extends Echipament {
    int p_ton;
    Format format;


    public Copiatoare(String denumire, int nr_inv, float pret, zona_mag z, int p_ton, Format format) {
        super(denumire, nr_inv, pret, z);
        this.p_ton = p_ton;
        this.format = format;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", p/ton: " + p_ton +
                ", format: " + format;
    }

    public void setFormat(Format format) {
        this.format = format;
    }
}

