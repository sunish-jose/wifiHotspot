package com.wifi.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional(propagation=Propagation.SUPPORTS, readOnly=true)
public class HibernateDao implements BaseDao {

	@Autowired
	private SessionFactory sessionFactory;

	private Session currentSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED, readOnly=false)
	public <T> void createEntity(T entity) {
		currentSession().save(entity);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED, readOnly=false)
	public <T> T updateEntity(T entity) {
		currentSession().update(entity);
		return entity;
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED, readOnly=false)
	public  <T> void deleteEntity(Class< ? extends Serializable> clazz, Long entityId) {
		T entity = getEntity(clazz, entityId);
		currentSession().delete(entity);
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> T getEntity(Class< ? extends Serializable> clazz, Long entityId) {
		T entity = (T)currentSession().get(clazz, entityId);
		return entity;
	}
	@SuppressWarnings("unchecked")
	public <T> List<T> searchEntity(Class<? extends Serializable> clazz, String propertyName, String propertyValue){
		List<T> entities = currentSession().createCriteria(clazz).add(Restrictions.like(propertyName, "%"+propertyValue+"%")).list();
		return entities;
	}

}
