package com.company;

import com.company.felulet.SakkFelulet;
import com.company.logika.SakkTabla;

public class Main {

    public static void main(String[] args) {

        SakkTabla t = new SakkTabla();
        SakkFelulet f = new SakkFelulet();

        System.out.println(t);

        t.lep(6, 4, 4, 4);
        System.out.println(t);
    }
}
