package League.classes;

import League.interfaces.IPerson;

public class Echipa {

    public String numeEchipa;

    public IPerson j1,j2,j3;

    public IPerson m;

    private int punctaj;

    public Echipa(String numeEchipa, IPerson j1, IPerson j2, IPerson j3, IPerson m, int punctaj){
        this.numeEchipa = numeEchipa;
        this.j1 = j1;
        this.j2 = j2;
        this.j3 = j3;
        this.m = m;
        this.punctaj = punctaj;
    }

    public int getPunctaj() {
        return punctaj;
    }

    public void setPunctaj(int punctaj) {
        this.punctaj = punctaj;
    }
}
