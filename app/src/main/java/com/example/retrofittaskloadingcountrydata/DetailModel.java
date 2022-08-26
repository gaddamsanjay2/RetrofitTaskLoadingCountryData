package com.example.retrofittaskloadingcountrydata;

public class DetailModel {

    String Director;
    String CEO;

    public DetailModel(String director, String CEO) {
        this.Director = director;
        this.CEO = CEO;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String director) {
       this.Director = director;
    }

    public String getCEO() {
        return CEO;
    }

    public void setCEO(String CEO) {
        this.CEO = CEO;
    }
}
