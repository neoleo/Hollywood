package com.example.domain;

public final class Actor {
    private int actorID = 0;
    private String firstName = "-required";
    private String lastName = "-required-";
    
    public Actor(int ID, String firstName, String lastName) {
        setActorID(ID);
        setFirstName(firstName);
        setLastName(lastName);
    };

    public int getActorID() {
        return actorID;
    }

    public void setActorID(int actorID) {
        this.actorID = actorID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return getActorID() + "\n" + getFirstName() + "\n" + getLastName() + "\n";
    }
    
}
