package com.iamthekraken;

import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {

        CharacterCreator creator = new CharacterCreator();


        String name = creator.nameCreator();
        String characterClass = creator.classSelect();
        Hero hero = new Hero(name,characterClass);
        hero = CharacterCreator.classCreator(hero);

        ArrayList<Actions> theStory = new ArrayList<Actions>();
        theStory.add(new Actions(1,"The Story is now beginning"));  //működőképes lenne?

        for (int i = 0; i < theStory.size(); i++){
            System.out.println(theStory.get(i));  //nem akarja valamiért ....
        }



    }


}
