package com.ocr.anthony;

public class Order {
    /**
     * Display all available menus in the restaurant.
     */

    /**
     * Display a selected menu.
     * @param nbMenu The selected menu.
     */
    public void displaySelectedMenu(int nbMenu) {
        switch(nbMenu){
            case 1 :
                System.out.println("Vous avez choisi comme menu : poulet");
                break;

            case 2 :
                System.out.println("Vous avez choisi comme menu : boeuf");
                break;
            case 3 :
                System.out.println("Vous avez choisi comme menu : végétarien");
                break;
             default:
                 System.out.println("Vous n'avez pas choisi de menu parmi les choix proposés");
                 break;





        }



    }


}