package League.gui;

import League.classes.*;
import League.interfaces.IPerson;
import League.interfaces.IRanking;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Scanner;

public class myGUI {

    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JPanel myPannel;


    private static IPerson[] j = new Angajat[6];
    private static Echipa[] e = new Echipa[3];
    private static IPerson[] m = new Angajat[3];
    private IRanking c = new Clasament(e[0],e[1],e[2]);

    public static void infoBox(String infoMessage, String titleBar)
    {
        JOptionPane.showMessageDialog(null, infoMessage, "" + titleBar, JOptionPane.INFORMATION_MESSAGE);
    }

    public myGUI(){
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myGUI.infoBox(c.bestE(), "Clasament");
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myGUI.infoBox(c.showAll(), "Echipele");
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                myGUI.infoBox(c.gG(),"Meci");
            }
        });
    }


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        Random rnd1 = new Random();
        for (int k = 0; k < 3; ++k) {
            for (int i = 0; i < 3; ++i) {

                System.out.println("Nume jucator:");
                String nume = sc.next();

                System.out.println("Preume jucator:");
                String prenume = sc.next();

                System.out.println("Pozitie jucator:");
                String poz = sc.next();

                j[i] = new Jucator(nume, prenume, rnd1.nextInt(18, 35), rnd1.nextInt(50), poz, 2500);
            }
            System.out.println("Nume manager:");
            String numeM = sc.next();

            System.out.println("Preume manager:");
            String prenumeM = sc.next();

            int rnd;
            rnd = rnd1.nextInt(50);

            m[k] = new Manager(numeM, prenumeM, rnd1.nextInt(35,60),3000,rnd);

            System.out.println("Nume echipa:");
            String numeE = sc.next();
            e[k] = new Echipa(numeE, j[0], j[1], j[2], m[k], rnd);

        }
        JFrame jFrame = new JFrame("Proiect");
        jFrame.setContentPane(new myGUI().myPannel);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.pack();
        jFrame.setVisible(true);
    }
}



