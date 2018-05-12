package Zad45;

public class Szescian extends FiguraPrzestrzenna {
    private double a;

    public Szescian(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    @Override
    public double obliczObjetosc() {
        return Math.pow(a,3);
    }

    @Override
    public double obliczPole() {
        return 6* Math.pow(a,2);
    }

    @Override
    public String toString() {
        return super.toString()+"\nSześcian\nDlugosc boku: "+a+"\nPole: "+obliczPole()+"\nObjętość: "+obliczObjetosc();
    }
}
