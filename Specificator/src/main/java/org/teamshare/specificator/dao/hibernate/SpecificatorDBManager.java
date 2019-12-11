package org.teamshare.specificator.dao.hibernate;

import org.hibernate.query.Query;
import org.teamshare.specificator.dao.SpecificatorDAO;
import org.teamshare.specificator.dao.entity.Specificator;
import org.teamshare.specificator.dao.entity.SpecificatorColumns;
import org.teamshare.specificator.utils.HibernateUtils;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;
import java.util.List;

@HibernateSpecificatorManagerQualifier
public class SpecificatorDBManager implements SpecificatorDAO {

    @Override
    @Transactional
    public void addSpecificator(Specificator specificator) {
        HibernateUtils.getCurrentSession().save(specificator);
    }

    @Override
    @Transactional
    public void updateSpecificator(Specificator specificator) {
        HibernateUtils.getCurrentSession().saveOrUpdate(specificator);
    }

    @Override
    @Transactional
    public void deleteSpecificator(Specificator specificator) {
        HibernateUtils.getCurrentSession().delete(specificator);
    }

    @Override
    @Transactional
    public Specificator getSpecificatorById(Long id) {
        return HibernateUtils.getCurrentSession().get(Specificator.class, id);
    }

    @Override
    @Transactional
    public Specificator getSpecificatorByHash(String hash) {
        CriteriaBuilder criteriaBuilder = HibernateUtils.createCriteriaBuilder();
        CriteriaQuery<Specificator> criteriaQuery = criteriaBuilder.createQuery(Specificator.class);
        Root<Specificator> root = criteriaQuery.from(Specificator.class);

        criteriaQuery.select(root).where(criteriaBuilder.equal(root.get(SpecificatorColumns.HASH_COLUMN), hash));

        Query<Specificator> query = HibernateUtils.getCurrentSession().createQuery(criteriaQuery);
        return query.getSingleResult();
    }

    @Override
    @Transactional
    public List<Specificator> getSpecificators() {
        CriteriaBuilder criteriaBuilder = HibernateUtils.createCriteriaBuilder();
        CriteriaQuery<Specificator> criteriaQuery = criteriaBuilder.createQuery(Specificator.class);
        Root<Specificator> root = criteriaQuery.from(Specificator.class);

        criteriaQuery.select(root);

        Query<Specificator> query = HibernateUtils.getCurrentSession().createQuery(criteriaQuery);
        return query.getResultList();
    }
}
