package FactoryMethod.fabrici;

import FactoryMethod.classes.Brancardier;
import FactoryMethod.classes.PersonalSpital;

public class FabricaBrancardier implements FactoryPersonal{
    @Override
    public PersonalSpital crearePersonal(String nume, int salariu) {
        return new Brancardier(nume, salariu);
    }
}
