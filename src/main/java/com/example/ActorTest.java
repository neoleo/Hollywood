package com.example;
import com.example.domain.*;
import java.util.Arrays;

public class ActorTest {
    
    public static void main(String... args) {
        Actor[] actors = 
            {  new Actor(101, "Sean", "Astin"),
               new Actor(102, "Martin", "Freeman"),
               new Actor(103, "Vigo", "Mortensen"),
               new Actor(103, "Dominic", "Monaghan") 
            };
        
        System.out.println("Before sorting---------");
        for (Actor b : actors)  
            System.out.println(b);
        
        Arrays.sort(actors, new ActorLastNameComparator());
        
        System.out.println("After sorting--------");
        for (Actor b : actors)  
            System.out.println(b);
        
    }
}
