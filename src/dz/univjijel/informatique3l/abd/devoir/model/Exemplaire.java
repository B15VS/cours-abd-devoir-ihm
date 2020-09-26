/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dz.univjijel.informatique3l.abd.devoir.model;

/**
 *
 * @author Tarek Boutefara <t_boutefara@esi.dz>
 */
public class Exemplaire {
    
    String ISBN;
    int nSequentiel;
    String etat;

    public Exemplaire(String ISBN, int nSequentiel, String etat) {
        this.ISBN = ISBN;
        this.nSequentiel = nSequentiel;
        this.etat = etat;
    }

    public Exemplaire() {
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getnSequentiel() {
        return nSequentiel;
    }

    public void setnSequentiel(int nSequentiel) {
        this.nSequentiel = nSequentiel;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }
    
    
    
}
