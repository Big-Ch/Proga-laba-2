package com.company.news.pokemons;
import com.company.news.moves.Swagger;
import com.company.news.moves.Headbutt;
import com.company.news.moves.Low_Sweep;
import com.company.news.moves.Seed_Bomb;
import ru.ifmo.se.pokemon.*;

public class Snorlax extends Pokemon {
    public Snorlax(String name, int lvl) {
        super(name, lvl);
        setStats(	160,110,65, 65, 110, 30);
        setType(Type.NORMAL);
        Swagger swagger= new Swagger();
        this.addMove(swagger);
        Seed_Bomb seed_bomb= new Seed_Bomb();
        this.addMove(seed_bomb);
        Headbutt headbutt= new Headbutt();
        this.addMove(headbutt);
        Low_Sweep low_sweep= new Low_Sweep();
        this.addMove(low_sweep);
    }

}
