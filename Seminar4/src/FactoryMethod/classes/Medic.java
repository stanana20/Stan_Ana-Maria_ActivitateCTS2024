package FactoryMethod.classes;

public class Medic extends PersonalSpital {
    private int vechime;
    public Medic(String nume, int salariu) {
        super(nume, salariu);
        this.vechime = 0;
    }


    @Override
    public void afisare() {
        System.out.println("Medicul "+super.getNume()+" are salariul "+super.getSalariu());
    }
}
