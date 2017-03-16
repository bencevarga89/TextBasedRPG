package com.iamthekraken;

import com.iamthekraken.com.iamthekraken.character.CharacterCreator;
import com.iamthekraken.com.iamthekraken.character.Hero;

public class Main {


    public static void main(String[] args) {

        //Character Generator
        CharacterCreator creator = new CharacterCreator();

        String name = creator.NameCreator();
        String heroClass = creator.ClassCreator();

        Hero hero = new Hero(name, heroClass);
        //Character Generator END

        //Intro

        Actions.PageCall(hero, 1);
    }
}
