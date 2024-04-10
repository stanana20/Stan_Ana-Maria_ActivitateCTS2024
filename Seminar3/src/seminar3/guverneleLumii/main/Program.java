package seminar3.guverneleLumii.main;

import seminar3.guverneleLumii.model.GuvernRegistry;

public class Program {
    public static void main(String[] args) {
        GuvernRegistry guvernRegistry = GuvernRegistry.getInstance();
        guvernRegistry.adaugaGuvern("Romania","ABC",5);
        guvernRegistry.adaugaGuvern("Franta","DEF",10);
        guvernRegistry.adaugaGuvern("Germania","GHI",15);

        System.out.println(guvernRegistry.getGuvern("Franta"));
        System.out.println(guvernRegistry.getGuvern("Romania"));
    }
}
