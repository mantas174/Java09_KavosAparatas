package puodeliai.rusis;

import produktai.Produktai;
import puodeliai.KavosPuodelis;

public class JuodosKavosPuodelis extends KavosPuodelis{

    public JuodosKavosPuodelis(){
        super("Juoda Kava");

        Produktai test = new Produktai(10,30,150);

        super.setProduktuKiekis(test);

    }
}
