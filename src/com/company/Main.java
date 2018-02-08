package com.company;

import aparatai.KavosAparatas;
import puodeliai.Puodelis;
import puodeliai.rusis.EspressoPuodelis;
import puodeliai.rusis.JuodosKavosPuodelis;
import puodeliai.rusis.LattePuodelis;
import servisai.KavosServisas;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static final int ACTION_0 = 0;
    public static final int ACTION_1 = 1;
    public static final int ACTION_2 = 2;
    public static final int ACTION_3 = 3;
    public static final int ACTION_4 = 4;
    public static final int ACTION_5 = 5;
    public static final int ACTION_6 = 6;
    public static final int ACTION_7 = 7;
    public static final int ACTION_8 = 8;
    public static final int ACTION_9 = 9;
    public static final int ACTION_10 = 10;

    public static final int SERVICE_ACTION_1 = 11;
    public static final int SERVICE_ACTION_2 = 12;
    public static final int SERVICE_ACTION_3 = 13;
    public static final int SERVICE_ACTION_4 = 14;
    public static final int SERVICE_ACTION_5 = 15;
    public static final int SERVICE_ACTION_6 = 16;


    public static final int PUODELIO_ACTION_100 = 100;
    public static final int PUODELIO_ACTION_200 = 200;
    public static final int PUODELIO_ACTION_300 = 300;




    public static void main(String[] args) {
        /* Sukurti kavos aparatą:
         * Kuris turėtų atributus:
         * Cukraus kiekis
         * Kavos pupelių kiekis
         * Vandens kiekis
         * Panaudojimų skaičius
         * Panaudojimų skaičiaus riba – konstanta, kuri saugo, kas kiek panaudojimų reikia atlikti plovimą
         * Kuris mokėtų:
         *   Papildyti vandens/pupelių/cukraus
         *   Gaminti bent trijų rūšių kavą (nustatoma pagal String parametrą ir kuri naudotų skirtingus produktų kiekius),
         *       jeigu trūksta nors vieno produkto 0 atspausdintų atitinkamą pranešimą;
         *       Taip pat atspausditų pranešimą jeigu laikas plovimui
         *   Atlikti plovimą (apnulina panaudojimų skaičių)
         *   Pasakyti ar pasiruošęs (netrūksta produktų ir išsivalęs)
         *   Pasakytų kokia dabar produktų būsena – atspausdintų informaciją
         *   Pasakytų kokia yra aparato būsena (kiek liko produktų ir iki plovimo)
         *   Turėtų keletą konstruktorių
         *   Turėtų set ir get metodus laukams
         */
        Main obj = new Main();
        obj.run();

        //System.out.println(new JuodosKavosPuodelis());

    }

    private void rodykMeniu() {
        System.out.println("==============Puodelio veiksmai=====================");
        System.out.println(PUODELIO_ACTION_100+ " - Juodos kavos puodelis");
        System.out.println(PUODELIO_ACTION_200+ " - Latte kavos puodelis");
        System.out.println(PUODELIO_ACTION_300+ " - Espresso kavos puodelis");
        System.out.println("=======11 12 15 ========Serviso veksmai=====================");
        System.out.println(SERVICE_ACTION_1 + " - Sukurti N aparatu");
        System.out.println(SERVICE_ACTION_2 + " - Pasirinkti su kuriuo aparatu dirbti");
        System.out.println(SERVICE_ACTION_3 + " - Isplauti visus");
        System.out.println(SERVICE_ACTION_4 + " - Isvalyti aparatu produktus");
        System.out.println(SERVICE_ACTION_5 + " - Priskirk bendra produkta");
        System.out.println(SERVICE_ACTION_6 + " - Priskirk skirtingus produktus");
        System.out.println("==============Aparato veiksmai====================");
        System.out.println(ACTION_1 + " - Padaryk Juoda kava");
        System.out.println(ACTION_2 + " - Padaryk Latte");
        System.out.println(ACTION_3 + " - Padaryk Espresso");
        System.out.println(ACTION_4 + " - Plauk aparata");
        System.out.println(ACTION_5 + " - Papildyk vandeni");
        System.out.println(ACTION_6 + " - Papildyk cukru");
        System.out.println(ACTION_7 + " - Papildyk kava");
        System.out.println(ACTION_8 + " - Parodyk ar pasiruoses");
        System.out.println(ACTION_9 + " - Parodyk produktu busena");
        System.out.println(ACTION_10 + " - Parodyk aparato busena");
        System.out.println(ACTION_0 + " - Baigti darba");
        System.out.println("==================================================");
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        boolean arTesti = true;
        KavosServisas servisas = new KavosServisas();
        int kurisAparatas = -1;
        int aparatuKiekis = -1;
        ArrayList<KavosAparatas> sarasas = null;
        while (arTesti) {
            rodykMeniu();
            int veiksmas = sc.nextInt();
            switch (veiksmas) {

                case PUODELIO_ACTION_100:
                    //------------------------------------------------------------------------------------------Puodelis jkp = new JuodosKavosPuodelis();
                    JuodosKavosPuodelis jkp = new JuodosKavosPuodelis();
//                    System.out.println("Puodelio talpa: " +jkp.getPuodelioTalpa());
//                    System.out.println("Produktai naudoti kavai: " +jkp.getProduktuKiekis().toString());
//                    System.out.println("Kavos pavadinimas: " +jkp.getKavosPavadinimas());
//                    System.out.println("Ar pagamintas: " +jkp.getKavosPavadinimas());
//                    System.out.println("Informacija KavosPuodelis: " +jkp.toString());
//
                    sarasas.get(kurisAparatas).gaminkKava(jkp);
//                    System.out.println("pagaminau");



//                    System.out.println("Puodelio talpa: " +jkp.getPuodelioTalpa());
//                    System.out.println("Produktai naudoti kavai: " +jkp.getProduktuKiekis().toString());
//                    System.out.println("Kavos pavadinimas: " +jkp.getKavosPavadinimas());
//                    System.out.println("Ar pagamintas: " +jkp.getKavosPavadinimas());
//                    System.out.println("Informacija KavosPuodelis: " +jkp.toString());

                    break;
                case PUODELIO_ACTION_200:
                    LattePuodelis lp = new LattePuodelis();
                    sarasas.get(kurisAparatas).gaminkKava(lp);

                    System.out.println("Puodelio talpa: " +lp.getPuodelioTalpa());
                    System.out.println("Produktai naudoti kavai: " +lp.getProduktuKiekis().toString());
                    System.out.println("Kavos pavadinimas: " +lp.getKavosPavadinimas());
                    System.out.println("Ar pagamintas: " +lp.getKavosPavadinimas());
                    System.out.println("Informacija KavosPuodelis: " +lp.toString());

                    break;
                case PUODELIO_ACTION_300:
                    EspressoPuodelis ep = new EspressoPuodelis();
                    sarasas.get(kurisAparatas).gaminkKava(ep);

                    System.out.println("Puodelio talpa: " +ep.getPuodelioTalpa());
                    System.out.println("Produktai naudoti kavai: " +ep.getProduktuKiekis().toString());
                    System.out.println("Kavos pavadinimas: " +ep.getKavosPavadinimas());
                    System.out.println("Ar pagamintas: " +ep.getKavosPavadinimas());
                    System.out.println("Informacija KavosPuodelis: " +ep.toString());

                    break;



                case SERVICE_ACTION_1:
                    System.out.println("Iveskite aparatu kieki");
                    aparatuKiekis = sc.nextInt();
                    sarasas = servisas.sukurkNAparatu(aparatuKiekis);
                    break;
                case SERVICE_ACTION_2:
                    System.out.println("Iveskite aparato eiles numeri, prasideda nuo 0");
                    kurisAparatas = sc.nextInt();
                    break;
                case SERVICE_ACTION_3:
                    servisas.isplaukVisus(sarasas);
                    break;
                case SERVICE_ACTION_4:
                    servisas.isvalykAparatuProduktus(sarasas);
                    break;
                case SERVICE_ACTION_5:
                    servisas.priskirkBendra(sarasas);
                    break;
                case SERVICE_ACTION_6:
                    servisas.priskirkSkirtinga(sarasas);
                    break;

                case ACTION_0:
                    arTesti = false;
                    break;
                case ACTION_1:
                    sarasas.get(kurisAparatas).gaminkKava(KavosAparatas.KAVA_JUODA);
                    break;
                case ACTION_2:
                    sarasas.get(kurisAparatas).gaminkKava(KavosAparatas.KAVA_LATTE);
                    break;
                case ACTION_3:
                    sarasas.get(kurisAparatas).gaminkKava(KavosAparatas.KAVA_ESPRESSO);
                    break;
                case ACTION_4:
                    sarasas.get(kurisAparatas).plauti();
                    break;
                case ACTION_5:
                    sarasas.get(kurisAparatas).papildykVandeni();
                    break;
                case ACTION_6:
                    sarasas.get(kurisAparatas).papildykCukru();
                    break;
                case ACTION_7:
                    sarasas.get(kurisAparatas).papildykKava();
                    break;
                case ACTION_8:
                    break;
                case ACTION_9:
                    sarasas.get(kurisAparatas).parodykProduktuBusena();
                    break;
                case ACTION_10:
                    sarasas.get(kurisAparatas).parodykAparatoBusena();
                    break;
            }
        }

    }
}
