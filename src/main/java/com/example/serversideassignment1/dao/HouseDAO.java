package com.example.serversideassignment1.dao;
import com.example.serversideassignment1.model.House;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;



public enum HouseDAO {
    instance;//the ONE instance that we can use to access "db"
    //users needs to be global so it can be accessed in any method (ie getList())
    ArrayList<House> houses = new ArrayList();;

    private HouseDAO() {
        //create new arraylist


        //pretending we have a database for now
        // create 3 users and add to arraylist
        houses.add(new House("Burkes", "Clara","3"));
        houses.add(new House("Devines","Pollough","2"));
        houses.add(new House("Maher", "Kilbeggan","4"));
    }

    public ArrayList<House> getList(){
        return houses;
    }








}
