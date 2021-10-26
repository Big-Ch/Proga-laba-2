package com.company.news.moves;

import ru.ifmo.se.pokemon.*;

public class Dazzling_Gleam extends SpecialMove {

    public Dazzling_Gleam() {
        super(Type.FAIRY,80,100);
    }

    @Override
    protected String describe() {
        return "uses Dazzling Gleam";
    }

}