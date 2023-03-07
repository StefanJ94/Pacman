package com.example.awtSample;

import com.example.awtSample.igra.NepokretanObjekat;
import com.example.awtSample.igra.Objekat;
import com.example.awtSample.jedinice.Duzina;
import com.example.awtSample.jedinice.Lokacija;

import java.util.LinkedList;
import java.util.List;
 /*
         2D Pacman game
              - objekti (x, y, slika)
              - nepokretni (naziv)
              - pokretni   (brzina)
                  - igraci (naziv, snaga, zivot, funkcije za kretanje)
                  - neprijatelji (snaga, zivot)
                    - vuk                                          */

public class Main {

    public static void main(String[] args) {

        List<Objekat> listaObjekataIgre = new LinkedList<Objekat>();

        NepokretanObjekat no1 = new NepokretanObjekat(
                new Lokacija(
                        Duzina.fromMeters(10),
                        Duzina.fromMeters(10)
                ),"slike/jedinica001.png",
                   "Drvo" );

        listaObjekataIgre.add(no1);



        /*prikaziPredjeniPut(Brzina.fromKilometersPerHour(110),Vreme.fromMinutes(4));
        prikaziPredjeniPut(Brzina.fromMetersPerSecond(4),Vreme.fromHours(4));*/
    }

    /*public static void prikaziPredjeniPut(Brzina brzina, Vreme vreme) {
        Put p = Put.fromMeters(brzina.toMetersPerSecond() * vreme.toSeconds());
        System.out.println("Predjeni put je: " + p.toKilometers() + "km");
    }*/
}
