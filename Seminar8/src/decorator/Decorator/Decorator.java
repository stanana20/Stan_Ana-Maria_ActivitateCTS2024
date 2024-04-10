package decorator.Decorator;

import Spital.DiagnosticAbstract;

public abstract class Decorator implements DiagnosticAbstract{
    protected DiagnosticAbstract diagnostic;
    public abstract void afiseazaOnline();
    public Decorator(DiagnosticAbstract diagnostic) {
        this.diagnostic = diagnostic;
    }

    @Override
    public void printeazaDiagnostic() {
        diagnostic.printeazaDiagnostic();
        System.out.println("\n");
        System.out.println("Rezultatul este disponibil si pe platforma!");
    }

    public String getNumeDiagnostic() {
        return diagnostic.getNumeDiagnostic();
    }

    public String getDescriere() {
        return diagnostic.getDescriere();
    }

    public boolean isNecesitaSpitalizare() {
        return diagnostic.isNecesitaSpitalizare();
    }
}
