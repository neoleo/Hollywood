package com.example.domain;

public class ActionFilm extends Film {
    private int explosionsCount;
   
    public ActionFilm(int id, String title, int year) {
        super(id, title, year);
        this.setIMDBRating((double) Math.random() * 10);
    }
    
    public ActionFilm(int id, String title, int year, int eCount) {
        super(id, title, year);
        this.explosionsCount = eCount;
        this.setIMDBRating((double) Math.random() * 10);
    }

    public int getExplosionsCount() {
        return explosionsCount;
    }

    public void setExplosionsCount(int explosionsCount) {
        this.explosionsCount = explosionsCount;
    }
    
    @Override
    public String toString() {
        return super.getId() + "\n" + super.getTitle() + "\n" + super.getYear() + "\n" + this.explosionsCount;
    }
    
    /**
     *
     * @param IMDBRating
     */
    @Override
     public final void setIMDBRating(double IMDBRating){
         super.IMDBRating = IMDBRating; 
    }
}