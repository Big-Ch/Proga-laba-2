package com.company.news.moves;

import ru.ifmo.se.pokemon.*;

public class Aerial_Ace extends PhysicalMove {

    public  Aerial_Ace() {
        super(Type.FLYING,60,0);
    }

    @Override
    protected boolean checkAccuracy(Pokemon var1, Pokemon var2) {
        return true;
    }

    @Override
    protected String describe() {
        return "uses  Aerial Ace";
    }

}
