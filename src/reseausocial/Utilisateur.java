/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reseausocial;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Mara
 */
public class Utilisateur {
    private int ID;
    private String username;
    private String nom;
    private String prenom;
    private String email;
    private String motDePasse;
    private String telephone;
    private String adresse;
    private ArrayList<Utilisateur> amis;
    private TypeUtilisateur type;
    private ArrayList<Message> messagesEnvoyes = new ArrayList<>();
    private ArrayList<Message> messagesRecus = new ArrayList<>();
    private ArrayList<Integer> demandesEnvoyes = new ArrayList<>();
    private ArrayList<Integer> demandesRecues = new ArrayList<>();    
    private ArrayList<Post> posts = new ArrayList<>();
    
    public Utilisateur(int ID, String username, String motDePasse) {
        this.username = username;
        this.motDePasse = motDePasse;
        this.ID = ID;
        this.type = TypeUtilisateur.ETUDIANT;
    }
    
    public Utilisateur(String username, String motDePasse) {
        this.username = username;
        this.motDePasse = motDePasse;
        this.ID = (int)(Math.random() * 10);
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public ArrayList<Utilisateur> getAmis() {
        return amis;
    }

    public void setAmis(ArrayList<Utilisateur> amis) {
        this.amis = amis;
    }

    public TypeUtilisateur getType() {
        return type;
    }

    public void setType(TypeUtilisateur type) {
        this.type = type;
    }
    
    public void recevoirMessage(Message message) {
        this.messagesRecus.add(message);
    }
    
    public boolean seConnecter() {
        CollectionUtilisateurs baseDonnees = CollectionUtilisateurs.getInstance();
        
        if(baseDonnees.contientUtilisateur(this)){
            System.out.println("Bienvenu(e), " + this.username + "!");
            return true;
        }
        else
            System.out.println("Desolée, vous n'avez encore un compte. S'il "
                    + "vous plaît contactez votre chef d'année pour résoudre "
                    + "le problème.");
        return false;
    }
    
    public void seDeconnecter() {
        System.out.println("Vous avez été déconnecté(e)!");
    }
    
    public void changerMotDePasse(String ancienMotDePasse, String nouveauMotDePasse) {
        if(nouveauMotDePasse != ancienMotDePasse) {
            this.setMotDePasse(nouveauMotDePasse);
        } else {
            System.out.println("New password can't be the same as old password!");
        }
    }
    
    public void editInfo(Utilisateur utilisateur) {
        this.setUsername(utilisateur.username);
        this.setAdresse(utilisateur.adresse);
        this.setAmis(utilisateur.amis);
        this.setEmail(utilisateur.email);
        this.setMotDePasse(utilisateur.motDePasse);
        this.setNom(utilisateur.nom);
        this.setPrenom(utilisateur.prenom);
        this.setTelephone(utilisateur.telephone);
        this.setType(utilisateur.type);
    }
    
    public String voirInfo(Utilisateur utilisateur) { 
        return utilisateur.getNom() + " " + utilisateur.getPrenom() + ", email " +
                utilisateur.getEmail() + ", tel. " + utilisateur.getTelephone();
    }

    public ArrayList<Integer> getDemandesEnvoyes() {
        return demandesEnvoyes;
    }

    public ArrayList<Integer> getDemandesRecues() {
        return demandesRecues;
    }
    
    public void envoyerDemandeAmi(int ID) {
        CollectionUtilisateurs conn = CollectionUtilisateurs.getInstance();
        
        Utilisateur u = conn.getUtilisateur(ID);
        u.recevoirDemandeAmi(ID);
        conn.updateUtilisateur(u);
        
        u = conn.getUtilisateur(this.ID);
        u.ajouterDemandeEnvoyee(ID);
        conn.updateUtilisateur(u);
    }
    
    public void recevoirDemandeAmi(int ID){
        this.demandesRecues.add(ID);
    }
    
    private void ajouterDemandeEnvoyee(int ID){
        this.demandesEnvoyes.add(ID);
    }
    
    public void changerPhotoProfil() {
        
    }
    
    public void envoyerMessage(Message message){
        CollectionUtilisateurs conn = CollectionUtilisateurs.getInstance();
        
        Utilisateur u = conn.getUtilisateur(message.getaQui());
        u.recevoirMessage(message);
        conn.updateUtilisateur(u);
        
        Utilisateur u2 = conn.getUtilisateur(message.getDeQui());
        u2.addMessageEnvoye(message);
        conn.updateUtilisateur(u2);
    }

    public ArrayList<Message> getMessagesEnvoyes() {
        return messagesEnvoyes;
    }

    public ArrayList<Message> getMessagesRecus() {
        return messagesRecus;
    }
    
    private void addMessageEnvoye(Message message) {
        this.messagesEnvoyes.add(message);
    }
    
    public void ajouterPost(Post post) {
        this.posts.add(post);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Utilisateur other = (Utilisateur) obj;
        if (!Objects.equals(this.username, other.username)) {
            return false;
        }
        if (!Objects.equals(this.motDePasse, other.motDePasse)) {
            return false;
        }
        return true;
    }
    
    
}
