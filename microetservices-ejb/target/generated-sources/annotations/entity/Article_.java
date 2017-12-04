package entity;

import entity.Lignecommande;
import entity.Produit;
import entity.Stock;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-24T07:03:54")
@StaticMetamodel(Article.class)
public class Article_ { 

    public static volatile CollectionAttribute<Article, Lignecommande> lignecommandeCollection;
    public static volatile SingularAttribute<Article, Stock> stockFk;
    public static volatile SingularAttribute<Article, BigDecimal> prix;
    public static volatile SingularAttribute<Article, Long> articleid;
    public static volatile SingularAttribute<Article, String> nom;
    public static volatile SingularAttribute<Article, Produit> produitFk;

}