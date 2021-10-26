package com.company.news.moves;

import ru.ifmo.se.pokemon.*;

public class Seed_Bomb extends PhysicalMove {

    public Seed_Bomb() {
        super(Type.GRASS,80,100);
    }

    @Override
    protected String describe() {
        return "uses Seed Bomb";
    }

}
