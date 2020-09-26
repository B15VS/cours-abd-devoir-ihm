/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dz.univjijel.informatique3l.abd.devoir.main;

import dz.univjijel.informatique3l.abd.devoir.gui.MainGUI;

/**
 * Point d'entrée.
 * Sert à lancer l'applciation en créant la fenêtre principale.
 * @author Tarek Boutefara <t_boutefara@esi.dz>
 */
public class Main {

    /**
     * La méthode main.
     * Pas de paramètres de lancement.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        (new MainGUI()).setVisible(true);
    }
    
}
