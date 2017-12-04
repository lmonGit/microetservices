package entity;

import entity.Article;
import entity.Commande;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-24T07:03:54")
@StaticMetamodel(Lignecommande.class)
public class Lignecommande_ { 

    public static volatile SingularAttribute<Lignecommande, Article> articleFk;
    public static volatile SingularAttribute<Lignecommande, Long> quantité;
    public static volatile SingularAttribute<Lignecommande, Long> lignecommandeid;
    public static volatile CollectionAttribute<Lignecommande, Commande> commandeCollection;

}