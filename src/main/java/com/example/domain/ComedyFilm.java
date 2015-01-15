package com.example.domain;

public class ComedyFilm extends Film {
    private int funnySituatonsCount;
   
    public ComedyFilm(int id, String title, int year) {
        super(id, title, year);
        this.setIMDBRating((double) Math.random() * 10);
    }

    public ComedyFilm(int id, String title, int year, int fCount) {
        super(id, title, year);
        this.funnySituatonsCount = fCount;
        this.setIMDBRating((double) Math.random() * 10);
    }

    public int getFunnySituatonsCount() {
        return funnySituatonsCount;
    }

    public void setFunnySituatonsCount(int funnySituatonsCount) {
        this.funnySituatonsCount = funnySituatonsCount;
    }
    
    @Override
    public String toString() {
        return super.getId() + "\n" + super.getTitle() + "\n" + super.getYear() + "\n" + this.funnySituatonsCount;
    }
    
    @Override
     public void setIMDBRating(double IMDBRating){
         super.IMDBRating = IMDBRating; 
    }
}