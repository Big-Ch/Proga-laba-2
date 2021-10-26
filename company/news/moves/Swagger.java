package com.company.news.moves;

import ru.ifmo.se.pokemon.*;

public class Swagger extends StatusMove {

    public Swagger() {
        super(Type.NORMAL,0,85);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect e = new Effect().turns(0).stat(Stat.ATTACK, 2);
        p.addEffect(e);
        p.confuse();
    }

    @Override
    protected String describe() {
        return "uses Swagger";
    }

}

