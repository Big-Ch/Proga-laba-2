package com.company.old.pokemons;
import ru.ifmo.se.pokemon.*;

public class Clefable extends Cleffa {
    public Clefable(String name, int lvl) {
        super(name, lvl);
        setStats(70, 45, 48, 60, 65, 35);
        setType(Type.FAIRY);
    }

}

