package FactoryMethod.fabrici;

import FactoryMethod.classes.Asistent;
import FactoryMethod.classes.PersonalSpital;

public class FabricaAsistent  implements FactoryPersonal{
    @Override
    public PersonalSpital crearePersonal(String nume, int salariu) {
        return new Asistent(nume, salariu);
    }
}
