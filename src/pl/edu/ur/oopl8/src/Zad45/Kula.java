package Zad45;

public class Kula extends FiguraPrzestrzenna {
    private double r;

    public Kula(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double obliczObjetosc() {
        return (4*Math.PI*Math.pow(r,3))/3;
    }

    @Override
    public double obliczPole() {
        return 4*Math.PI*Math.pow(r,2);
    }

    @Override
    public String toString() {
        return super.toString()+"\nKula\nPromien: "+r+"\nPole: "+obliczPole()+"\nObjetosc: "+obliczObjetosc();
    }
}
