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
            case 11: fajlNev = "11-gyalog-feher.png"; break;
            case 12: fajlNev = "12-bastya-feher.png"; break;
            case 13: fajlNev = "13-huszar-feher.png"; break;
            case 14: fajlNev = "14-futo-feher.png"; break;
            case 15: fajlNev = "15-kiraly-feher.png"; break;
            case 16: fajlNev = "16-vezer-feher.png"; break;
            case 21: fajlNev = "21-gyalog-fekete.png"; break;
            case 22: fajlNev = "22-bastya-fekete.png"; break;
            case 23: fajlNev = "23-huszar-fekete.png"; break;
            case 24: fajlNev = "24-futo-fekete.png"; break;
            case 25: fajlNev = "25-kiraly-fekete.png"; break;
            case 26: fajlNev = "26-vezer-fekete.png"; break;
        }

        Image img = new ImageIcon(fajlNev).getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);

        this.setIcon(new ImageIcon(img));

        this.revalidate();
        this.repaint();
    }
}
