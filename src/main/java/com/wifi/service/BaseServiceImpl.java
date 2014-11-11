package com.wifi.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.wifi.dao.BaseDao;

@Service
public class BaseServiceImpl implements BaseService {
	
	@Autowired
	private BaseDao hibernateDao;

	@Override
	@Transactional(propagation=Propagation.REQUIRED, readOnly=false)
	public <T> void createEntity(T entity) {
		hibernateDao.createEntity(entity);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED, readOnly=false)
	public <T> T updateEntity(T entity) {
		return hibernateDao.updateEntity(entity);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED, readOnly=false)
	public <T> void deleteEntity(Class<? extends Serializable> clazz, Long entityId) {
		hibernateDao.deleteEntity(clazz, entityId);
	}

	@Override
	public <T> T getEntity(Class<? extends Serializable> clazz, Long entityId) {
		return hibernateDao.getEntity(clazz, entityId);
	}

	@Override
	public <T> List<T> searchEntity(Class<? extends Serializable> clazz, String propertyName, String propertyValue) {
		return hibernateDao.searchEntity(clazz, propertyName, propertyValue);
	}

}
