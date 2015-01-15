package com.example.domain;

/**
 *
 * @author utilizador
 */
public class RomanticComedyFilm extends ComedyFilm {
    private int kisses;
    
    public RomanticComedyFilm(int id, String title, int year) {
        super(id, title, year);
    }

    public RomanticComedyFilm(int id, String title, int year, int kisses) {
        super(id, title, year);
        setKisses(kisses);
    }

    @Override
    public String toString() {
        return super.getId() + "\n" + super.getTitle() + "\n" + super.getYear() + "\n" + getKisses();
    }
    
    @Override
     public void setIMDBRating(double IMDBRating){
         super.IMDBRating = IMDBRating; 
    }

    public int getKisses() {
        return kisses;
    }

    private void setKisses(int kisses) {
        this.kisses = kisses;
    }
}
