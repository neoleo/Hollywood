package com.example.domain;

public abstract class Film {
    private int id = 0;
    private String title = "-required-";
    private int year = 2000;
    protected double IMDBRating;

    public Film(int id, String title, int year) {
        this.id = id;
        this.title = title;
        this.year = year;
    }
   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getIMDBRating() {
        return IMDBRating;
    }

    protected abstract void setIMDBRating(double IMDBRating);
}
