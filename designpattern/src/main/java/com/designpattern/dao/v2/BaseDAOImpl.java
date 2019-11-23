package com.designpattern.dao.v2;

import java.lang.reflect.ParameterizedType;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author MSA
 */

public abstract class BaseDAOImpl<T extends BaseEntity> implements BaseDAO<T> {
	private static final Logger logger = LoggerFactory.getLogger(BaseDAOImpl.class);
	
	private Map<Long, BaseEntity> mapObject = new HashMap<>();
	private Map<String, Map<Long, BaseEntity>> mapTableObject = new HashMap<>();
	
    private Class<T> entityClass;
    
    public BaseDAOImpl() {
    	this.entityClass = ((Class<T>) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[0]);
    }
    
	public Stream<T> getAll() throws Exception {
		Map<Long, BaseEntity> map = mapTableObject.get(getEntityClass().getName());
		
		return (Stream<T>) map.values().stream();
	}
	
	public Optional<T> getById(int id) throws Exception {
		return null;
	}
	
	public void add(T entity) throws Exception {
		mapObject.put(getAll().count(), entity);
		mapTableObject.put(entityClass.getName(), mapObject);
	}

	public void update(T entity) throws Exception {
		
	}

	public void delete(T entity) throws Exception {
	}

	public Class<T> getEntityClass() {
		return entityClass;
	}
}