package com.example.business;
import com.example.domain.*;

public class Store {
    private int score = 0;
    
    public int addFilm(Object o) {
        if (o instanceof ActionFilm) 
            score += 5;
        else if (o instanceof ComedyFilm)
            score += 6;
        
        return score;
    }
}
