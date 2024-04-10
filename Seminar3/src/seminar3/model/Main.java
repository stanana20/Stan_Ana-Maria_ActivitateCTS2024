package seminar3.model;

import seminar3.singleton.Guvern;

public class Main {

    public static void main(String[] args) {
        Guvern guvern = Guvern.getInstance(4,"AAA",12);
        Guvern guvern2 = Guvern.getInstance(5,"BBB",24);

        System.out.println(guvern);
        System.out.println(guvern2);
    }
}
