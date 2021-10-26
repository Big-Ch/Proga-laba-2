package com.company.news.moves;

import ru.ifmo.se.pokemon.*;

public class Work_Up extends StatusMove {

    public Work_Up() {
        super(Type.NORMAL,0,0);
    }

    @Override
    protected boolean checkAccuracy(Pokemon var1, Pokemon var2) {
        return true;
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        Effect e = new Effect().turns(0).stat(Stat.ATTACK, 1).stat(Stat.SPECIAL_ATTACK, 1);
        p.addEffect(e);
    }

    @Override
    protected String describe() {
        return "uses Work Up";
    }

}
