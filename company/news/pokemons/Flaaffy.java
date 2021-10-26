package com.company.news.pokemons;
import com.company.news.moves.Headbutt;
import com.company.news.moves.Seed_Bomb;
import com.company.news.moves.Swagger;
import ru.ifmo.se.pokemon.*;

public class Flaaffy extends Pokemon {
    public Flaaffy(String name, int lvl) {
        super(name, lvl);
        setStats(	70,55,55, 80, 60, 45);
        setType(Type.ELECTRIC);
        Swagger swagger= new Swagger();
        this.addMove(swagger);
        Seed_Bomb seed_bomb= new Seed_Bomb();
        this.addMove(seed_bomb);
        Headbutt headbutt= new Headbutt();
        this.addMove(headbutt);
    }

}
