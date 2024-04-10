package FactoryMethod.main;

import FactoryMethod.classes.PersonalSpital;
import FactoryMethod.fabrici.FabricaAsistent;
import FactoryMethod.fabrici.FabricaInfirmier;
import FactoryMethod.fabrici.FactoryPersonal;

public class Main {
    public static void main(String[] args) {
        FactoryPersonal factoryPersonal = new FabricaAsistent();
//        PersonalSpital personal = factoryPersonal.crearePersonal("XYZ", 3000);
//        personal.afisare();
        procesarePersonal(factoryPersonal, "XYZ", 3000);
        procesarePersonal(new FabricaAsistent(), "GHI", 5000);
        procesarePersonal(new FabricaInfirmier(), "TYU", 6000);
    }

    public static void procesarePersonal(FactoryPersonal factory, String nume, int salariu){
        PersonalSpital personal = factory.crearePersonal(nume, salariu);
        personal.afisare();
    }
}
