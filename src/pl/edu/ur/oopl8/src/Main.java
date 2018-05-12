import Zad123.*;
import Zad45.*;

public class Main {
    public static void zad3()
    {
        Product[] products = new Product[11];
        products[0] = new Ksiazka("Tytul",23.43,"Opis");
        products[1] = new Czekolada("Milka",3.54,"Mleczna");
        products[2] = new Ksiazka("Tytul2",23.50,"Opis2");
        products[3] = new Dlugopis("Ben",2.35,"Niebieski");
        products[4] = new Dzem("Marmolada",5.40,"Wieloowocwy");
        products[5] = new Polopiryna("Gozdzikowa",45.00,"przypomina");
        products[6] = new Dzem("Rolewski",5.50,"Truskawkowy");
        products[7] = new Czekolada("AlpenGold",7.40,"Truskawaka");
        products[8] = new Dlugopis("BigBen",1.20,"Czarny");
        products[9] = new Ksiazka("Tytul3",25.00,"Opis3");
        products[10] = new Tractor("Ursus-60",1000.00,"Jeździ");

        for(int i=0;i<11;i++)
        {
            products[i].buy();
        }
        for (int i=0;i<11;i++)
        {
            products[i].showInfo();
        }
    }
    public static void zad5()
    {
        FiguraGeometryczna[] figury = new FiguraGeometryczna[15];
        figury[0] = new Kolo(5);
        figury[1] = new Kula(4);
        figury[2] = new Kwadrat(4);
        figury[3] = new Prostokat(3,4);
        figury[4] = new Prostopaloscian(3,4,3);
        figury[5] = new Romb(3,4);
        figury[6] = new Rownoleglobok(4,3,5);
        figury[7] = new Stozek(4,7,8);
        figury[8] = new Szescian(6);
        figury[9] = new Trapez(6,4,3,3,2.4);
        figury[10] = new Trojkat(5,3.2);
        figury[11] = new Walec(3,4);
        figury[12] = new Kwadrat(3.4);
        figury[13] = new Szescian(3.4);
        figury[14] = new Kolo(2.3);

        int i =0;
        while (i <15)
        {
            System.out.println(figury[i].toString());
            i++;
        }

    }

    public static void main(String[] args)
    {

        zad3();
        zad5();



    }
}
