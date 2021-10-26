package com.company;
import com.company.news.pokemons.*;
import com.company.news.moves.*;
import ru.ifmo.se.pokemon.*;

public class Main {

    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon p1 = new Pokemon("Чужой", 1);
        Pokemon p2 = new Pokemon("Хищник", 1);
        Luvdisc p3= new Luvdisc("Рыба", 1);
        Flaaffy p4= new Flaaffy("Овца", 1);
        Snorlax p5= new Snorlax("Жирный", 1);
        Kakuna p6= new Kakuna("Кака", 1);
        Ekans p7= new Ekans("Змий", 1);
        Beedrill p8= new Beedrill("Бидрилл", 1);
        b.addAlly(p3);
        b.addAlly(p4);
        b.addAlly(p5);
        b.addAlly(p1);
        b.addFoe(p2);
        b.addFoe(p6);
        b.addFoe(p7);
        b.addFoe(p8);
        b.go();
    }
}
