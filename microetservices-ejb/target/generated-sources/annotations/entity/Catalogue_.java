package entity;

import entity.Produit;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-24T07:03:54")
@StaticMetamodel(Catalogue.class)
public class Catalogue_ { 

    public static volatile SingularAttribute<Catalogue, Long> catalogueid;
    public static volatile CollectionAttribute<Catalogue, Produit> produitCollection;
    public static volatile SingularAttribute<Catalogue, String> description;
    public static volatile SingularAttribute<Catalogue, String> nom;

}