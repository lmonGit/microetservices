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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Merle
 */
@Entity
@Table(name = "catalogue")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Catalogue.findAll", query = "SELECT c FROM Catalogue c"),
    @NamedQuery(name = "Catalogue.findByCatalogueid", query = "SELECT c FROM Catalogue c WHERE c.catalogueid = :catalogueid"),
    @NamedQuery(name = "Catalogue.findByDescription", query = "SELECT c FROM Catalogue c WHERE c.description = :description"),
    @NamedQuery(name = "Catalogue.findByNom", query = "SELECT c FROM Catalogue c WHERE c.nom = :nom")})
public class Catalogue implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "catalogueid")
    private Long catalogueid;
    @Size(max = 255)
    @Column(name = "description")
    private String description;
    @Size(max = 255)
    @Column(name = "nom")
    private String nom;
    @OneToMany(mappedBy = "catalogueFk")
    private Collection<Produit> produitCollection;

    public Catalogue() {
    }

    public Catalogue(Long catalogueid) {
        this.catalogueid = catalogueid;
    }

    public Long getCatalogueid() {
        return catalogueid;
    }

    public void setCatalogueid(Long catalogueid) {
        this.catalogueid = catalogueid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @XmlTransient
    public Collection<Produit> getProduitCollection() {
        return produitCollection;
    }

    public void setProduitCollection(Collection<Produit> produitCollection) {
        this.produitCollection = produitCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (catalogueid != null ? catalogueid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Catalogue)) {
            return false;
        }
        Catalogue other = (Catalogue) object;
        if ((this.catalogueid == null && other.catalogueid != null) || (this.catalogueid != null && !this.catalogueid.equals(other.catalogueid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Catalogue[ catalogueid=" + catalogueid + " ]";
    }
    
}
