/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author fatima
 */
@Entity
public class Admin implements Serializable {

    

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nom;
    private String prenom;
    @ManyToOne
    private Pays pays;
    @OneToOne
    private User user;
    @OneToMany(mappedBy = "admin")
    private List<Recruteur> recruteurs;

    @OneToMany(mappedBy = "admin")
    private List<Paiement> paiements;

    @OneToMany(mappedBy = "admin")
    private List<Operation> operations;

    @OneToMany(mappedBy = "admin")
    private List<Notification> notifications;

    @OneToMany(mappedBy = "admin")
    private List<Mission> missions;

    @OneToMany(mappedBy = "admin")
    private List<Freelancer> freelancers;

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

    public Pays getPays() {
        return pays;
    }

    public void setPays(Pays pays) {
        this.pays = pays;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Recruteur> getRecruteurs() {
        return recruteurs;
    }

    public void setRecruteurs(List<Recruteur> recruteurs) {
        this.recruteurs = recruteurs;
    }

    public List<Paiement> getPaiements() {
        return paiements;
    }

    public void setPaiements(List<Paiement> paiements) {
        this.paiements = paiements;
    }

    public List<Operation> getOperations() {
        return operations;
    }

    public void setOperations(List<Operation> operations) {
        this.operations = operations;
    }

    public List<Notification> getNotifications() {
        return notifications;
    }

    public void setNotifications(List<Notification> notifications) {
        this.notifications = notifications;
    }

    public List<Mission> getMissions() {
        return missions;
    }

    public void setMissions(List<Mission> missions) {
        this.missions = missions;
    }

    public List<Freelancer> getFreelancers() {
        return freelancers;
    }

    public void setFreelancers(List<Freelancer> freelancers) {
        this.freelancers = freelancers;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Admin() {
    }

    public Admin(long id) {
        this.id = id;
    }

    public Admin(long id, String nom, String prenom, Pays pays, User user, List<Recruteur> recruteurs, List<Paiement> paiements, List<Operation> operations, List<Notification> notifications, List<Mission> missions, List<Freelancer> freelancers) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.pays = pays;
        this.user = user;
        this.recruteurs = recruteurs;
        this.paiements = paiements;
        this.operations = operations;
        this.notifications = notifications;
        this.missions = missions;
        this.freelancers = freelancers;
    }
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) id;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Admin)) {
            return false;
        }
        Admin other = (Admin) object;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Admin{" + "id=" + id + ", nom=" + nom + ", prenom=" + prenom + '}';
    }

    
    
}
