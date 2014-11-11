package com.wifi.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Transactional(propagation=Propagation.SUPPORTS, readOnly=true)
public interface BaseService {
	
	public <T>  void  createEntity(T  entity);
	
	public <T>  T updateEntity(T entity);
	
	public <T> void deleteEntity(Class< ? extends Serializable> clazz, Long entityId);
	
	public  <T> T getEntity(Class< ? extends Serializable> clazz, Long entityId);
	
	public <T> List<T> searchEntity(Class<? extends Serializable> clazz, String propertyName, String propertyValue);
		

}
