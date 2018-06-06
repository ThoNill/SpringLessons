package org.rest.entities;

public class Kunde {
    private int id;
    private String name;
    
    public Kunde(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }
    
    public Kunde() {
        super();
    }
    
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
