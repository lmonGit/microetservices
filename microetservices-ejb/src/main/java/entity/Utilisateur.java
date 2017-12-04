/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Merle
 */
@Entity
@Table(name = "utilisateur")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Utilisateur.findAll", query = "SELECT u FROM Utilisateur u"),
    @NamedQuery(name = "Utilisateur.findByUtilisateurid", query = "SELECT u FROM Utilisateur u WHERE u.utilisateurid = :utilisateurid"),
    @NamedQuery(name = "Utilisateur.findByTypeUtil", query = "SELECT u FROM Utilisateur u WHERE u.typeUtil = :typeUtil"),
    @NamedQuery(name = "Utilisateur.findByNom", query = "SELECT u FROM Utilisateur u WHERE u.nom = :nom"),
    @NamedQuery(name = "Utilisateur.findByPrenom", query = "SELECT u FROM Utilisateur u WHERE u.prenom = :prenom"),
    @NamedQuery(name = "Utilisateur.findByLogin", query = "SELECT u FROM Utilisateur u WHERE u.login = :login"),
    @NamedQuery(name = "Utilisateur.findByPassword", query = "SELECT u FROM Utilisateur u WHERE u.password = :password"),
    @NamedQuery(name = "Utilisateur.findByEmail", query = "SELECT u FROM Utilisateur u WHERE u.email = :email"),
    @NamedQuery(name = "Utilisateur.findByTelephone", query = "SELECT u FROM Utilisateur u WHERE u.telephone = :telephone"),
    @NamedQuery(name = "Utilisateur.findByFax", query = "SELECT u FROM Utilisateur u WHERE u.fax = :fax"),
    @NamedQuery(name = "Utilisateur.findByTitre", query = "SELECT u FROM Utilisateur u WHERE u.titre = :titre")})
public class Utilisateur implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "utilisateurid")
    private Long utilisateurid;
    @Size(max = 1)
    @Column(name = "type_util")
    private String typeUtil;
    @Size(max = 255)
    @Column(name = "nom")
    private String nom;
    @Size(max = 255)
    @Column(name = "prenom")
    private String prenom;
    @Size(max = 255)
    @Column(name = "login")
    private String login;
    @Size(max = 255)
    @Column(name = "password")
    private String password;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 255)
    @Column(name = "email")
    private String email;
    @Column(name = "telephone")
    private BigInteger telephone;
    @Column(name = "fax")
    private BigInteger fax;
    @Size(max = 255)
    @Column(name = "titre")
    private String titre;
    @JoinColumn(name = "adresse_fk", referencedColumnName = "adresseid")
    @ManyToOne
    private Adresse adresseFk;
    @OneToMany(mappedBy = "utilisateurFk")
    private Collection<Commande> commandeCollection;

    public Utilisateur() {
    }

    public Utilisateur(Long utilisateurid) {
        this.utilisateurid = utilisateurid;
    }

    public Long getUtilisateurid() {
        return utilisateurid;
    }

    public void setUtilisateurid(Long utilisateurid) {
        this.utilisateurid = utilisateurid;
    }

    public String getTypeUtil() {
        return typeUtil;
    }

    public void setTypeUtil(String typeUtil) {
        this.typeUtil = typeUtil;
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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public BigInteger getTelephone() {
        return telephone;
    }

    public void setTelephone(BigInteger telephone) {
        this.telephone = telephone;
    }

    public BigInteger getFax() {
        return fax;
    }

    public void setFax(BigInteger fax) {
        this.fax = fax;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public Adresse getAdresseFk() {
        return adresseFk;
    }

    public void setAdresseFk(Adresse adresseFk) {
        this.adresseFk = adresseFk;
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
        hash += (utilisateurid != null ? utilisateurid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Utilisateur)) {
            return false;
        }
        Utilisateur other = (Utilisateur) object;
        if ((this.utilisateurid == null && other.utilisateurid != null) || (this.utilisateurid != null && !this.utilisateurid.equals(other.utilisateurid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Utilisateur[ utilisateurid=" + utilisateurid + " ]";
    }
    
}
