package com.company.news.moves;

import ru.ifmo.se.pokemon.*;

public class Focus_Blast extends SpecialMove {

    public Focus_Blast() {
        super(Type.FIGHTING,120,70);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect e = new Effect().chance(0.1).turns(0).stat(Stat.SPECIAL_DEFENSE, -1);
        p.addEffect(e);
    }

    @Override
    protected String describe() {
        return "uses Focus Blast";
    }

}
