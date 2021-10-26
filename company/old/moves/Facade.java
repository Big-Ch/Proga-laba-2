package com.company.old.moves;

import ru.ifmo.se.pokemon.*;
import java.util.Arrays;
import java.util.List;
import java.util.ListResourceBundle;
import java.util.ResourceBundle;

public class Facade extends PhysicalMove {
    public Facade() {
        super(Type.NORMAL,70,100);
    }
    protected double calcBaseDamage(Pokemon var1, Pokemon var2) {
        if (var1.getCondition()==Status.BURN || var1.getCondition()==Status.POISON || var1.getCondition()==Status.PARALYZE) {
            return 2*(0.4D * (double)var1.getLevel() + 2.0D) * this.power / 150.0D;
        }
        return (0.4D * (double)var1.getLevel() + 2.0D) * this.power / 150.0D;
    }

    protected String describe() {
        return "uses Facade";
    }
}
