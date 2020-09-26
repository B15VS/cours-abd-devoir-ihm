/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dz.univjijel.informatique3l.abd.devoir.model;

import java.util.Date;

/**
 *
 * @author Tarek Boutefara <t_boutefara@esi.dz>
 */
public class Emprunt {
    
    String ISBN;
    int nSequentiel;
    int num;
    
    Date emprunt;
    Date retour;

    public Emprunt(String ISBN, int nSequentiel, int num) {
        this.ISBN = ISBN;
        this.nSequentiel = nSequentiel;
        this.num = num;
    }

    public Emprunt(String ISBN, int nSequentiel, int num, Date emprunt, Date retour) {
        this.ISBN = ISBN;
        this.nSequentiel = nSequentiel;
        this.num = num;
        this.emprunt = emprunt;
        this.retour = retour;
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

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Date getEmprunt() {
        return emprunt;
    }

    public void setEmprunt(Date emprunt) {
        this.emprunt = emprunt;
    }

    public Date getRetour() {
        return retour;
    }

    public void setRetour(Date retour) {
        this.retour = retour;
    }
    
    
    
}
