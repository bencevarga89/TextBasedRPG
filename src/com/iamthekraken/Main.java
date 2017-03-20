package com.iamthekraken;

public class Main {


    public static void main(String[] args) {

        CharacterCreator creator = new CharacterCreator();


        String name = creator.nameCreator();
        String characterClass = creator.classSelect();
        Hero hero = new Hero(name,characterClass);
        hero = CharacterCreator.classCreator(hero);

        Actions.PageCall(hero,1);

    }


}
