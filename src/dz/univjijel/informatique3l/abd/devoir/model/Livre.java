/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dz.univjijel.informatique3l.abd.devoir.model;

/**
 * Implémentation de l'entité Livre.
 * @author Tarek Boutefara <t_boutefara@esi.dz>
 */
public class Livre {
    
    String ISBN;
    String titre;
    String auteur;
    String edition;
    int anneePublication;

    public Livre() {
    }

    public Livre(String ISBN, String titre, String auteur, String edition, int anneePublication) {
        this.ISBN = ISBN;
        this.titre = titre;
        this.auteur = auteur;
        this.edition = edition;
        this.anneePublication = anneePublication;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public int getAnneePublication() {
        return anneePublication;
    }

    public void setAnneePublication(int anneePublication) {
        this.anneePublication = anneePublication;
    }
    
    
    
    
}
