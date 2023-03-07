package com.example.awtSample;

import com.example.awtSample.igra.Igrac;
import com.example.awtSample.igra.NepokretanObjekat;
import com.example.awtSample.igra.Objekat;
import com.example.awtSample.igra.Vuk;
import com.example.awtSample.jedinice.Brzina;
import com.example.awtSample.jedinice.Duzina;
import com.example.awtSample.jedinice.Lokacija;
import com.example.awtSample.jedinice.Vreme;

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
                   "Drvo"
        );

        Vuk v1 = new Vuk(
                new Lokacija(
                        Duzina.fromMeters(10),
                        Duzina.fromMeters(12)
                ),"slike/vuk.png",
                Brzina.fromKilometersPerHour(40),
                "crna"
        );

        Vuk v2 = new Vuk(
                new Lokacija(
                        Duzina.fromMeters(10),
                        Duzina.fromMeters(13)
                ),"slike/vuk2.png",
                Brzina.fromKilometersPerHour(45),
                "siva"
        );

        Igrac i = new Igrac(
                new Lokacija(
                        Duzina.fromMeters(30),
                        Duzina.fromMeters(33)
                ),"slike/packman.png",
                Brzina.fromKilometersPerHour(30)
        );

        listaObjekataIgre.add(no1);
        listaObjekataIgre.add(v1);
        listaObjekataIgre.add(v2);
        listaObjekataIgre.add(i);

        System.out.println(listaObjekataIgre.size());

        v1.move(Vreme.fromMinutes(2));
        v2.move(Vreme.fromMinutes(2));


        /*prikaziPredjeniPut(Brzina.fromKilometersPerHour(110),Vreme.fromMinutes(4));
        prikaziPredjeniPut(Brzina.fromMetersPerSecond(4),Vreme.fromHours(4));*/
    }

    /*public static void prikaziPredjeniPut(Brzina brzina, Vreme vreme) {
        Put p = Put.fromMeters(brzina.toMetersPerSecond() * vreme.toSeconds());
        System.out.println("Predjeni put je: " + p.toKilometers() + "km");
    }*/
}
