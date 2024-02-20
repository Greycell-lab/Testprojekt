public class Main {
    public static void main(String[] args) {
        einlagern("Buch");
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