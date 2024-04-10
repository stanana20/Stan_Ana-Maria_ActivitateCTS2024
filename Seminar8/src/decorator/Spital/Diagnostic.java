package decorator.Spital;

public class Diagnostic implements DiagnosticAbstract{
    private String numeDiagnostic;
    private String descriere;
    private boolean necesitaSpitalizare;

    public Diagnostic(String numeDiagnostic, String descriere, boolean necesitaSpitalizare) {
        this.numeDiagnostic = numeDiagnostic;
        this.descriere = descriere;
        this.necesitaSpitalizare = necesitaSpitalizare;
    }

    @Override
    public void printeazaDiagnostic() {
        System.out.println("Nume diagnostic: " + this.numeDiagnostic+", care are simptomele: "+this.descriere+" si "+(this.necesitaSpitalizare? " ":"NU")+" necesita spitalizare");
    }

    public String getNumeDiagnostic() {
        return numeDiagnostic;
    }

    public String getDescriere() {
        return descriere;
    }

    public boolean isNecesitaSpitalizare() {
        return necesitaSpitalizare;
    }
}
