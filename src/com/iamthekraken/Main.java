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
        theStory.add(new Actions(1,"The Story is now beginning"));
        theStory.add(new Actions(2, "This is now the second page of the story")); //működőképes lenne?

        printTheActions(theStory); // nem printel :(((

    }

    public static void printTheActions (ArrayList<Actions> theStory){
        for (int i = 0; i < theStory.size(); i++){
            System.out.println(theStory.get(i));  //nem akarja valamiért ....
        }
    }
}
