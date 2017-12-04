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
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Merle
 */
@Entity
@Table(name = "lignecommande")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Lignecommande.findAll", query = "SELECT l FROM Lignecommande l"),
    @NamedQuery(name = "Lignecommande.findByLignecommandeid", query = "SELECT l FROM Lignecommande l WHERE l.lignecommandeid = :lignecommandeid"),
    @NamedQuery(name = "Lignecommande.findByQuantit\u00e9", query = "SELECT l FROM Lignecommande l WHERE l.quantit\u00e9 = :quantit\u00e9")})
public class Lignecommande implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "lignecommandeid")
    private Long lignecommandeid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "quantit\u00e9")
    private long quantité;
    @ManyToMany(mappedBy = "lignecommandeCollection")
    private Collection<Commande> commandeCollection;
    @JoinColumn(name = "article_fk", referencedColumnName = "articleid")
    @ManyToOne
    private Article articleFk;

    public Lignecommande() {
    }

    public Lignecommande(Long lignecommandeid) {
        this.lignecommandeid = lignecommandeid;
    }

    public Lignecommande(Long lignecommandeid, long quantité) {
        this.lignecommandeid = lignecommandeid;
        this.quantité = quantité;
    }

    public Long getLignecommandeid() {
        return lignecommandeid;
    }

    public void setLignecommandeid(Long lignecommandeid) {
        this.lignecommandeid = lignecommandeid;
    }

    public long getQuantité() {
        return quantité;
    }

    public void setQuantité(long quantité) {
        this.quantité = quantité;
    }

    @XmlTransient
    public Collection<Commande> getCommandeCollection() {
        return commandeCollection;
    }

    public void setCommandeCollection(Collection<Commande> commandeCollection) {
        this.commandeCollection = commandeCollection;
    }

    public Article getArticleFk() {
        return articleFk;
    }

    public void setArticleFk(Article articleFk) {
        this.articleFk = articleFk;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (lignecommandeid != null ? lignecommandeid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lignecommande)) {
            return false;
        }
        Lignecommande other = (Lignecommande) object;
        if ((this.lignecommandeid == null && other.lignecommandeid != null) || (this.lignecommandeid != null && !this.lignecommandeid.equals(other.lignecommandeid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Lignecommande[ lignecommandeid=" + lignecommandeid + " ]";
    }
    
}
