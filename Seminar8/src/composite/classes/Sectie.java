package composite.classes;

public class Sectie extends StructuraAbs{
    private int nrAngajati;
    private String sefSectie;
    public Sectie(String nume, int nrAngajati, String sefSectie) {
        super(nume);
        this.nrAngajati = nrAngajati;
        this.sefSectie = sefSectie;
    }

    @Override
    public void adaugaStructura(StructuraAbs sa) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void stergeStructura(StructuraAbs sa) {
        throw new UnsupportedOperationException();
    }

    @Override
    public StructuraAbs getStructura(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void afiseazaDescriere(String identare) {
        System.out.println(identare+"Sectia: "+super.getNume()+" este condusa de "+this.sefSectie+" si are "
                +this.nrAngajati+" angajati");
    }
}
