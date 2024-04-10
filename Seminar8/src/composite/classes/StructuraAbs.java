package composite.classes;

public abstract class StructuraAbs {
    private String nume;
    public StructuraAbs(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public abstract void adaugaStructura(StructuraAbs sa);
    public abstract void stergeStructura(StructuraAbs sa);
    public abstract StructuraAbs getStructura(int index);

    public abstract void afiseazaDescriere(String identare);
}
