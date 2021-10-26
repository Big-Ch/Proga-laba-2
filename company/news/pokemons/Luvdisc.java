package com.company.news.pokemons;
import com.company.news.moves.Work_Up;
import com.company.news.moves.Dazzling_Gleam;
import com.company.news.moves.Focus_Blast;
import com.company.news.moves.Horn_Attack;
import ru.ifmo.se.pokemon.*;

public class Luvdisc extends Pokemon {
    public Luvdisc(String name, int lvl) {
        super(name, lvl);
        setStats(	43,30,55, 40, 65, 97);
        setType(Type.WATER);
        Work_Up work_up= new Work_Up();
        this.addMove(work_up);
        Dazzling_Gleam dazzling_gleam= new Dazzling_Gleam();
        this.addMove(dazzling_gleam);
        Horn_Attack horn_attack= new Horn_Attack();
        this.addMove(horn_attack);
        Focus_Blast focus_blast= new Focus_Blast();
        this.addMove(focus_blast);
    }

}