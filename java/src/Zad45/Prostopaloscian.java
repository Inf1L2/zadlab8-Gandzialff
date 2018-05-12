package Zad45;

public class Prostopaloscian extends FiguraPrzestrzenna {
    private double a;
    private double b;
    private double c;

    public Prostopaloscian(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
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

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public double obliczObjetosc() {
        return a * b * c;
    }

    @Override
    public double obliczPole() {
        return 2 * (a * b + a * c + b * c);
    }
    @Override
    public String toString() {
        return super.toString()+"\nProstopadloscian:\nDlugosc boków: a="+a+" b="+b+" c="+c+"\nPole: "+obliczPole()+"\nObjetosc: "+obliczObjetosc();
    }
}
