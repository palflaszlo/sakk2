package com.company.felulet;

import javax.swing.*;
import java.awt.*;

public class Mezo extends JButton {
    private int x, y, ertek;

    public Mezo(int x, int y, int ertek) {
        this.y = y;
        this.x = x;
        this.ertek = ertek;

        this.frissit();
    }

    public void frissit(){
        if((this.x + this.y) % 2 == 0){
            this.setBackground(Color.decode("#FFFFFF"));
        }
        else{
            this.setBackground(Color.decode("#8B4513"));
        }



        String fajlNev = "img/ures.png";
        switch (this.ertek){
            case 11: fajlNev = "img/feherGyalog.png"; break;
            case 12: fajlNev = "img/feherBastya.png"; break;
            case 13: fajlNev = "img/feherHuszar.png"; break;
            case 14: fajlNev = "img/feherFuto.png"; break;
            case 15: fajlNev = "img/feherVezer.png"; break;
            case 16: fajlNev = "img/feherKiraly.png"; break;
            case 21: fajlNev = "img/feleteGyalog.png"; break;
            case 22: fajlNev = "img/feketeBastya.png"; break;
            case 23: fajlNev = "img/feketeHuszar.png"; break;
            case 24: fajlNev = "img/feketeFuto.png"; break;
            case 25: fajlNev = "img/feketeVezer.png"; break;
            case 26: fajlNev = "img/feketeKiraly.png"; break;
        }

        Image img = new ImageIcon(fajlNev).getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);

        this.setIcon(new ImageIcon(img));

        this.revalidate();
        this.repaint();
    }
}
