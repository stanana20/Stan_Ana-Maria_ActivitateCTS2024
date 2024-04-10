package FactoryMethod.fabrici;

import FactoryMethod.classes.PersonalSpital;
public interface FactoryPersonal {
    public PersonalSpital crearePersonal(String nume, int salariu);
}
