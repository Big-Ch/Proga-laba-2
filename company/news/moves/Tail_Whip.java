package com.company.news.moves;

import ru.ifmo.se.pokemon.*;

public class Tail_Whip extends StatusMove {

    public Tail_Whip() {
        super(Type.FIGHTING,0,100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect e = new Effect().turns(0).stat(Stat.DEFENSE, -1);
        p.addEffect(e);
    }

    @Override
    protected String describe() {
        return "uses Tail Whip";
    }

}
