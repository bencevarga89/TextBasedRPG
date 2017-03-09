package com.iamthekraken;

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
