package puodeliai.rusis;

import produktai.Produktai;
import puodeliai.KavosPuodelis;

public class EspressoPuodelis extends KavosPuodelis{
    public EspressoPuodelis(){
        super("Espresso Kava");

        Produktai test = new Produktai(0,25,50);

        super.setProduktuKiekis(test);

    }
}
