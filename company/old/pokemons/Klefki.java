package com.company.old.pokemons;
import com.company.old.moves.Light_Screen;
import com.company.old.moves.Blizzard;
import com.company.old.moves.Facade;
import com.company.old.moves.Ice_Beam;
import ru.ifmo.se.pokemon.*;

public class Klefki extends Pokemon {
    public Klefki(String name, int lvl) {
        super(name, lvl);
        setStats(57,80,91, 80, 87, 75);
        setType(Type.STEEL, Type.FAIRY);
        Blizzard blizzard= new Blizzard();
        super.addMove(blizzard);
        Ice_Beam ice_beam= new Ice_Beam();
        super.addMove(ice_beam);
        Facade facade= new Facade();
        super.addMove(facade);
        Light_Screen light_screen= new Light_Screen();
        super.addMove(light_screen);
    }

}
