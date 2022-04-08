package edu.lab04;

import edu.CBusRoute;

public class Main {

    public static void main(String[] args) {
        CBusRoute bus = new CBusRoute(129);
        CBusRoute tram = new CBusRoute(4);

        bus.addBusStop("Pętla", 750, 3.5f);
        bus.addBusStop("Wiadukt");
        bus.addBusStop("Rondo", 1200, 6.0f, "Nowa Huta","Krowodrza","Kleparz");
        bus.addBusStop("Zajezdnia","Bronowice","Centrum");
        System.out.println(bus);

        tram.addBusStop("Dworzec Glowny", 500, 2.5f);
        tram.addBusStop("Galeria Centrum", 600, 3.0f);
        tram.addBusStop("Politechnika", 1200,6.0f,"AGH","UJ","Akademia Rolnicza");
        tram.addBusStop("Cmentarz Rakowicki", 400,2.0f);
        tram.addBusStop("Wilenska",400,2.0f,"Kurdwanow","Prokocim");
        tram.addBusStop("Zajednia");

        System.out.println(tram);
    }
}
