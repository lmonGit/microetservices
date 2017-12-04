package entity;

import entity.Adresse;
import entity.Lignecommande;
import entity.Utilisateur;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-24T07:03:54")
@StaticMetamodel(Commande.class)
public class Commande_ { 

    public static volatile CollectionAttribute<Commande, Lignecommande> lignecommandeCollection;
    public static volatile SingularAttribute<Commande, Date> datecommande;
    public static volatile SingularAttribute<Commande, Long> commandeid;
    public static volatile SingularAttribute<Commande, Adresse> adresseFk;
    public static volatile SingularAttribute<Commande, Utilisateur> utilisateurFk;

}