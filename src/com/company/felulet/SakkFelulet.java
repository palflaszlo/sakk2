package com.company.felulet;

import com.company.logika.SakkTabla;

import javax.swing.*;
import java.awt.*;

public class SakkFelulet extends JFrame {

    private Container foAblak;
    private JPanel pnlJatekTabla;
    private SakkTabla tabla;


    public  SakkFelulet(){
        this.tabla = new SakkTabla();

        this.initComponents();

        this.sakkTablaMegjelenit();
    }


    private void initComponents(){

        this.setTitle("Sakk 1.0");
        int width = (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth();
        int height = (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight();
        this.setSize(width, height);

        this.setAlwaysOnTop(true);

        this.foAblak = this.getContentPane();
        this.foAblak.setLayout(new BorderLayout(10, 10));


        this.pnlJatekTabla = new JPanel();
        this.pnlJatekTabla.setLayout(new GridLayout(9,9));

        this.foAblak.add(BorderLayout.CENTER, this.pnlJatekTabla);



        this.setLocationRelativeTo(null);

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
    }


    public void sakkTablaMegjelenit(){
        this.pnlJatekTabla.removeAll();

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                Mezo m = new Mezo(i,j, tabla.getErtek(i,j));
                //m.setText(this.tabla.getErtek(i,j)+"");
                this.pnlJatekTabla.add(m);
            }
        }


        this.revalidate();
        this.repaint();
    }

}
