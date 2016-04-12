package com.companyname.listproject;

/**
 * Created by David on 4/11/2016.
 */
public class Player {

    private String name;
    private String position;

    public Player(String name, String position) {
        setName(name);
        setPosition(position);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

}
