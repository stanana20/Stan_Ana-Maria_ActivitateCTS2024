package FactoryMethod.fabrici;

import FactoryMethod.classes.Infirmier;
import FactoryMethod.classes.PersonalSpital;

public class FabricaInfirmier implements FactoryPersonal{
    @Override
    public PersonalSpital crearePersonal(String nume, int salariu) {
        return new Infirmier(nume, salariu);
    }
}
