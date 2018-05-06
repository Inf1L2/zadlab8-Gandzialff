package Zad45;

public class Kolo extends FiguraPlaska {
    private double r;

    public Kolo(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double obliczPole() {
        return Math.PI*Math.pow(r,2);
    }

    @Override
    public double obliczObwod() {
        return 2*Math.PI*r;
    }

    @Override
    public String toString() {
        return super.toString()+"\nKolo\nPromien: "+r+"\nPole: "+obliczPole()+"Obwod: "+obliczObwod();
    }
}
