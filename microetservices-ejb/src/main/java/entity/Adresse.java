/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Merle
 */
@Entity
@Table(name = "adresse")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Adresse.findAll", query = "SELECT a FROM Adresse a"),
    @NamedQuery(name = "Adresse.findByAdresseid", query = "SELECT a FROM Adresse a WHERE a.adresseid = :adresseid"),
    @NamedQuery(name = "Adresse.findByNumero", query = "SELECT a FROM Adresse a WHERE a.numero = :numero"),
    @NamedQuery(name = "Adresse.findByRue", query = "SELECT a FROM Adresse a WHERE a.rue = :rue"),
    @NamedQuery(name = "Adresse.findByCodepostal", query = "SELECT a FROM Adresse a WHERE a.codepostal = :codepostal"),
    @NamedQuery(name = "Adresse.findByDepartement", query = "SELECT a FROM Adresse a WHERE a.departement = :departement"),
    @NamedQuery(name = "Adresse.findByVille", query = "SELECT a FROM Adresse a WHERE a.ville = :ville"),
    @NamedQuery(name = "Adresse.findByPays", query = "SELECT a FROM Adresse a WHERE a.pays = :pays")})
public class Adresse implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "adresseid")
    private Long adresseid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "numero")
    private long numero;
    @Size(max = 255)
    @Column(name = "rue")
    private String rue;
    @Basic(optional = false)
    @NotNull
    @Column(name = "codepostal")
    private long codepostal;
    @Size(max = 255)
    @Column(name = "departement")
    private String departement;
    @Size(max = 255)
    @Column(name = "ville")
    private String ville;
    @Size(max = 255)
    @Column(name = "pays")
    private String pays;
    @OneToMany(mappedBy = "adresseFk")
    private Collection<Utilisateur> utilisateurCollection;
    @OneToMany(mappedBy = "adresseFk")
    private Collection<Commande> commandeCollection;

    public Adresse() {
    }

    public Adresse(Long adresseid) {
        this.adresseid = adresseid;
    }

    public Adresse(Long adresseid, long numero, long codepostal) {
        this.adresseid = adresseid;
        this.numero = numero;
        this.codepostal = codepostal;
    }

    public Long getAdresseid() {
        return adresseid;
    }

    public void setAdresseid(Long adresseid) {
        this.adresseid = adresseid;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public long getCodepostal() {
        return codepostal;
    }

    public void setCodepostal(long codepostal) {
        this.codepostal = codepostal;
    }

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    @XmlTransient
    public Collection<Utilisateur> getUtilisateurCollection() {
        return utilisateurCollection;
    }

    public void setUtilisateurCollection(Collection<Utilisateur> utilisateurCollection) {
        this.utilisateurCollection = utilisateurCollection;
    }

    @XmlTransient
    public Collection<Commande> getCommandeCollection() {
        return commandeCollection;
    }

    public void setCommandeCollection(Collection<Commande> commandeCollection) {
        this.commandeCollection = commandeCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (adresseid != null ? adresseid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Adresse)) {
            return false;
        }
        Adresse other = (Adresse) object;
        if ((this.adresseid == null && other.adresseid != null) || (this.adresseid != null && !this.adresseid.equals(other.adresseid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Adresse[ adresseid=" + adresseid + " ]";
    }
    
}
