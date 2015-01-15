package com.example;
import com.example.domain.*;
import com.example.business.*;
import java.util.ArrayList;
import java.util.List;

class A {}
class B extends A {}

public class FilmTest {
    
    static void printFilme(Object f){
         System.out.println(f);
    }
    
    public static void main(String... args) {
        ActionFilm a = new ActionFilm(0, "Die Hard", 1988, 25);
        ComedyFilm c = new ComedyFilm(1, "Borat: Cultural Learnings...", 2006, 42);
        
        Store s = new Store();
        System.out.println(s.addFilm(a) + " " + s.addFilm(c));
        printFilme(a);
        printFilme(c);
        
        RomanticComedyFilm r = new RomanticComedyFilm(2, "Pretty Woman", 2000, 20);
        printFilme(r);

        List<A>  l = new ArrayList<>(); 
    }
}
