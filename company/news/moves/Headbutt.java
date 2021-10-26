package com.company.news.moves;

import ru.ifmo.se.pokemon.*;

public class Headbutt extends PhysicalMove {

    public Headbutt() {
        super(Type.NORMAL,70,100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect e = new Effect().turns(0).attack(0.7);
        p.addEffect(e);
    }

    @Override
    protected String describe() {
        return "uses Headbutt";
    }

}
