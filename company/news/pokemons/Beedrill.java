package com.company.news.pokemons;
import com.company.news.moves.Crunch;
import com.company.news.moves.Double_Team;
import com.company.news.moves.Tail_Whip;
import com.company.news.moves.Aerial_Ace;
import ru.ifmo.se.pokemon.*;

public class Beedrill extends Kakuna {
    public Beedrill(String name, int lvl) {
        super(name, lvl);
        setStats(	65,90,40, 45, 80, 75);
        setType(Type.POISON, Type.BUG);

        Tail_Whip tail_whip= new Tail_Whip();
        this.addMove(tail_whip);
        Aerial_Ace aerial_ace= new Aerial_Ace();
        this.addMove(aerial_ace);
        Crunch crunch= new Crunch();
        this.addMove(crunch);
        Double_Team double_team= new Double_Team();
        this.addMove(double_team);
    }

}
