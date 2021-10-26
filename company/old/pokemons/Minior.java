package com.company.old.pokemons;
import ru.ifmo.se.pokemon.*;

public class Minior extends Pokemon {
    public Minior(String name, int lvl) {
        super(name, lvl);
        setStats(60,60,100, 60, 100, 60);
        setType(Type.ROCK, Type.FLYING);

    }

}
