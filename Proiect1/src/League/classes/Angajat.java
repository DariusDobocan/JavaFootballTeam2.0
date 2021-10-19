package League.classes;

import League.interfaces.IPerson;

public abstract class Angajat implements IPerson {

    public String nume;

    public String prenume;

    public int varsta;

    public Angajat(String nume, String prenume, int varsta)
    {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;

    }

    public abstract String afis();

}
