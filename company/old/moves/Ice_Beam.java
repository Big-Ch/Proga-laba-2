package com.company.old.moves;

import ru.ifmo.se.pokemon.*;
import java.util.Arrays;
import java.util.List;
import java.util.ListResourceBundle;
import java.util.ResourceBundle;

public class Ice_Beam extends SpecialMove {
    public Ice_Beam() {
        super(Type.ICE,90,100);
    }
    protected void applyOppEffects(Pokemon p) {
        Effect e = new Effect().chance(0.1).turns(0).condition(Status.FREEZE);
        p.setCondition(e);
    }

    protected String describe() {
        return "uses Ice Beam";
    }
}
