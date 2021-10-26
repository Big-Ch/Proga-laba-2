package com.company.news.pokemons;
import com.company.news.moves.Tail_Whip;
import com.company.news.moves.Aerial_Ace;
import ru.ifmo.se.pokemon.*;

public class Kakuna extends Pokemon {
    public Kakuna(String name, int lvl) {
        super(name, lvl);
        setStats(	45,25,50, 25, 25, 35);
        setType(Type.BUG, Type.POISON);

        Tail_Whip tail_whip= new Tail_Whip();
        this.addMove(tail_whip);
        Aerial_Ace aerial_ace= new Aerial_Ace();
        this.addMove(aerial_ace);

    }

}
