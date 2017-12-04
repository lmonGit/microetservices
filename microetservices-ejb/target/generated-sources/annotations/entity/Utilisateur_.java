package entity;

import entity.Adresse;
import entity.Commande;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-24T07:03:54")
@StaticMetamodel(Utilisateur.class)
public class Utilisateur_ { 

    public static volatile SingularAttribute<Utilisateur, String> password;
    public static volatile SingularAttribute<Utilisateur, String> titre;
    public static volatile SingularAttribute<Utilisateur, Long> utilisateurid;
    public static volatile SingularAttribute<Utilisateur, Adresse> adresseFk;
    public static volatile SingularAttribute<Utilisateur, BigInteger> telephone;
    public static volatile SingularAttribute<Utilisateur, String> typeUtil;
    public static volatile SingularAttribute<Utilisateur, String> login;
    public static volatile SingularAttribute<Utilisateur, BigInteger> fax;
    public static volatile SingularAttribute<Utilisateur, String> nom;
    public static volatile SingularAttribute<Utilisateur, String> prenom;
    public static volatile CollectionAttribute<Utilisateur, Commande> commandeCollection;
    public static volatile SingularAttribute<Utilisateur, String> email;

}