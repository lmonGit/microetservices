/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Merle
 */
@Entity
@Table(name = "commande")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Commande.findAll", query = "SELECT c FROM Commande c"),
    @NamedQuery(name = "Commande.findByCommandeid", query = "SELECT c FROM Commande c WHERE c.commandeid = :commandeid"),
    @NamedQuery(name = "Commande.findByDatecommande", query = "SELECT c FROM Commande c WHERE c.datecommande = :datecommande")})
public class Commande implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "commandeid")
    private Long commandeid;
    @Column(name = "datecommande")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datecommande;
    @JoinTable(name = "lignecommande_tj", joinColumns = {
        @JoinColumn(name = "commande_fk", referencedColumnName = "commandeid")}, inverseJoinColumns = {
        @JoinColumn(name = "lignecommande_fk", referencedColumnName = "lignecommandeid")})
    @ManyToMany
    private Collection<Lignecommande> lignecommandeCollection;
    @JoinColumn(name = "adresse_fk", referencedColumnName = "adresseid")
    @ManyToOne
    private Adresse adresseFk;
    @JoinColumn(name = "utilisateur_fk", referencedColumnName = "utilisateurid")
    @ManyToOne
    private Utilisateur utilisateurFk;

    public Commande() {
    }

    public Commande(Long commandeid) {
        this.commandeid = commandeid;
    }

    public Long getCommandeid() {
        return commandeid;
    }

    public void setCommandeid(Long commandeid) {
        this.commandeid = commandeid;
    }

    public Date getDatecommande() {
        return datecommande;
    }

    public void setDatecommande(Date datecommande) {
        this.datecommande = datecommande;
    }

    @XmlTransient
    public Collection<Lignecommande> getLignecommandeCollection() {
        return lignecommandeCollection;
    }

    public void setLignecommandeCollection(Collection<Lignecommande> lignecommandeCollection) {
        this.lignecommandeCollection = lignecommandeCollection;
    }

    public Adresse getAdresseFk() {
        return adresseFk;
    }

    public void setAdresseFk(Adresse adresseFk) {
        this.adresseFk = adresseFk;
    }

    public Utilisateur getUtilisateurFk() {
        return utilisateurFk;
    }

    public void setUtilisateurFk(Utilisateur utilisateurFk) {
        this.utilisateurFk = utilisateurFk;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (commandeid != null ? commandeid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Commande)) {
            return false;
        }
        Commande other = (Commande) object;
        if ((this.commandeid == null && other.commandeid != null) || (this.commandeid != null && !this.commandeid.equals(other.commandeid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Commande[ commandeid=" + commandeid + " ]";
    }
    
}
