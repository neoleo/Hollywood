package com.example;

import java.util.ArrayList;
import java.util.List;
import com.example.domain.*;

public class ActorStringSplitTestin {

    public static void main(String[] args) {
        String[] actors = new String[11];
        List<Actor> actorList = new ArrayList<>(11);

        actors[0] = "1,Tom,Hanks";
        actors[1] = "2,Harrison,Ford";
        actors[2] = "3,Tom,Cruise";
        actors[3] = "4,Jack,Nicholson ";
        actors[4] = "5,Robert,De Niro";
        actors[5] = "6,Al,Pacino";
        actors[6] = "7,Dustin,Hoffman";
        actors[7] = "8,Anthony,Hopkins";
        actors[8] = "9,Paul,Newman";
        actors[9] = "10,Denzel,Washington";
        actors[10] = "11,Morgan,Freeman";

        // Parse text
        for (String curLine : actors) {
            String[] e = curLine.split(",");
            actorList.add(new Actor(Integer.parseInt(e[0]), e[1], e[2]));
        }

        // Print out the shirts
        System.out.println("=== Actors List ===");
        for (Actor actor : actorList) {
            System.out.println(actor);
        }
    }

}
