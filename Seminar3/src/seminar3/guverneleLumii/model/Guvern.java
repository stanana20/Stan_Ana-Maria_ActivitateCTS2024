package seminar3.guverneleLumii.model;

public class Guvern {
    private String numeTara;
    private String numePrimMinistru;
    private int nrGuvernatori;

    protected Guvern(String numeTara, String numePrimMinistru, int nrGuvernatori) {
        this.numeTara = numeTara;
        this.numePrimMinistru = numePrimMinistru;
        this.nrGuvernatori = nrGuvernatori;
    }

    public String getNumeTara() {
        return numeTara;
    }

    public void setNumeTara(String numeTara) {
        this.numeTara = numeTara;
    }

    public String getNumePrimMinistru() {
        return numePrimMinistru;
    }

    public void setNumePrimMinistru(String numePrimMinistru) {
        this.numePrimMinistru = numePrimMinistru;
    }

    public int getNrGuvernatori() {
        return nrGuvernatori;
    }

    public void setNrGuvernatori(int nrGuvernatori) {
        this.nrGuvernatori = nrGuvernatori;
    }

    @Override
    public String toString() {
        return "Guvern{" +
                "numeTara='" + numeTara + '\'' +
                ", numePrimMinistru='" + numePrimMinistru + '\'' +
                ", nrGuvernatori=" + nrGuvernatori +
                '}';
    }
}
