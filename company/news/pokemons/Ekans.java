package com.company.news.pokemons;
import com.company.news.moves.Aerial_Ace;
import com.company.news.moves.Crunch;
import com.company.news.moves.Tail_Whip;
import ru.ifmo.se.pokemon.*;

public class Ekans extends Pokemon {
    public Ekans(String name, int lvl) {
        super(name, lvl);
        setStats(	35,60,44, 40, 54, 55);
        setType(Type.POISON);

        Tail_Whip tail_whip= new Tail_Whip();
        this.addMove(tail_whip);
        Aerial_Ace aerial_ace= new Aerial_Ace();
        this.addMove(aerial_ace);
        Crunch crunch= new Crunch();
        this.addMove(crunch);

    }

}
