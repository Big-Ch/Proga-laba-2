package com.company.old.moves;

import ru.ifmo.se.pokemon.*;
import java.util.Arrays;
import java.util.List;
import java.util.ListResourceBundle;
import java.util.ResourceBundle;

public class Light_Screen extends StatusMove {
    public Light_Screen() {
        super(Type.PSYCHIC, 0, 0);
    }
    protected boolean checkAccuracy(Pokemon var1, Pokemon var2) {
        return true;
    }

    protected void applySelfEffects(Pokemon p) {
        Effect e = new Effect().turns(5).stat(Stat.SPECIAL_DEFENSE, (int) (p.getStat(Stat.SPECIAL_DEFENSE)*1.5));
        p.setCondition(e);
    }

    protected String describe() {
        return "uses Light Screen";
    }
}
