package SimpleFactory.main;

import SimpleFactory.classes.FactoryPersonal;
import SimpleFactory.classes.PersonalSpital;
import SimpleFactory.classes.TipAngajat;

public class Main {
    public static void main(String[] args) {
        FactoryPersonal factoryPersonal=new FactoryPersonal();
        PersonalSpital medic = factoryPersonal.crearePersonal(TipAngajat.MEDIC, "ABC", 2000, 2);
        medic.afisare();
        PersonalSpital asistent = factoryPersonal.crearePersonal(TipAngajat.ASISTENT, "DEF", 1500, 0);
        asistent.afisare();
    }
}