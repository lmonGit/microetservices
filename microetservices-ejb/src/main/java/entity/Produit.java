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
@Table(name = "produit")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Produit.findAll", query = "SELECT p FROM Produit p"),
    @NamedQuery(name = "Produit.findByProduitid", query = "SELECT p FROM Produit p WHERE p.produitid = :produitid"),
    @NamedQuery(name = "Produit.findByDescription", query = "SELECT p FROM Produit p WHERE p.description = :description"),
    @NamedQuery(name = "Produit.findByNom", query = "SELECT p FROM Produit p WHERE p.nom = :nom")})
public class Produit implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "produitid")
    private Long produitid;
    @Size(max = 255)
    @Column(name = "description")
    private String description;
    @Size(max = 255)
    @Column(name = "nom")
    private String nom;
    @JoinColumn(name = "catalogue_fk", referencedColumnName = "catalogueid")
    @ManyToOne
    private Catalogue catalogueFk;
    @OneToMany(mappedBy = "produitFk")
    private Collection<Article> articleCollection;

    public Produit() {
    }

    public Produit(Long produitid) {
        this.produitid = produitid;
    }

    public Long getProduitid() {
        return produitid;
    }

    public void setProduitid(Long produitid) {
        this.produitid = produitid;
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

    public Catalogue getCatalogueFk() {
        return catalogueFk;
    }

    public void setCatalogueFk(Catalogue catalogueFk) {
        this.catalogueFk = catalogueFk;
    }

    @XmlTransient
    public Collection<Article> getArticleCollection() {
        return articleCollection;
    }

    public void setArticleCollection(Collection<Article> articleCollection) {
        this.articleCollection = articleCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (produitid != null ? produitid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Produit)) {
            return false;
        }
        Produit other = (Produit) object;
        if ((this.produitid == null && other.produitid != null) || (this.produitid != null && !this.produitid.equals(other.produitid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Produit[ produitid=" + produitid + " ]";
    }
    
}
