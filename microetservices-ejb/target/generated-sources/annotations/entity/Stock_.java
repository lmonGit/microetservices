package entity;

import entity.Article;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-24T07:03:54")
@StaticMetamodel(Stock.class)
public class Stock_ { 

    public static volatile CollectionAttribute<Stock, Article> articleCollection;
    public static volatile SingularAttribute<Stock, Integer> quantité;
    public static volatile SingularAttribute<Stock, Long> stockid;

}