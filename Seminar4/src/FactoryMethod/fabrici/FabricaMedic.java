package FactoryMethod.fabrici;

import FactoryMethod.classes.Medic;
import FactoryMethod.classes.PersonalSpital;

public class FabricaMedic implements FactoryPersonal{
    @Override
    public PersonalSpital crearePersonal(String nume, int salariu) {
        return new Medic(nume, salariu);
    }
}
