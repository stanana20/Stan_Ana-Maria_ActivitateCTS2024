package composite.classes;

import java.util.ArrayList;
import java.util.List;

public class Departament extends StructuraAbs{
    private List<StructuraAbs> structuri;
    private String directorDepartament;
    public Departament(String nume, String directorDepartament) {
        super(nume);
        this.directorDepartament = directorDepartament;
        this.structuri = new ArrayList<>();
    }

    @Override
    public void adaugaStructura(StructuraAbs sa) {
        structuri.add(sa);
    }

    @Override
    public void stergeStructura(StructuraAbs sa) {
        structuri.remove(sa);
    }

    @Override
    public StructuraAbs getStructura(int index) {
        if(index>=0 && index<this.structuri.size()){
            return this.structuri.get(index);
        }else {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public void afiseazaDescriere(String identare) {
        System.out.println(identare+"Departamentul "+super.getNume()+" este condus de "+this.directorDepartament
                +" si are urmatoarea componenta: ");
        for (StructuraAbs sa:this.structuri) {
            sa.afiseazaDescriere(identare+ "    ");
        }
    }
}
