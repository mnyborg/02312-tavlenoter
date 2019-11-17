package CDIO_del2_v1.boundary;

import CDIO_del2_v1.entity.Spiller;
import gui_fields.GUI_Car;
import gui_fields.GUI_Field;
import gui_fields.GUI_Player;
import gui_main.GUI;

public class MatadorGUI extends AbstractUI {
    private GUI gui;
    private GUI_Field[] fields;
    private GUI_Player[] players;
    private GUI_Car[] cars;

    public MatadorGUI(GUI gui) {
        this.gui = gui;
        this.fields = gui.getFields();
    }

    @Override
    public void spilstarter(){
        gui.showMessage(String.format(Tekster.TEKSTER[0]));
    }
    @Override
    public void startInfo(Spiller[] p) {
        players = new GUI_Player[p.length];
        cars = new GUI_Car[p.length];
        for (int i=0; i<p.length;i++){
            cars[i] = new GUI_Car(); //car.setPrimaryColor(Color.YELLOW);
            players[i] = new GUI_Player(p[i].getNavn(),p[i].getSaldo(), cars[i]);
            gui.addPlayer(players[i]);
        }
        // sæt alle biler på start
        for (int i = 0; i < players.length; i++)
            fields[0].setCar(players[i], true);
    }
    @Override
    public void venterPaaSlag(String navn) {
        gui.showMessage(String.format(Tekster.TEKSTER[2], navn));
    }
    @Override
    public void visSlag(int[] terninger) {
        gui.setDice(terninger[0], terninger[1]);
    }
    @Override
    public void visSpilStatus (Spiller [] p) {
        // fjern alle biler fra alle felter
       // TODO: fix array length
        for (int i=0; i<fields.length; i++) {
            // rapportere forkert længde på fields (16)
//            System.out.println(fields.length);
            if( fields[i]!=null) {
                fields[i].removeAllCars();
            }
        }
        for(int j = 0; j < p.length; j++){
            // sæt biler og opdater balancer
            fields[p[j].getFeltIndex()].setCar(players[j], true);
            players[j].setBalance(p[j].getSaldo());
        }
    }
    @Override
    public void visSlaaIgen(String navn) {
        gui.showMessage(String.format(Tekster.TEKSTER[6], navn));
    }
    @Override
    public void visSlutInfo(int pNr,Spiller [] p) {
        players[pNr].setBalance(p[pNr].getSaldo());

        // fjern alle biler fra alle felter
        // TODO: fix array length
        for (int i=0; i<12; i++)
            fields[i].removeAllCars();

        // sæt alle biler tilbage til start
        for (int i = 0; i < players.length; i++)
            fields[0].setCar(players[i], true);

        gui.showMessage(String.format(Tekster.TEKSTER[7], p[pNr].getNavn()));

    }
}

