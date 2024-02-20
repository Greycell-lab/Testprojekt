public class Lager {
    private int anzahlArtikel = 10;
    private int anzahlMaxArtikel = 10;

    public void einlagern(){
        System.out.println("Eingelagert");
    }
    public int getAnzahlArtikel() {
        return anzahlArtikel;
    }

    public int getAnzahlMaxArtikel() {
        return anzahlMaxArtikel;
    }
}
