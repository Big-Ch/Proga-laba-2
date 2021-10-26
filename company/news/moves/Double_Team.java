package com.company.news.moves;

import ru.ifmo.se.pokemon.*;

public class Double_Team extends StatusMove {

    public Double_Team() {
        super(Type.NORMAL,0,0);
    }

    @Override
    protected boolean checkAccuracy(Pokemon var1, Pokemon var2) {
        return true;
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        Effect e = new Effect().turns(0).stat(Stat.EVASION, 1);
        p.addEffect(e);
    }

    @Override
    protected String describe() {
        return "uses Double Team";
    }

}
