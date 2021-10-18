package com.example.serversideassignment1.model;

public class House {
    private String owner;
    private String address;
    private String noOfBedrooms;

    public House(String o, String a, String b) {
        this.owner=o;
        this.address=a;
        this.noOfBedrooms=b;
    }

    public String getowner() {
        return owner;
    }

    public void setowner(String owner) {
        this.owner = owner;
    }

    public String getaddress() {
        return address;
    }

    public void setaddress(String address) {
        this.address = address;
    }

    public String getNoOfBedrooms(){
        return noOfBedrooms;
    }
    public void setNoOfBedrooms(String noOfBedrooms){
        this.noOfBedrooms=noOfBedrooms;
    }
}
