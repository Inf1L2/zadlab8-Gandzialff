package Zad45;

public class Prostokat extends FiguraPlaska {
    private double a;
    private double b;

    public Prostokat(double a, double b) {
        this.a = a;
        this.b = b;
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

    @Override
    public double obliczObwod() {
        return 2*a+2*b;
    }

    @Override
    public double obliczPole() {
        return a*b;
    }

    @Override
    public String toString() {
        return super.toString()+"\nProstokat\nDlogosc bokow: a="+a+" b="+b+"\nPole: "+obliczPole()+"\nObwod: "+obliczObwod();
    }
}
