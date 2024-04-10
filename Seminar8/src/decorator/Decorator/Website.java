package decorator.Decorator;

import Spital.DiagnosticAbstract;

public class Website extends Decorator{
    public Website(DiagnosticAbstract diagnostic) {
        super(diagnostic);
    }

    @Override
    public void afiseazaOnline() {
        System.out.println("Pe website, ati primit diagnosticul "+super.getNumeDiagnostic()+ " cu simptomele: "+super.getDescriere()+" si "+(isNecesitaSpitalizare()? " ": "nu")+" necesita spitalizare");
    }
}
