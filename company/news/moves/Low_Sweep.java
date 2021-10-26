package com.company.news.moves;

import ru.ifmo.se.pokemon.*;

public class Low_Sweep extends PhysicalMove {

    public Low_Sweep() {
        super(Type.FIGHTING,65,100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect e = new Effect().turns(0).stat(Stat.SPEED, -1);
        p.addEffect(e);
    }

    @Override
    protected String describe() {
        return "uses Low Sweep";
    }

}
