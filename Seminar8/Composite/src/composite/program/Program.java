package composite.program;

import composite.classes.Departament;
import composite.classes.Sectie;
import composite.classes.StructuraAbs;

public class Program {
    public static void main(String[] args) {
        StructuraAbs cardiologie = new Departament("Cardiologie", "Gigel");
        StructuraAbs oftalmologie =  new Departament("Oftalmologie", "Vasile");

        StructuraAbs terapieIntensiva =  new Sectie("ATI", 10, "Ion");
        StructuraAbs donare = new Sectie("Donare de sange", 5, "Gogu");
        StructuraAbs optometrie = new Sectie("Optometrie", 2, "Costel");

        cardiologie.adaugaStructura(terapieIntensiva);
        cardiologie.adaugaStructura(donare);

        oftalmologie.adaugaStructura(optometrie);

        StructuraAbs spital = new Departament("Spital", "Ionescu");
        spital.adaugaStructura(oftalmologie);
        spital.adaugaStructura(cardiologie);

        //oftalmologie.adaugaStructura(cardiologie);

        spital.afiseazaDescriere("  ");
    }
}
