/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dz.univjijel.informatique3l.abd.devoir.exemple;

import dz.univjijel.informatique3l.abd.devoir.model.Client;
import dz.univjijel.informatique3l.abd.devoir.model.Emprunt;
import dz.univjijel.informatique3l.abd.devoir.model.Exemplaire;
import dz.univjijel.informatique3l.abd.devoir.model.Livre;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Cette classe crée des données exemple.
 * Elle joue le role d'une base de données.
 * @author Tarek Boutefara <t_boutefara@esi.dz>
 */
public class DonneesExemples {
    
    public static List<Livre> LIVRES;
    public static List<Client> CLIENTS;
    public static List<Exemplaire> EXEMPLAIRES;
    public static List<Emprunt> EMPRUNTS;
    
    public static List<Livre> getLivres(){
        
        if(LIVRES == null){
            LIVRES = new ArrayList<>();
            LIVRES.add(new Livre("978-0134685991", "Effective Java", "Joshua Bloch ", "Addison-Wesley Professional", 2017));
            LIVRES.add(new Livre("978-0135166307", "Core Java Volume I--Fundamentals (Core Series)", "Cay Horstmann", "Pearson", 2020));
            LIVRES.add(new Livre("978-2212111002", "Le Livre de Java premier langage", "Anne Tasso", "Eyrolles", 2002));
            LIVRES.add(new Livre("978-0321349606", "Java Concurrency in Practice 1st Edition", "Brian Goetz", "Addison-Wesley Professional", 2006));
            LIVRES.add(new Livre("978-1789957051", "Learn Java 12 Programming", "Nick Samoylov", "Packt Publishing", 2019));
        }
        
        return LIVRES;
    }
    
    public static List<Exemplaire> getExemplaires(){
        
        if(EXEMPLAIRES == null){
            EXEMPLAIRES = new ArrayList<>();
            EXEMPLAIRES.add(new Exemplaire("978-0134685991", 1, "Disponible"));
            EXEMPLAIRES.add(new Exemplaire("978-0134685991", 2, "Disponible"));
            EXEMPLAIRES.add(new Exemplaire("978-0134685991", 3, "Disponible"));
            EXEMPLAIRES.add(new Exemplaire("978-0134685991", 4, "Disponible"));
            EXEMPLAIRES.add(new Exemplaire("978-0135166307", 1, "Disponible"));
            EXEMPLAIRES.add(new Exemplaire("978-0135166307", 2, "Disponible"));
            EXEMPLAIRES.add(new Exemplaire("978-2212111002", 1, "Disponible"));
            EXEMPLAIRES.add(new Exemplaire("978-2212111002", 2, "Disponible"));
            EXEMPLAIRES.add(new Exemplaire("978-2212111002", 3, "Disponible"));
            EXEMPLAIRES.add(new Exemplaire("978-0321349606", 1, "Disponible"));
            EXEMPLAIRES.add(new Exemplaire("978-1789957051", 1, "Disponible"));
            
        }
        
        return EXEMPLAIRES;
    }
    
    public static List<Client> getClients(){
        
        if(CLIENTS == null){
            CLIENTS = new ArrayList<>();
            CLIENTS.add(new Client(1000, "Ben Amer", "Amer"));
            CLIENTS.add(new Client(2000, "Ben Ahmed", "Ahmed"));
        }
        
        return CLIENTS;
    }
    
    public static List<Emprunt> getEmprunts(){
        
        if(EMPRUNTS == null){
            EMPRUNTS = new ArrayList<>();
            EMPRUNTS.add(new Emprunt("978-0134685991", 1, 1000, new Date(2020, 1, 1), new Date(2020, 1, 10)));
            EMPRUNTS.add(new Emprunt("978-2212111002", 2, 1000, new Date(2020, 1, 11), new Date(2020, 1, 16)));
            EMPRUNTS.add(new Emprunt("978-0321349606", 1, 1000, new Date(2020, 2, 1), null));
            EMPRUNTS.add(new Emprunt("978-1789957051", 1, 2000, new Date(2020, 1, 15), new Date(2020, 1, 18)));
            EMPRUNTS.add(new Emprunt("978-0135166307", 1, 2000, new Date(2020, 2, 3), new Date(2020, 2, 9)));
        }
        
        return EMPRUNTS;
    }
    
    
    
}
