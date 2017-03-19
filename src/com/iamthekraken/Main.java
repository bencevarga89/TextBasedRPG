package com.iamthekraken;

import com.iamthekraken.com.iamthekraken.character.Hero;
import com.iamthekraken.com.iamthekraken.character.Warrior;

public class Main {


    public static void main(String[] args) {

        //Character Generator
//        CharacterCreator creator = new CharacterCreator();
//
//        String name = creator.NameCreator();
//        String heroClass = creator.ClassCreator();
//
//        Hero hero = new Hero(name, heroClass);
//        //Character Generator END
//
//        //Intro
//
//        Actions.PageCall(hero, 1);


        //TESTING WARRIOR CLASS

        Hero hero = new Hero("Janika","Warrior");
        Warrior warrior = new Warrior(hero.getHeroName(),hero.getHeroClass());

        System.out.println("Warrior health is: " + hero.getHeroHealth());
        System.out.println("Warrior health really is: " + warrior.getHeroHealth());

        // Ez a bajom... így ha a játékos Warrior-t választ, akkor mindig warrior.getHeroHealth-et kell hívni, de ha Mage-t pl
        //akkor meg mage.getHeroHealth... nem lehet ezt valahogy megoldani???


    }
}
