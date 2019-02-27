package marketing.dao;

import marketing.interfaces.Orm;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaDao<PO extends Orm> {

    protected EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("marketing");

}
