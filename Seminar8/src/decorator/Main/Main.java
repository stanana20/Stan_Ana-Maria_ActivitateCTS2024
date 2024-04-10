package decorator.Main;

import decorator.Decorator.AplicatieMobila;
import decorator.Decorator.Decorator;
import decorator.Decorator.Website;
import decorator.Spital.Diagnostic;
import decorator.Spital.DiagnosticAbstract;

public class Main {
    public static void main(String[] args) {
        DiagnosticAbstract diagnostic =  new Diagnostic("Raceala", "Rosu in gat", false);
        diagnostic.printeazaDiagnostic();

        Decorator decorator =  new AplicatieMobila(diagnostic);
        decorator.afiseazaOnline();
        decorator.printeazaDiagnostic();

        Decorator website = new Website(diagnostic);
        website.afiseazaOnline();
        website.printeazaDiagnostic();
    }
}
