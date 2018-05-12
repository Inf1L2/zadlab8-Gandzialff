package Zad45;

public class Romb extends FiguraPlaska {
    private double a;
    private double h;

    public Romb(double a, double h) {
        this.a = a;
        this.h = h;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    @Override
    public double obliczObwod() {
        return 4*a;
    }

    @Override
    public double obliczPole() {
        return a*h;
    }

    @Override
    public String toString() {
        return super.toString()+"\nRomb\nDlugosc: "+a+"\nWysokosc: "+h+"\nPole: "+obliczPole()+"\nObwod: "+obliczObwod();
    }
}
