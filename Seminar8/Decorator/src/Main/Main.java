package Main;

import Decorator.Decorator;
import Spital.Diagnostic;
import Spital.DiagnosticAbstract;
import Decorator.AplicatieMobila;
import Decorator.Website;


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
