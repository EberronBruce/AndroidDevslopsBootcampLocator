package com.redravencomputing.bootcamplocator.services;

import com.redravencomputing.bootcamplocator.model.Devslopes;

import java.util.ArrayList;

/**
 * Created by bruceburgess on 4/18/17.
 */

public class DataService {
    private static DataService instance = new DataService();

    public static DataService getInstance() {
        return instance;
    }

    private DataService() {

    }

    public ArrayList<Devslopes> getBootcampLocationsWithin10MilesOfZip(int zipcode) {
        //Pretending we are downloading data from the server

        ArrayList<Devslopes> list = new ArrayList<>();
        list.add(new Devslopes(40.417f, -111.774f, "Lone Peak", "10189 N 4800 W, Highland, UT 84003","slo"));
        list.add(new Devslopes(40.393f, -111.771f, "Mount Timpanogos","742 N 900 E, American Fork, UT 84003","slo"));
        list.add(new Devslopes(40.395f, -111.773f, "USDC", "895 N 900 E, American Fork, UT 84003", "slo"));
        return list;
    }
}
