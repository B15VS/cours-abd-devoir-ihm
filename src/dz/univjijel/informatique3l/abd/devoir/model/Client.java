/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dz.univjijel.informatique3l.abd.devoir.model;

/**
 * Implémentation de l'entité Client.
 * @author Tarek Boutefara <t_boutefara@esi.dz>
 */
public class Client {
    
    int num;
    String nom;
    String prenom;

    public Client() {
    }

    public Client(int num, String nom, String prenom) {
        this.num = num;
        this.nom = nom;
        this.prenom = prenom;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    
    
}
