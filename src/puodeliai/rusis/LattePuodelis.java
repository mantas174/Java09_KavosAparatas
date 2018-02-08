package puodeliai.rusis;

import produktai.Produktai;
import puodeliai.KavosPuodelis;

public class LattePuodelis extends KavosPuodelis{
    public LattePuodelis(){
        super("Latte Kava");

        super.setPuodelioMaxTalpa(200);

        //Produktai test = new Produktai(10,10,200);

        super.setProduktuKiekis(new Produktai(10,10,200));

    }
}
