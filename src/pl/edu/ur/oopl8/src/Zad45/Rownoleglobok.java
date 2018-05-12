package Zad45;

public class Rownoleglobok extends FiguraPlaska {
    private double a;
    private double b;
    private double h;

    public Rownoleglobok(double a, double b, double h) {
        this.a = a;
        this.b = b;
        this.h = h;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    @Override
    public double obliczObwod() {
        return 0;
    }

    @Override
    public double obliczPole() {
        return 0;
    }

    @Override
    public String toString() {
        return super.toString()+"\nRownoleglobok\nDlugosc boków: a="+a+" b="+b+"\nWysokosc: "+h+"\nPole: "+obliczPole()+"\nObwod: "+obliczObwod();
    }
}
