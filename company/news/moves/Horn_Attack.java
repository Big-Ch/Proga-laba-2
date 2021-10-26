package com.company.news.moves;

import ru.ifmo.se.pokemon.*;

public class Horn_Attack extends PhysicalMove {

    public Horn_Attack() {
        super(Type.NORMAL,65,100);
    }

    @Override
    protected String describe() {
        return "uses Horn Attack";
    }

}

