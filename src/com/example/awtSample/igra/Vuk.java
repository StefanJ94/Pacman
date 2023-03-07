package com.example.awtSample.igra;

import com.example.awtSample.jedinice.Brzina;
import com.example.awtSample.jedinice.Lokacija;

public class Vuk extends Neprijatelj{
    private String boja;

    public Vuk(Lokacija lokacija, String slika, Brzina brzina, String boja) {
        super(lokacija, slika, brzina);
        this.boja = boja;
    }

    public String getBoja() {
        return boja;
    }
}
