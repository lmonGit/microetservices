package entity;

import entity.Article;
import entity.Catalogue;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-24T07:03:54")
@StaticMetamodel(Produit.class)
public class Produit_ { 

    public static volatile CollectionAttribute<Produit, Article> articleCollection;
    public static volatile SingularAttribute<Produit, Long> produitid;
    public static volatile SingularAttribute<Produit, Catalogue> catalogueFk;
    public static volatile SingularAttribute<Produit, String> description;
    public static volatile SingularAttribute<Produit, String> nom;

}