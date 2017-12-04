/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.math.BigDecimal;
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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Merle
 */
@Entity
@Table(name = "article")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Article.findAll", query = "SELECT a FROM Article a"),
    @NamedQuery(name = "Article.findByArticleid", query = "SELECT a FROM Article a WHERE a.articleid = :articleid"),
    @NamedQuery(name = "Article.findByNom", query = "SELECT a FROM Article a WHERE a.nom = :nom"),
    @NamedQuery(name = "Article.findByPrix", query = "SELECT a FROM Article a WHERE a.prix = :prix")})
public class Article implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "articleid")
    private Long articleid;
    @Size(max = 255)
    @Column(name = "nom")
    private String nom;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "prix")
    private BigDecimal prix;
    @OneToMany(mappedBy = "articleFk")
    private Collection<Lignecommande> lignecommandeCollection;
    @JoinColumn(name = "produit_fk", referencedColumnName = "produitid")
    @ManyToOne
    private Produit produitFk;
    @JoinColumn(name = "stock_fk", referencedColumnName = "stockid")
    @ManyToOne
    private Stock stockFk;

    public Article() {
    }

    public Article(Long articleid) {
        this.articleid = articleid;
    }

    public Article(Long articleid, BigDecimal prix) {
        this.articleid = articleid;
        this.prix = prix;
    }

    public Long getArticleid() {
        return articleid;
    }

    public void setArticleid(Long articleid) {
        this.articleid = articleid;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public BigDecimal getPrix() {
        return prix;
    }

    public void setPrix(BigDecimal prix) {
        this.prix = prix;
    }

    @XmlTransient
    public Collection<Lignecommande> getLignecommandeCollection() {
        return lignecommandeCollection;
    }

    public void setLignecommandeCollection(Collection<Lignecommande> lignecommandeCollection) {
        this.lignecommandeCollection = lignecommandeCollection;
    }

    public Produit getProduitFk() {
        return produitFk;
    }

    public void setProduitFk(Produit produitFk) {
        this.produitFk = produitFk;
    }

    public Stock getStockFk() {
        return stockFk;
    }

    public void setStockFk(Stock stockFk) {
        this.stockFk = stockFk;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (articleid != null ? articleid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Article)) {
            return false;
        }
        Article other = (Article) object;
        if ((this.articleid == null && other.articleid != null) || (this.articleid != null && !this.articleid.equals(other.articleid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Article[ articleid=" + articleid + " ]";
    }

    
    
}
