package League.classes;

import League.interfaces.IRanking;

import java.util.Random;

public class Clasament implements IRanking {

    public static Echipa e1,e2,e3;
    Random rnd1 = new Random();
    public Clasament(Echipa e1, Echipa e2, Echipa e3) {
        this.e1 = e1;
        this.e2 = e2;
        this.e3 = e3;
    }

    public String showAll(){
        return "Echipa: "+ e1.numeEchipa + "\n" + e1.m.afis() + e1.j1.afis()+e1.j2.afis()+e1.j3.afis()+"Echipa: "+ e2.numeEchipa + "\n" + e2.m.afis() + e2.j1.afis()+e2.j2.afis()+e2.j3.afis()+"Echipa: "+ e3.numeEchipa + "\n" + e3.m.afis() + e3.j1.afis()+e3.j2.afis()+e3.j3.afis();

    }

    public String gG() {
        Echipa[] e;
        e = new Echipa[3];
        e[0] = e1;
        e[1] = e2;
        e[2] = e3;
        int r1 = rnd1.nextInt(0, 3);
        int r2 = rnd1.nextInt(0, 3);
        while (r1 == r2) {
            r2 = rnd1.nextInt(0, 3);
        }


        int g1 = rnd1.nextInt(0, 6);
        int g2 = rnd1.nextInt(0, 6);
        if (g1 > g2) {
            e[r1].setPunctaj(e[r1].getPunctaj() + 3);
            return e[r1].numeEchipa + " VS " + e[r2].numeEchipa+"\n"+e[r1].numeEchipa + " a castigat cu: " + g1 + " la " + g2;
        }
        if (g1 < g2) {

            e[r2].setPunctaj(e[r2].getPunctaj() + 3);
            return e[r1].numeEchipa + " VS " + e[r2].numeEchipa+"\n"+e[r1].numeEchipa + " a castigat cu: " + g2 + " la " + g1;
        }
        if (g1 == g2) {
            e[r1].setPunctaj(e[r1].getPunctaj() + 1);
            e[r2].setPunctaj(e[r2].getPunctaj() + 1);
            return e[r1].numeEchipa + " VS " + e[r2].numeEchipa+"\n"+"Egalitate scor: " + g1 + " la " + g2;
        }
        return null;
    }
    public String bestE(){
        Echipa aux;
        Echipa[] vect;
        vect = new Echipa[3];
        vect[0] = e1;
        vect[1] = e2;
        vect[2] = e3;
        for(int i = 0; i < 2; ++i)
        for(int j = i+1; j <=2; ++j){
            if(vect[i].getPunctaj() < vect[j].getPunctaj())
            {
                aux = vect[i];
                vect[i] = vect[j];
                vect[j] = aux;
            }
        }
        return "1." + vect[0].numeEchipa + " " + vect[0].getPunctaj() + "\n" + "2." + vect[1].numeEchipa + " " + vect[1].getPunctaj()  + "\n" + "3."  + vect[2].numeEchipa +" " + vect[2].getPunctaj();
    }

}
