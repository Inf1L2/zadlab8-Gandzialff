import Zad123.*;

public class Main {
    public static void main(String[] args)
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
}
