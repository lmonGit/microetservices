package entity;

import entity.Commande;
import entity.Utilisateur;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-24T07:03:54")
@StaticMetamodel(Adresse.class)
public class Adresse_ { 

    public static volatile CollectionAttribute<Adresse, Utilisateur> utilisateurCollection;
    public static volatile SingularAttribute<Adresse, String> ville;
    public static volatile SingularAttribute<Adresse, String> rue;
    public static volatile SingularAttribute<Adresse, String> departement;
    public static volatile SingularAttribute<Adresse, Long> numero;
    public static volatile SingularAttribute<Adresse, Long> codepostal;
    public static volatile SingularAttribute<Adresse, Long> adresseid;
    public static volatile CollectionAttribute<Adresse, Commande> commandeCollection;
    public static volatile SingularAttribute<Adresse, String> pays;

}