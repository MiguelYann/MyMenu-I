package com.ocr.anthony;

import java.util.Scanner;

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
    public void displayAvailableMenu() {
        System.out.println("Choix menu");
        System.out.println("1 - poulet");
        System.out.println("2 - boeuf");
        System.out.println("3 - végétarien");
        System.out.println("Que souhaitez-vous comme menu ?");
    }

    public void runMenu(){
        this.displayAvailableMenu();
        Scanner sc = new Scanner(System.in);
        int nb = sc.nextInt();
        this.displaySelectedMenu(nb);

    }


}
