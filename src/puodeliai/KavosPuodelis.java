package puodeliai;

import produktai.Produktai;

public class KavosPuodelis extends Puodelis {
    private Produktai produktuKiekis;
    private String kavosPavadinimas;
    private boolean arPagaminta = false;

    public KavosPuodelis(String kavosPavadinimas) {
        this.kavosPavadinimas = kavosPavadinimas;
    }

    public Produktai getProduktuKiekis() {
        return produktuKiekis;
    }

    public void setProduktuKiekis(Produktai produktuKiekis) {
        this.produktuKiekis = produktuKiekis;
    }

    public String getKavosPavadinimas() {
        return kavosPavadinimas;
    }

    public boolean getArPagaminta() {
        return arPagaminta;
    }

    public void setArPagaminta(boolean arPagaminta) {
        this.arPagaminta = arPagaminta;
    }

    @Override
    public String toString() {
        if (arPagaminta) {
            return produktuKiekis.toString() + " Kavos pavadinimas: " + this.kavosPavadinimas + ", Kava pagaminta " + super.rodykInformacija();
        } else {
            return produktuKiekis.toString() + " Kavos pavadinimas: " + this.kavosPavadinimas + ", Kava nepagaminta" + super.toString();
        }
    }
}
