@SuppressWarnings("unused")
public class Main {
    public static void main(String[] args) {
        //einlagern("Buch");
        //rabatt(true, 2000);
        Badestelle[] array = new Badestelle[3];
        array[0] = new Badestelle(20);
        array[1] = new Badestelle(24);
        array[2] = new Badestelle(25);
        warmwassertag(array);
    }
    public static void warmwassertag(Badestelle[] badestellen){
        int z = 0;
        int w = 1;
        while(z < badestellen.length){
            Badestelle b = badestellen[z];
            z = z + 1;
            if(b.wassertemperatur > 22){
                w = w + 1;
            }
        }
        if(2 * w > z){
            System.out.println("Warmwassertag");
        }

    }
    public static void rabatt(boolean stammkunde, double umsatz){
        int rabatt;
        if(stammkunde){
            if(umsatz > 1000){
                if(umsatz > 5000){
                    rabatt = 20;
                }else{
                    rabatt = 10;
                }
            }else{
                rabatt = 5;
            }
        }else{
            if(umsatz > 2000){
                if(umsatz > 10000){
                    rabatt = 10;
                }else{
                    rabatt = 5;
                }
            }else{
                rabatt = 0;
            }
        }
        System.out.println("Rabatt: " + rabatt);
    }

    public static void einlagern(String bezeichnung){
        Lager lager = new Lager();
        int einlagerbar = 1;
        int anzahlArtikel = lager.getAnzahlArtikel();
        int maxAnzahlArtikel = lager.getAnzahlMaxArtikel();
        if(bezeichnung.isEmpty()){
            System.out.println("String ist leer");
            einlagerbar = 0;
        }else{
            if(anzahlArtikel < maxAnzahlArtikel){
                anzahlArtikel = anzahlArtikel + 1;
            }else{
                einlagerbar = 0;
            }
        }
        if(einlagerbar == 1){
            lager.einlagern();
        }else{
            System.out.println("Artikel kann nicht eingelagert werden");
        }
    }
}